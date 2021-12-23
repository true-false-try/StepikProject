package com.spring.start;

import com.spring.start.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@AllArgsConstructor
public class SpringStarterApplication implements ApplicationRunner {

    private final UserRepository userRepository;

    public static void main(String[] args) {SpringApplication.run(SpringStarterApplication.class, args);}

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println(userRepository.findAll());
    }
}
