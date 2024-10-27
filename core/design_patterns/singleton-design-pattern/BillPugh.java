package practice.design_patterns.singleton;

// it uses eager method only but use inner class.
public class BillPugh {
  private BillPugh() {}

  private static class BillPughHelper { // inner class do not get loaded in memory unless they are refered/used
    private static final BillPugh instance = new BillPugh();
  }

  public static BillPugh getInstance() {
    return BillPughHelper.instance;
  }
}
