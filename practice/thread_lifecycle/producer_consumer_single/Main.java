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

    /*
      Output when JOIN is not used.
      STDOUT:
      **Main Thread completed it's task
        Consume thread: Thread-1
        Producer thread: Thread-0
        ConsumeItem method invoked by: Thread-1
        Thread Thread-1 is waiting now.
        Item added by: Thread-0 and invoking all thread which are waiting.
        Item consumed by: Thread-1

      Main thread would not wait for other thread to complete it's task.

      we use join() for each thread so that main thread can join them to complete their task on their own.
    */

    System.out.println("Main Thread completed it's task");

    try{
      produceThread.join();
      consumeThread.join();
    } catch(Exception e) {

    }
    System.out.println("Main Thread joined other 2 thread.");

    /*
    Output after using join on other 2 threads.
      STDOUT:
        Main Thread completed it's task
        Producer thread: Thread-0
        Consume thread: Thread-1
        ConsumeItem method invoked by: Thread-1
        Thread Thread-1 is waiting now.
        Item added by: Thread-0 and invoking all thread which are waiting.
        Item consumed by: Thread-1
      **Main Thread joined other 2 thread.
    */
  }
}
