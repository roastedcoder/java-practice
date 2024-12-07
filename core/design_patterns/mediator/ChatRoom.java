import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{
  private List<User> users = new ArrayList<>();

  @Override
  public void addUser(User user) {
    users.add(user);
  }

  @Override
  public void sendMessage(User sender, String message) {
    for(User user: users) {
      if(sender != user) {
        user.receive(message);
      }
    }
  }
}
