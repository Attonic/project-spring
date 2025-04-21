package com.attonic.projectspring.config;

import com.attonic.projectspring.entities.User;
import com.attonic.projectspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brow", "maria@gmail.com", "988888855", "202030");
        User u2 =  new User(null, "Alex Green", "alex@gmail.com", "894949494", "212222");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
