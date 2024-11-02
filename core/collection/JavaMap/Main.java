import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

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
          - Maintains the insertion order.
        - TreeMap:
          - sorts the data internally.
      - can not contains duplicate `key`.
      - contains (key, value).

      On collision:
      - append to linked list for a hashcode.
      - "Treefy" the linked list after treefy threshold is reached.
    */

    // HashTable
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
  }
}
