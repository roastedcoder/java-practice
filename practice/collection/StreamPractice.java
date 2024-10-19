package practice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {
  public static void main(String[] args) {
    /*
      - We can consider stream as a pipeline, through which our collection
        elements passes through.

      - while elements passes through pipeline, it perform various operations 
        like sorting, filtering etc...

      - Useful when deal with bulk processing, can do parallel processing.

      Steps:
        Create Stream (Streams are created from the data source like collection or array etc...)
        Intermediate Operations (sorted, filter, map, distinct, etc...)
          - can have many intermediate operations.
          - lazy in nature (executed when terminal operation in invoked.)
        Terminal Operations (collect, reduce, count etc...)
          - only 1 operation
          - triggers the process of the stream.
          - produces the output.
    */

    List <Integer> salaryList = new ArrayList<>();
    salaryList.add(3000);
    salaryList.add(3001);
    salaryList.add(3002);
    salaryList.add(3003);
    salaryList.add(3004);
    salaryList.add(3005);

    // without using stream
    int count = 0;
    for(Integer salary: salaryList) {
      if(salary > 3002) {
        count++;
      }
    }
    System.out.println("Without using stream: " + count);

    // using stream
    long streamCount = salaryList.stream().filter((Integer salary) -> salary > 3002).count();
    System.out.println("using stream: " + streamCount);

    /*
      stream -> create a stream
      filter -> intermediate operation
      count -> terminal stream
    */

    /*
      Ways to create:
        - From Collection
        - From Array
        - From Static Method
        - From Stream Builder
        - From Stream Iterate
    */

    // From collection
    List<Integer> fromCollection = Arrays.asList(3000, 3001, 3002, 3003, 3004, 3005);
    Stream<Integer> fromCollectionStream = fromCollection.stream();
    System.out.println("From collection stream: " + fromCollectionStream.filter((Integer salary) -> salary > 3002).count());

    // From Array
    Integer[] fromArray = {3000, 3001, 3002, 3003, 3004, 3005};
    Stream<Integer> fromArrayStream = Arrays.stream(fromArray);

    // From Static Method
    Stream<Integer> fromStaticMethodStream = Stream.of(3000, 3001, 3002, 3003, 3004, 3005);

    // Why we call intermediate operation "Lazy"
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    // nothing will gets printed since only intermediate operation has been called
    Stream<Integer> listStream = list.stream().filter((Integer val) -> val > 3).peek((Integer val) -> System.out.println(val));
    listStream.count();
    
    // count is terminal operation, now peek will execute and elements will get printed.

    // this is not printing anything we need to call forEach like below.
    // Stream<Integer> listStream = list.stream().peek((Integer val) -> System.out.println(val));
    // listStream.count();

    // This will print all elements
    // Stream<Integer> listStream = list.stream().peek((Integer val) -> System.out.println(val));
    // listStream.forEach(val -> {});

    /*
      Ways to create terminal operation:
        - ForEach (used to loop through the stream.)
        - toArray (collects the elements into an array.)
        - reduce (perform associative aggregation function.) (2 + 2 = 4) | (4 * 2 = 8)
        - collect (used to collect the stream data into a list.)
        - min (find the min in stream based on comparator provided.)
        - max (find the max in stream based on comparator provided.)
        - count (count of elements present in the stream.)
        - anyMatch (return bool based on a match condition.)
        - findFirst (return first value based on a condition.)
        - findAny (return any value based on a condition.)
    */
  }
}

/*
  parallelStream:
    - helps to perform operation on stream concurrently, taking advantage of multicure CPU.
    - ParallelStream() method is used instead of reguler Stream().
    - Internally it does:
        - Task Splitting: It used spliterator function to split the data into multiple chunks.
        - Task submission and parallel processing: Used Fork-Join pool technique.
*/