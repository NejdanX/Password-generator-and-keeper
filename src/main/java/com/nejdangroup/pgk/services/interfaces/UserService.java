package com.nejdangroup.pgk.services.interfaces;

import com.nejdangroup.pgk.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    List<User> getAllUsers();

    User findByUsername(String username);

    User findByEmail(String email);
}
