package com.showme.jwt.integration.repository;

import com.showme.jwt.integration.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
