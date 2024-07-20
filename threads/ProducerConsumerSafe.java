package threads;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Write a program implementing two threads interacting via a producer-consumer communication scheme.
 * The main thread, creates both producer and consumer, waits 100 ms, and gracefully terminates them (see Thread.interrupt() method).
 * More specifically, the producer pushes integer objects on a shared queue, while the consumer fetches them.
 * The consumer, before terminating, prints the total number of integers fetched from the queue (as represented below).
 * Both producer and consumer must be manually synchronized on the shared queue before using it.
 */
public class ProducerConsumerSafe {
    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> dq = new LinkedList<>();
        Thread producer = new ProducerSafe(dq);
        Thread consumer = new consumerSafe(dq);

        producer.start();
        consumer.start();

        Thread.sleep(100L);

        producer.interrupt();
        consumer.interrupt();

        producer.join();
        consumer.join();

    }

    static public class ProducerSafe extends Thread {
        final Deque<Integer> integerDeque;

        public ProducerSafe(Deque<Integer> integerDeque) {
            super();
            this.integerDeque = integerDeque;
        }

        @Override
        public void run() {
            int i = 0;
            while (!interrupted()) {
                synchronized (integerDeque) {
                    integerDeque.add(i++);
                }
            }
        }
    }

    static public class consumerSafe extends Thread {
        final Deque<Integer> integerDeque;

        public consumerSafe(Deque<Integer> integerDeque) {
            super();
            this.integerDeque = integerDeque;
        }

        @Override
        public void run() {
            int lastElement = 0;
            while (!interrupted()) {
                try {
                    synchronized (integerDeque) {
                        lastElement = integerDeque.removeLast();
                    }
                } catch (NoSuchElementException e) {
                    Thread.yield();
                }
                System.out.printf("Total number of consumed elements: %d", lastElement);
            }
        }
    }
}
