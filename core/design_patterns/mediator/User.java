public abstract class User {
  protected ChatMediator mediator;
  protected String name;

  public User(ChatMediator mediator, String name) {
    this.name = name;
    this.mediator = mediator;
  }

  public abstract void send(String message);
  public abstract void receive(String message);
}
