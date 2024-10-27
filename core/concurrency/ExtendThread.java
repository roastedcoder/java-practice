package core.concurrency;

public class ExtendThread extends Thread {
  @Override
  public void run() {
    System.out.println("ExtendThread:: code executed by thread: " + Thread.currentThread().getName());
  }
}
