package com.attonic.projectspring.resources;

import com.attonic.projectspring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Loda", "loda@gmail.com", "9999999", "12321e3223");
        return ResponseEntity.ok().body(u);
    }
}
