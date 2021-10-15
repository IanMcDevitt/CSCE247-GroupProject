import java.util.ArrayList;
public class UserDatabase {
  
    private UserDatabase userDatabase;
    private ArrayList<User> users;
    private ArrayList<User> removedUsers;

    private UserDatabase() {
        users = new ArrayList<User>();
        removedUsers = new ArrayList<Users>();
    }

    public ReviewDatabase getInstance() {
        userDatabase = new UserDatabase();
        return userDatabase;
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }

}
