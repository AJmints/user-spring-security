package org.user.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.user.security.models.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByUserName(String userName);
    Boolean existsByUserName(String username);
}
