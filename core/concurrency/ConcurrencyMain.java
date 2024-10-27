package core.concurrency;

public class ConcurrencyMain {
  public static void main(String[] args) {
    /*
      Thread and Process:
        Process:
          - Process is an instance of a program that is getting executed.
          - It has its own resources like memory, thread etc... OS allocates these
            resources to process when its created

            Compilation (javac Test.java):
              - generates bytecode that can be executed by JVM.
            Execution (java Test.java):
              - at this point JVM starts the new process, here Test
                is the class which has `public static void main(String[] args)` method.
        Thread:
          - Thread is known as lightweight process.
          - OR Smallest sequence of instructions (byte code) that are executed by CPU independentely.
          - 1 Process have multiple thread.
          - when process is created, it starts with 1 thread and that initial thread known as
            "main thread" and from that we can create multiple threads to perform task concurrently.
      
      Whenever a new process is created, a new JVM instance is created which contains resources:
        - memory (Heap, Stack, Code Segment, Data Segment, Register, Program Counter)
      
        Code Segment:
          - it contains BYTECODE of the java program.
          - its readonly.
          - all threads within the same process share the same code segment.
        
        Data Segment:
          - Contains the GLOBAL and STATIC variables.
          - all threads within the same process share the same data segment.
          - threads can read and modify the same data.
          - synchronization is required between multiple threads.
        
        Heap:
          - Objects created at runtime using "new" keywords are allocated in the heap.
          - Heap is shared among all the threads of the same process.
          - Threads can read and modify the heap data.
          - synchronization is required between multiple threads.
        
        Stack:
          - Each thread has its own STACK.
          - it manages method calls, local variables.
        
        Register:
          - when JIT(just in time) compiles converts the bytecode into  native machine code,
            its uses register to optimize the generated machine code.
          - Also helps in context switching.
          - Each thread has its own Register.
        
        Counter:
          - also known as Program Counter, it points to the instruction which getting executed.
          - increments its counter after succesfully execution of the instructions.
        
        All these are managed by JVM.
      
      
      Multithreading:
        - Allows a proogram to perform multiple operations at the same time.
        - Multiple threads share the same resources such as memory space but still can
          perform task independentely.

        Benifits:
          - improved performance by task parallelism
          - responsiveness
          - resource sharing
        
        Challanges:
          - concurrency issues like deadlock, data inconsistency etc...
          - syschronized overhead.
          - testing and debugging is difficult.
        
      


    */
    System.out.println("Thread name: " + Thread.currentThread().getName()); // main

    /*
      - Ways to create:
        - implement "Runnable" interface.
        - extend "Thread" class

        * If a class has already extended a class then it can not extend Thread 
          but can implement multiple interfaces so can also implement Runnable.
      
    */


    System.out.println("Runnable: Going inside main method: " + Thread.currentThread().getName());

    // Using Runnable
    // Create a Runnable Object: ImplementRunnable class

    // Start the thread
    // Create an instance of ImplementRunnable class
    ImplementRunnable runnableObj = new ImplementRunnable();

    // Pass the runnable object to the thread constructor.
    Thread thread = new Thread(runnableObj);
    thread.start();

    System.out.println("Finish main method: " + Thread.currentThread().getName());
    System.out.println();

    /*
      STDOUT:
        Going inside main method: main
        Finish main method: main
        Code executed by thread: Thread-0
    */

    System.out.println("Thread: Going inside main method: " + Thread.currentThread().getName());

    // Using Thread class
    // Create a Thread subclass: ExtendThread class.
    // Override run() method.

    // Create an instance of Thread class

    ExtendThread threadObj = new ExtendThread();
    threadObj.start();

    System.out.println("Finish main method: " + Thread.currentThread().getName());

  }
}
