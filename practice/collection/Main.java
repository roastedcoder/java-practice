package practice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> values = new ArrayList<>();
    
    values.add(1);
    values.add(2);
    values.add(3);
    values.add(4);

    Iterator<Integer> iterator = values.iterator();
    while(iterator.hasNext()) {
      int val = iterator.next();
      System.out.println(val);

      if(val == 3) {
        iterator.remove();
      }
    }

    System.out.println("Using for-each loop");
    for(int x: values) {
      System.out.println(x);
    }

    System.out.println("Using forEach method lambda expression");
    values.forEach((Integer val) -> System.out.println(val));
  }
}
