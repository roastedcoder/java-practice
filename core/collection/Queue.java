import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class Queue {
  public static void main(String[] args) {
      /*
        - Queue is an interface, child of collection interface.
        - It follows FIFO approach.
        - supports all methods available in collection + some other methods also like:
          - add() -> null element is not allowed, throws NPE.
          - offer() -> same as add(), returns false instead of NPE.
          - remove() -> retrieves and returns the head of the queue, throws NPE if queue is empty.
          - poll() -> same as remove(), returns false instead of NPE.
          - element() -> retrieves front element, throws NPE.
          - peek() -> same as element(), returns false instead of NPE.
        
        - PriorityQueue implements Queue.
      */

      PriorityQueue<Integer> maxPQ = new PriorityQueue<>((Integer a, Integer b) -> b-a);
      maxPQ.add(4);
      maxPQ.add(1);
      maxPQ.add(5);
      maxPQ.add(2);
      maxPQ.add(10);

      maxPQ.forEach((Integer val) -> System.out.println(val));

      System.out.println(maxPQ.contains(3));
      System.out.println(maxPQ.contains(1));

      while(!maxPQ.isEmpty()) {
        int val = maxPQ.poll();
        System.out.println(val);
      }

      System.out.println("Deque interface:");
      Deque<Integer> queue = new ArrayDeque<>();
      queue.addLast(1);
      queue.addLast(2);
      queue.addLast(3);
      queue.forEach((Integer val) -> System.out.println("Deque element: " + val));

      queue.addFirst(0);
      queue.forEach((Integer val) -> System.out.println("Deque element: " + val));

      queue.removeFirst();
      queue.forEach((Integer val) -> System.out.println("Deque element: " + val));
  }
}
