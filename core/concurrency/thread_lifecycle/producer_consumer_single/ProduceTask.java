package core.concurrency.thread_lifecycle.producer_consumer_single;

public class ProduceTask implements Runnable {
  SharedResource sharedResource;

  public ProduceTask(SharedResource sharedResource) {
    this.sharedResource = sharedResource;
  }

  @Override
  public void run() {
    System.out.println("Producer thread: " + Thread.currentThread().getName());
    try {
      Thread.sleep(5000l);
    } catch(Exception e) {

    }
    sharedResource.addItem();
  }
}
