package core.concurrency.thread_lifecycle;

public class ThreadLifecycle {
  /*
    - New:
      - Thread has been created but not started.
      - Its just an object in memory.

    - Runnable:
      - Thread is ready to run.
      - Waiting for CPU time.

    - Running:
      - When thread start executing its code.

    - Blocked:
      - Different scenarios where runnable thread goes into blocked state.
        - I/O: like reading from a file or db.
        - Lock aquired: if thread want to lock on resource which is locked by other thread, it has to wait.

      * Releases all the MONITOR LOCKS.

    - Waiting:
      - Thread goes into this state when we call the wait method, makes it non runnable.
      - It goes back to runnable, once we call notify() or notifyAll() method.

      * Releases all the MONITOR LOCKS.

    - Timed Waiting:
      - Thread waits for specific period of time and comes back to runnable state, after specific conditions met.
        - sleep()
        - join()
      
      * Do not releases any MONITOR LOCKS.

    - Terminated:
      - Life of thread is completed, it can not be shared back again.
  */

  // New -> [Runnable -> Running]
  // [Runnable -> Running] <-> [Blocked || Waiting || Timed Waiting]
  // [Runnable -> Running] <-> [Blocked || Waiting || Timed Waiting] -> Terminated.


  /*
    - MONITOR LOCK:
      - It helps to make sure that only 1 thread goes into the particular section of code(a synscronized block or method.)
  */

  /*
    Why STOP, RESUME, SUSPEND method is deprecated?
      - STOP: Terminates the thread abruptly, No lock release, no resource clean up happens.
      - SUSPEND: Put the thread on hold(suspend) for temporarily. No lock is released too.
      - RESUME: Used to resume the execution of suspended thread.
  */

  /*
    JOIN:
    - When JOIN method is invoked on a thread object. Current thread will be blocked and waits for specific thread to finish.
    - It is useful when we want to coordinate between threads or to ensure we complete certain task before moving ahead.
  */

  /*
    Thread Priority:
    - Priorities are integers ranging from 1(low) to 10(high).
    - Even we set thread priority while creation, its not guaranteed to follow any specific order, its just a hint to thread
      schedular which to execute next.(but its not strict rule)
    - when new thread is created, it inherit the priority of its parent thread.
    - we can set current priority using "setPriority(int priority)" method.
    - ** avoid using thread priority.
  */

  /*
    Deamon Thread:
    - used for:
      - GC
      - Auto save
      - logging
    - create by passing "setDaemon: true" after creating the thread.
    - it will terminate as the parent thread is terminated.
  */
}
