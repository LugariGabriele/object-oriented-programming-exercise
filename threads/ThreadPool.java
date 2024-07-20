package threads;

import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

/**
 * Write a program using a Thread[] (an array of Thread objects) for running a fixed number of tasks using the same number of parallel threads.
 * Each thread, prints a message when it starts, sleeps for a random time (< 1 sec)
 * and print another message when it terminates showing the total amount of time it run.
 */
public class ThreadPool extends Thread {
    public static final int MAX_TASKS = 8;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threadPool = new Thread[MAX_TASKS];
        RandomGenerator randomGenerator = RandomGenerator.getDefault();

        for (int task = 0; task < MAX_TASKS; task++) {
            int numberTask= task;
                threadPool[task]=new Thread(()->{
                long start = System.nanoTime();
                    System.out.printf("START thread=%s task=%d \n",Thread.currentThread().getName(),numberTask);
                    try {
                        Thread.sleep(randomGenerator.nextInt(1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    long time = System.nanoTime();
                    System.out.printf("STOP thread=%s task=%d t=%d \n",Thread.currentThread().getName(),numberTask,
                            TimeUnit.NANOSECONDS.toMillis(time - start));
                });
        }
        
        //starting child thread
        for (int i = 0; i <MAX_TASKS ; i++) {
            threadPool[i].start();
        }

        // waiting child threads
        for (int i = 0; i < MAX_TASKS; i++) {
            threadPool[i].join();
        }
    }
}
