package com.spring.start;

import com.spring.start.model.Role;
import com.spring.start.model.User;
import com.spring.start.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Set;

@SpringBootApplication
@AllArgsConstructor
public class SpringStarterApplication implements ApplicationRunner {

    private final UserRepository userRepository;

    public static void main(String[] args) {SpringApplication.run(SpringStarterApplication.class, args);}

    @Override
    public void run(ApplicationArguments args) throws Exception {
        userRepository.save(new User("yevhenii@gmail.com",
                                     "Yevhenii",
                                     "Volovitskyi" ,
                                     "qwerty1234",
                                      Set.of(Role.ROLE_ADMIN)));

        userRepository.save(new User("alex@gmail.com",
                                     "Alex",
                                     "Rolman" ,
                                     "qwerty12344321",
                                     Set.of(Role.ROLE_USER)));

        System.out.println(userRepository.findAll());
    }
}
