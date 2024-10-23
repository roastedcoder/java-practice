package practice.thread_lifecycle;

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
}
