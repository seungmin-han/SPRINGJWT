package org.example.springjwt.repository;

import org.example.springjwt.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    Boolean existsByUsername(String username);

    UserEntity findByUsername(String username);


}
