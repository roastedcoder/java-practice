package practice.thread_lifecycle.producer_consumer_single;

public class Main {
  public static void main(String[] args) {
    System.out.println();

    SharedResource sharedResource = new SharedResource();

    // create the produce thread.
    ProduceTask produceTask = new ProduceTask(sharedResource);
    Thread produceThread = new Thread(produceTask);

    // create the consume thread.
    ConsumeTask consumeTask = new ConsumeTask(sharedResource);
    Thread consumeThread = new Thread(consumeTask);

    // start both the threads.
    // we can start producer thread first but producer thread already has wait of 5 second.
    consumeThread.start();
    produceThread.start();
  }
}
