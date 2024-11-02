import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    /*
      Map:
      - It is an interface and it's implementations are:
        - HashMap: Do not maintain order.
        - HashTable: (Obselete, use HashMap)
          - synchronized version of HashMap
          - do not contains null key or value.
        - LinkedHashMap:
          - Maintains the insertion order or
          - helps in maintaining access order.
          - it maintains a doubly linked list of keys while inserting the key so that order is maintained.
        - TreeMap:
          - sorts the data internally according to its natural ordering or Comparator provided.
          - It is based on Red-Black tree(self balancing BST).
      - can not contains duplicate `key`.
      - contains (key, value).

      On collision:
      - append to linked list for a hashcode.
      - "Treefy" the linked list after treefy threshold is reached.
    */

    // HashTable
    System.out.println("HashTable:");
    Hashtable<Integer, Integer> hashtable = new Hashtable<>();
    hashtable.put(1, 2);
    hashtable.put(3, 4);
    // hashtable.put(5, null);
    // hashtable.put(null, 6);
    hashtable.put(5, 6);

    for (Integer key : hashtable.keySet()) {
      System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
    }

    // HashMap
    System.out.println("HashMap:");
    Map<Integer, Integer> hashmap = new HashMap<>();
    hashmap.put(3, 4);
    hashmap.put(1, 2);
    hashmap.put(5, 6);

    System.out.println("Hashmap value at 4: " + hashmap.get(4));
    System.out.println("Hashmap value at 3: " + hashmap.get(3));
    hashmap.put(5, 5);
    hashmap.replace(6, 7); // if 6 present in the map
    hashmap.remove(5);
    hashmap.put(7, null); // allowed

    for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }

    for(Integer key: hashmap.keySet()) {
      System.out.println("Key: " + key + ", Value: " + hashmap.get(key));
    }

    for (Map.Entry entry : hashmap.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }

    hashmap.forEach((Integer key, Integer val) -> System.out.println("Key: " + key + " and value: " + val));

    // LinkedHashMap
    System.out.println("LinkedHashMap:");
    LinkedHashMap<Integer, Integer> linkedhashmap = new LinkedHashMap<>(16, .75f, true);
    linkedhashmap.put(1, 2);
    linkedhashmap.put(3, 4);
    linkedhashmap.put(5, 6);

    for (Map.Entry<Integer, Integer> entry : linkedhashmap.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }

    linkedhashmap.forEach((Integer key, Integer val) -> System.out.println("Key: " + key + " and value: " + val));

    linkedhashmap.get(1);
    // now (key: 1) will move to last
    // We can use linkedhashmap in caching, purge the initial key, value.

    linkedhashmap.forEach((Integer key, Integer val) -> System.out.println("Key: " + key + " and value: " + val));

    System.out.println("TreeMap:");
    // TreeMap<Integer, Integer> treemap = new TreeMap<>(Comparator.naturalOrder());
    // TreeMap<Integer, Integer> treemap = new TreeMap<>((Integer k1, Integer k2) -> k2 - k1); // reverse
    // TreeMap<Integer, Integer> treemap = new TreeMap<>((Integer k1, Integer k2) -> k1 - k2); // natural order
    TreeMap<Integer, Integer> treemap = new TreeMap<>();
    treemap.put(3, 4);
    treemap.put(1, 2);
    treemap.put(5, 6);
    treemap.put(7, 8);
    treemap.put(9, 10);

    for (Map.Entry<Integer, Integer> entry : treemap.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }

    System.out.println("Headmap 5: " + treemap.headMap(5)); // exclusive
    System.out.println("Headmap 5: " + treemap.tailMap(5)); // inclusive

    System.out.println("LowerEntry 5 key: " + treemap.lowerEntry(5).getKey() + " value: " + treemap.lowerEntry(5).getValue());
    System.out.println("LowerKey: " + treemap.lowerKey(5));

    System.out.println("FloorEntry 5 key: " + treemap.floorEntry(5).getKey() + " value: " + treemap.floorEntry(5).getValue());
    System.out.println("FloorKey: " + treemap.floorKey(5));
    
  }
}
