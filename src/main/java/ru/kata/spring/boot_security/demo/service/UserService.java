package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserDetails loadUserByUsername(String username);

    User findUserByName(String username);

    User findUserById(Long userId);

    List<User> allUsers();

    void saveUser(User user);

    void deleteUser(Long userId);

    List<User> usergtList(Long idMin);

    List<Role> listRoles();

    BCryptPasswordEncoder bbCryptPasswordEncoder();

    Optional<User> findByEmail(String email);
}