package com.attonic.projectspring.repositories;

import com.attonic.projectspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
