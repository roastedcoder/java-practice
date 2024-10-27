package practice.concurrency.thread_lifecycle;

public class Main {
  public static void main(String[] args) {
    MonitorLock monitorLock = new MonitorLock();

    Thread t1 = new Thread(() -> {
      monitorLock.task1();
    });

    Thread t2 = new Thread(() -> {
      monitorLock.task2();
    });

    Thread t3 = new Thread(() -> {
      monitorLock.task3();
    });

    t1.start();
    t2.start();
    t3.start();

    /*
      Task 1, inside
      Task 3, inside
      Task 2, but before synchronized
      // ^ These 3 are random

      // After 10 seconds

      Task 1, outside
      // MONITOR LOCK released by t1
      Task 2, inside synchronized
    */
  }
}
