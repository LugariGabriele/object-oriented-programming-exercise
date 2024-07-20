package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

/**
 * The exercise proposed in ThreadPool.java suffers a relevant issue.
 * In case of a high number (>> number of physical cores) of tasks, a high number of parallel threads is launched.
 * This practice is not always optimal.
 * Write an alternative version of ThreadPool.java making use of an ExecutorService (see java.util.concurrent.ExecutorService)
 * limiting the number of concurrent threads to a specified amount.
 */
public class ThreadPoolExecutor extends Thread {
    public final static int MAX_TASK = 8;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        RandomGenerator randomGenerator = RandomGenerator.getDefault();

        for (int task = 0; task < MAX_TASK; task++) {
            int taskNumber = task;
            executorService.submit(() -> {
                long start = System.nanoTime();
                System.out.printf("START thread=%s task=%d \n", Thread.currentThread().getName(), taskNumber);
                try {
                    Thread.sleep(randomGenerator.nextInt(1000));
                } catch (InterruptedException ignored) {

                }
                long stop = System.nanoTime();
                System.out.printf("STOP thread=%s task=%d t=%d \n", Thread.currentThread().getName(), taskNumber,
                        TimeUnit.NANOSECONDS.toMillis(stop - start));
            });
        }
        executorService.shutdown();
    }
}
