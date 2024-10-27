package core.concurrency.thread_lifecycle.producer_consumer_single;

public class ConsumeTask implements Runnable {
  SharedResource sharedResource;

    public ConsumeTask(SharedResource sharedResource) {
      this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
      System.out.println("Consume thread: " + Thread.currentThread().getName());
      sharedResource.ConsumeTask();
    }
}
