public class Main {
  public static void main(String[] args) {
    SupportHandler basicSupportHandler = new BasicSupportHandler();
    SupportHandler technicalSupportHandler = new TechnicalSupportHandler();
    SupportHandler managerSupportHandler = new ManagerSupportHandler();

    // Configuration
    basicSupportHandler.setNextHandler(technicalSupportHandler);
    technicalSupportHandler.setNextHandler(managerSupportHandler);


    // Handle request

    System.out.println("\nRequest: basic");
    basicSupportHandler.handleRequest("basic");

    System.out.println("\nRequest: technical");
    basicSupportHandler.handleRequest("technical");
    // technicalSupportHandler.handleRequest("technical");

    System.out.println("\nRequest: manager");
    basicSupportHandler.handleRequest("manager");
    // managerSupportHandler.handleRequest("manager");
  }
}
