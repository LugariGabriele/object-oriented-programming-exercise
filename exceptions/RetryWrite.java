package exceptions;

/**
 * The following RetryWrite class contains a write() method for writing a message over a network connection which might fail
 * (in this example it fails 66% of the time). Because we know network connections sometimes fail, we do not want to call it directly.
 * Instead, we use an intermediate writeWithTries() which, if write() fails, calls it again until the specified number of retries (maxTries)
 * has been reached. The main() method receives an exception only if all retries fail. Complete the writeWithTries() method to make the code below work.
 */

import java.io.IOException;
import java.util.random.RandomGenerator;

public class RetryWrite {
    private static final RandomGenerator RND = RandomGenerator.getDefault();

    public static void main(String[] args) {
        try {
            writeWithTries(3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Calls the write() method. If it fails, retries the call maxTries times
     *
     * @param maxTries the maximum number of retries
     */
    public static void writeWithTries(int maxTries) {
        // to be completed
        int count = 0;
        while (true) {
            try {
                write("try n°" + count);
                break;
            } catch (IOException e) {
                System.out.println("write failed. Retry");
                count++;
                if (count == maxTries) {
                    throw new RuntimeException("write() failed after " + count + " retries");
                }
            }
        }
    }

    /**
     * Simulates a write with 66% probability of failing
     *
     * @param message the message to write
     * @throws IOException when write fails
     */
    public static void write(String message) throws IOException {
        if (RND.nextDouble() < 0.66) {
            throw new IOException("Unable to send: " + message);
        }
    }
}
