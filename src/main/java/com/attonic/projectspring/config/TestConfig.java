package com.attonic.projectspring.config;

import com.attonic.projectspring.entities.Category;
import com.attonic.projectspring.entities.Order;
import com.attonic.projectspring.entities.User;
import com.attonic.projectspring.entities.enums.OrderStatus;
import com.attonic.projectspring.repositories.CategoryRepository;
import com.attonic.projectspring.repositories.OrderRepository;
import com.attonic.projectspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    //Resolve as dependências
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");


        User u1 = new User(null, "Maria Brow", "maria@gmail.com", "988888855", "202030");
        User u2 =  new User(null, "Alex Green", "alex@gmail.com", "894949494", "212222");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WATTING_PAYMENT,u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.CANCELED ,u1);



        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
    }
}
