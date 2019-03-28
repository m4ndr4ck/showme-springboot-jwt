package com.showme.jwt.integration.repository;

import com.showme.jwt.integration.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
