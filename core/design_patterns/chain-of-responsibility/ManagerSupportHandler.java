public class ManagerSupportHandler extends SupportHandler {
  @Override
  public void handleRequest(String issueType) {
    if(issueType.equals("manager")) {
      System.out.println("Manager support done.");
    } else if(nextHandler != null) {
      nextHandler.handleRequest(issueType);
    } else {
      System.out.println("Not handled");
    }
  }
}
