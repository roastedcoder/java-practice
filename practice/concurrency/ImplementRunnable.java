package practice.concurrency;

public class ImplementRunnable implements Runnable {

  @Override
  public void run() {
    System.out.println("ImplementRunnable:: Code executed by thread: " + Thread.currentThread().getName());
  }
}
