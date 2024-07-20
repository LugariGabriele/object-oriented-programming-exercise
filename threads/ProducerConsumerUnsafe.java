package threads;

import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Write a program implementing two threads interacting via a producer-consumer communication scheme.
 * The main thread, creates both producer and consumer, waits 100 ms, and gracefully terminates them (see Thread.interrupt() method).
 * More specifically, the producer pushes integer objects on a shared queue, while the consumer fetches them.
 * The consumer, before terminating, prints the total number of integers fetched from the queue (as represented below).
 * Both producer and consumer should not be synchronized on the shared queue but, instead, have to use a thread-safe collection.
 */
public class ProducerConsumerUnsafe {
    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> dq = new ConcurrentLinkedDeque<>();
        Thread productor = new ProductorUnsafe(dq);
        Thread consumer = new ConsumerUnSafe(dq);

        productor.start();
        consumer.start();

        Thread.sleep(100L);

        productor.interrupt();
        consumer.interrupt();

        productor.join();
        consumer.join();

    }

    public static class ProductorUnsafe extends Thread {
        final Deque<Integer> integerDeque;

        public ProductorUnsafe(Deque<Integer> integerDeque) {
            super();
            this.integerDeque = integerDeque;
        }

        @Override
        public void run() {
            int i = 0;
            while (!interrupted()) {
                integerDeque.add(i++);
            }
        }
    }

    public static class ConsumerUnSafe extends Thread {
        final Deque<Integer> integerDeque;

        public ConsumerUnSafe(Deque<Integer> integerDeque) {
            super();
            this.integerDeque = integerDeque;
        }

        @Override
        public void run() {
            while (!interrupted()) {
                int lastValue = 0;
                try {
                    lastValue = integerDeque.removeLast();
                } catch (NoSuchElementException e) {
                    Thread.yield();
                }
                System.out.printf("Total number of consumed elements: %d", lastValue);
            }
        }
    }

}
