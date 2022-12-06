package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserDao {

    List<User> allUsers();
    void addUser(User user);
    void changeUser(long id, User updatedUser);
    void deleteUser(long id);
    User getUserById(long id);

    User getUserByUsername(String username);

}
