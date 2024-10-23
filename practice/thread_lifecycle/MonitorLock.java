package practice.thread_lifecycle;

public class MonitorLock {

  public synchronized void task1() {
    try {
      System.out.println("Task 1, inside");
      Thread.sleep(10000);
      System.out.println("Task 1, outside");
    } catch (Exception e) {
    }
  }

  public void task2() {
    System.out.println("Task 2, but before synchronized");
    synchronized (this) {
      System.out.println("Task 2, inside synchronized");
    }
  }

  public void task3() {
    System.out.println("Task 3, inside");
  }
}
