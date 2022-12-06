package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {

    List<User> allUsers();
    void addUser(User user);
    void changeUser(long id, User updatedUser);
    void deleteUser(long id);
    User getUserById(long id);
}
