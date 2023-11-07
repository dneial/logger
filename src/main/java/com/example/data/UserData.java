package com.example.data;

import com.example.models.UserL;
import com.example.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class UserData {
    @Bean
    public CommandLineRunner initUserDatabase(UserRepository repository){
        var user = new UserL(0, "admin", "admin@admin.com", "mdp", 130);
        return args -> {
            repository.save(user);
        };
    }
}
