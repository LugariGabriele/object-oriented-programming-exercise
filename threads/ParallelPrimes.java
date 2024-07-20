package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * The following class implements the Callable<V> interface which is frequently used to collect the return values of methods running on separate threads.
 * Using the code provided, write a program searching prime numbers on a fixed number of parallel threads (see java.util.concurrent.ExecutorService).
 * Each thread, receiving a range to be searched e.g. [0, 1000], [1000, 2000]..., returns a List containing the prime numbers found.
 * The main thread starts the parallel child threads using ExecutorService.invokeAll() and receives a List<Future<List<Integer>>>
 * for fetching the results (see java.util.concurrent.Future<V>).
 */
public class ParallelPrimes {
    public static class PrimeEngine implements Callable<List<Integer>> {
        int start;
        int end;

        public PrimeEngine(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public List<Integer> call() {
            List<Integer> result = new ArrayList<>();
            for (int i = start; i < end; i++) {
                if (isPrime(i)) {
                    result.add(i);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        List<Callable<List<Integer>>>callables = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            callables.add(new PrimeEngine(i*1000,(i+1)*1000));
        }
        List<Future<List<Integer>>> futures = executor.invokeAll(callables);

        Thread.sleep(1000);

        for (Future<List<Integer>> future : futures) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }

}
