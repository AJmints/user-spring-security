package org.user.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.user.security.models.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}
