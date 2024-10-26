package practice.thread_lifecycle.producer_consumer_single;

public class SharedResource {
  boolean itemAvailable = false;

  // synchronized will put monitor lock on addItem
  public synchronized void addItem() {
    itemAvailable = true;
    System.out.println("Item added by: " + Thread.currentThread().getName() + " and invoking all thread which are waiting.");
    notifyAll(); // will invoke all the waiting thread.
  }


  public synchronized void ConsumeTask() {
    System.out.println("ConsumeItem method invoked by: " + Thread.currentThread().getName());

    // using while loop to avoid "Spurious wake-up", sometimes because of system noise.
    // while loop will check again if item is available or not.
    while(!itemAvailable) {
      try{
        System.out.println("Thread " + Thread.currentThread().getName() + " is waiting now.");
        wait(); // release the monitor lock
      } catch (Exception e) {

      }
    }

    // only consumable if wait is resolved by notify method call from consumer thread.
    System.out.println("Item consumed by: " + Thread.currentThread().getName());
    itemAvailable = false;
  }
}
