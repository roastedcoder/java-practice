
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class JavaSet {
  public static void main(String[] args) {
      /*
        Set:
        - It is an interface.
        - It represents the unordered set of elements.
        - It doesn't allow us to store the duplicate items.
        - Set is implemented by HashSet, LinkedHashSet, and TreeSet.
      */

      // HashSet
      // HashSet doesnot maintains the order.
      HashSet<Integer> hashset = new HashSet<>();
      hashset.add(1);
      hashset.add(null);
      hashset.add(2);
      hashset.add(null);
      hashset.add(2);
      hashset.forEach((Integer val) -> System.out.println("Hashset values: " + val));

      // LinkedHashSet
      // Maintains a linked list of the entries in the set.
      // which means it preserves the insertion order.
      LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();
      linkedhashset.add(1);
      linkedhashset.add(null);
      linkedhashset.add(2);
      linkedhashset.add(null);
      linkedhashset.add(2);
      linkedhashset.forEach((Integer val) -> System.out.println("LinkedHashSet values: " + val));

      /*
        SortedSet:
        - It inherits the Set interface.
        - Order is not maintained.
        - TreeSet
      */

      TreeSet<Integer> treeset = new TreeSet<>();
      treeset.add(1);
      treeset.add(0);
      // treeset.add(null); // not allowed.
      treeset.add(3);
      treeset.add(2);

      treeset.forEach((Integer val) -> System.out.println("TreeSet values: " + val));
  }
}
