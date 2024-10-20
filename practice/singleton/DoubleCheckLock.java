package practice.singleton;

public class DoubleCheckLock {
  private DoubleCheckLock() {}

  private static volatile DoubleCheckLock instance;
  // when volatile is used, any change to "instance" happens to memory directly and not on cache.

  public static DoubleCheckLock getInstance() {
    if(instance == null) {
      synchronized (DoubleCheckLock.class) {
        if(instance == null) { // this is because 2+ thread might have entered first nill check then they would enter synchronized block
          // thread 1 write in the cache but thread 2 would read from memory or it's own cache and might create a new object.
          // so we use volatile.
          instance = new DoubleCheckLock();
        }
      }
    }

    return instance;
  }
}
