package com.nejdangroup.pgk.repositories;

import com.nejdangroup.pgk.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM Users u WHERE b.username = :username")
    Optional<User> findByUsername(@Param("username") String username);

    @Query("SELECT u FROM Users u WHERE b.email = :email")
    Optional<User> findByEmail(@Param("email") String email);
}
