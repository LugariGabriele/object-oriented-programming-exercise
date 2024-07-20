package threads;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

/**
 * Write a program in which the main thread starts a child thread which, every 15 minutes,
 * checks if the day of the month has changed and eventually prints a message (see Thread.sleep(), java.time.LocalDate).
 * The main thread do not wait, but terminates immediately after starting the child thread
 * (bad practice! the main thread should always wait for its children).
 */
public class DayChangeCheck extends Thread {
    public static void main(String[] args) throws InterruptedException {
        DayChangeCheck child = new DayChangeCheck();
        child.start();

    }

    @Override
    public void run() {
        System.out.println("child started");
        while (!interrupted()) {
            LocalDate lastcheck = LocalDate.now();

            try {
                Thread.sleep(TimeUnit.MINUTES.toMillis(15));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            LocalDate now = LocalDate.now();
            if (now.getDayOfMonth() != lastcheck.getDayOfMonth()) {
                System.out.println("day has changed");
            } else {
                System.out.println("days is the same");
            }
            System.out.println("child terminated");
        }
    }

}
