package practice.thread_lifecycle.producer_consumer_multiple;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
  Queue<Boolean> queue = new LinkedList<>();
  final Integer bufferSize = 3;

  public synchronized void consume() {
    while(queue.size() <= 0) {
      try {
        System.out.println("Consumer " + Thread.currentThread().getName() + " waiting for item.");
        wait();
      } catch(Exception e) { }
    }
    System.out.println("Consumer " + Thread.currentThread().getName() + " entered, number of items present " + queue.size());
    queue.remove();
  }

  public synchronized  void produce() {
    while(queue.size() >= bufferSize) {
      try {
        System.out.println("Producer  " + Thread.currentThread().getName() + " waiting for item.");
        notifyAll();
      } catch(Exception e) { }
    }
    System.out.println("Producer " + Thread.currentThread().getName() + " entered, number of items present " + queue.size());
    queue.add(true);
  }
}
