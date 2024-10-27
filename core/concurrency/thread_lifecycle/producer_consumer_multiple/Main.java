package core.concurrency.thread_lifecycle.producer_consumer_multiple;

public class Main {
  public static void main(String[] args) {
    SharedResource sharedResource = new SharedResource();

    // Similar to producer-consumer-single

    for(int i = 0; i < 3; i++) {
      Thread consumerThread = new Thread(() -> {
        try {
          System.out.println("Consumer " + Thread.currentThread().getName() + " start consuming.");
        } catch (Exception e) {
        }
        sharedResource.consume();
      });

      Thread producerThread = new Thread(() -> {
        try {
          System.out.println("Producer " + Thread.currentThread().getName() + " start producing.");
        } catch(Exception e) {}
        sharedResource.produce();
      });
      consumerThread.start();
      producerThread.start();
    }
  }
}
