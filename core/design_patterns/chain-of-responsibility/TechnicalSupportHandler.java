public class TechnicalSupportHandler extends SupportHandler {

  @Override
  public void handleRequest(String issueType) {
    if(issueType.equals("technical")) {
      System.out.println("Technical support done.");
    } else if (nextHandler != null) {
      nextHandler.handleRequest(issueType);
    } else {
      System.out.println("Not handled");
    }
  }

}
