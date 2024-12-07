public class Main {
  public static void main(String[] args) {
      System.out.println("Inside mediator main");

      ChatMediator chatroom = new ChatRoom();

      User user1 = new ChatUser(chatroom, "Alice");
      User user2 = new ChatUser(chatroom, "Bob");
      User user3 = new ChatUser(chatroom, "Elon");

      chatroom.addUser(user1);
      chatroom.addUser(user2);
      chatroom.addUser(user3);

      user1.send("Hello Everyone");
      user2.send("Hi Alice");

  }
}
