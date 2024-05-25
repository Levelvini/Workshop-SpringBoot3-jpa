package com.LevelVini.course.config;

import com.LevelVini.course.entities.User;
import com.LevelVini.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(1, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(2, "Alex Green", "alex@gmail.com", "977777777", "123456");
        List<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        userRepository.saveAll(list);
    }
}
