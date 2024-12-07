public class BasicSupportHandler extends SupportHandler{
  @Override
  public void handleRequest(String issueType) {
    if(issueType.equals("basic")) {
      System.out.println("Basic support done");
    } else if(nextHandler != null) {
      nextHandler.handleRequest(issueType);
    } else {
      System.out.println("Not handled");
    }
  }
}
