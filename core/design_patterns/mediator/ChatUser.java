public class ChatUser extends User {

  public ChatUser(ChatMediator mediator, String name) {
    super(mediator, name);
  }

  @Override
  public void send(String message) {
    System.out.println("Sent by " + this.name + ": " + message);
    mediator.sendMessage(this, message);
  }

  @Override
  public void receive(String message) {
    System.out.println("Received by " + this.name + ": " + message);
  }

}
