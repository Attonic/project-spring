package com.attonic.projectspring.repositories;

import com.attonic.projectspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Nesse caso não precisa colocar o @Repository por que ele esta herdadno de JPA
public interface UserRepository extends JpaRepository<User, Long> {

}
