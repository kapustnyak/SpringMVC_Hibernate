package webapp.dao;

import webapp.models.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    void updateUser(Long id, String newFirstName, String newLastName, String newEmail, String newPassword);
    void deleteUser(Long id);
    List<User> getUsers();
    User getUserById(Long id);
}
