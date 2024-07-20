package threads;

import java.util.concurrent.TimeUnit;

/**
 * Write a program in which the main thread starts two child threads, waits 100 ms, and gracefully terminates both of them.
 * Each child thread, during its lifespan, prints the following messages where T1 is its name and
 * the milliseconds represent the time elapsed since the thread first started.
 */
public class StartStop extends Thread {
    public StartStop(String name) {
        super(name);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new StartStop("T1");
        Thread t2 = new StartStop("T2");

        t1.start();
        t2.start();

        Thread.sleep(100L);

        t1.interrupt();
        t2.interrupt();

        t1.join();
        t2.join();
    }

    @Override
    public void run() {
        long startTime = System.nanoTime();
        System.out.println(getName() + "started");
        while (!interrupted()) {
            System.out.printf("%s running since %d ms\n", getName(), TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime));
        }
        System.out.println(getName() + "terminated");
    }
}
