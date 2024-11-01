import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class JavaList {
  public static void main(String[] args) {
      /* 
        - List is an interface.
        - It is the child interface of Collection interface.
        - It is implemented by the classes ArrayList, LinkedList, Vector, and Stack.
        - LinkedList:
          - 
      */

      List<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);

      ArrayList<Integer> arraylist = new ArrayList<>();
      arraylist.add(1);
      arraylist.add(3);
      arraylist.add(2);

      Collections.sort(arraylist);

      for (Integer element : list) {
        System.out.println("List Element: " + element);
      }

      for (Integer element : arraylist) {
        System.out.println("ArrayList Element: " + element);
      }

      for(int i = 0; i < list.size(); i++) {
        System.out.println("List Element at index " + i + ": " + list.get(i));
      }

      for(int i = 0; i < arraylist.size(); i++) {
        System.out.println("ArrayList Element at index " + i + ": " + arraylist.get(i));
      }

      System.out.println("Converting arraylist to array: ");
      Integer[] array = arraylist.toArray(Integer[]::new);

      for(int i = 0; i < array.length; i++) {
        System.out.println("Array element at index " + i + ": " + array[i]);
      }

      LinkedList<Integer> linkedlist = new LinkedList<>();
      linkedlist.add(1);
      linkedlist.add(2);
      linkedlist.add(3);

      // add at index
      linkedlist.add(0, 0);
      linkedlist.addFirst(-1);
      linkedlist.addLast(4);

      for (Integer element : linkedlist) {
        System.out.println("LinkedList Element: " + element);
      }

      /*
        Vector:
        - Vector uses a dynamic array to store the data elements
        - It is synchronized.
        - It contains many methods that are not the part of Collection framework.
        - It is obsolete now.

        List<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println(vector.capacity());
      */

      Stack<Integer> stack = new Stack<>();
      stack.add(1);
      stack.add(2);
      stack.add(3);

      stack.push(4);
      stack.push(5);
      for (Integer element : stack) {
        System.out.println("Stack Element: " + element);
      }
      stack.pop();

      for (Integer element : stack) {
        System.out.println("Stack Element: " + element);
      }
  }
}
