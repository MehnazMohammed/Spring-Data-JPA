package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.repository.UserRepository;
import com.model.User;

 
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestUserRepository {
 
    @Autowired
    private UserRepository userRepo;
 
    @Test
    public void testSave() {
 
        System.out.println("userRepo -> Save");
        User user = new User();
        user.setID(50);
        user.setName("Mehnaz");
        System.out.println(user);
        userRepo.save(user);
    }
}
