package threads;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Write a program printing, every second, the time of day followed by "Hello!"
 * as shown below (see java.time.LocalTime, java.util.concurrent.ScheduledExecutorService).
 */
public class ScheduledExecution extends Thread{
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(()-> System.out.println(LocalTime.now()+" Hello"),0,1000, TimeUnit.MILLISECONDS);
    }
}
