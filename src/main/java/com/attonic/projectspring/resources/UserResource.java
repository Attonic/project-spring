package com.attonic.projectspring.resources;

import com.attonic.projectspring.entities.User;
import com.attonic.projectspring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    //EndPoint para acessar os usuários
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    //O o @PathVariable aceita que id dentro da url como parametro
    public ResponseEntity<User> findByID(@PathVariable Long id){
        User obj = service.findByID(id);
        return  ResponseEntity.ok().body(obj);
    }
}
