package dhbw;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

   private final List<User> users = new ArrayList<>();

   public void addUser(User user) {
       users.add(user);
   }

}
