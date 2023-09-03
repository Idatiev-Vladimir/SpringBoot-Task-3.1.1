package SpringTask311.Task311.service;

import java.util.List;
import SpringTask311.Task311.model.User;

public interface UserService {

    List<User> allUser();

    User showUser(long id);

    void addUser(User user);

    void updateUser(long id, User user);

    void removeUserById(long id);
}
