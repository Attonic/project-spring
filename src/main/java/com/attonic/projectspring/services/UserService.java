package com.attonic.projectspring.services;

import com.attonic.projectspring.entities.User;
import com.attonic.projectspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

//Transforma a classe em um componente do Spring, para que ele seja injetado com Autowired
@Component
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findByID(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }


    public User insert(User obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public User update(Long id, User obj){
        User user = repository.getReferenceById(id);
        userUpdate(user, obj);
        return repository.save(user);
    }

    private void userUpdate(User user, User obj) {
        user.setName(obj.getName());
        user.setEmail(obj.getEmail());
        user.setPhone(obj.getPhone());
    }

}
