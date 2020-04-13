package com.example.accessdatawithmysql;

import com.example.accessdatawithmysql.model.User;
import com.example.accessdatawithmysql.model.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories(basePackages = "com.example.accessdatawithmysql.model")
@SpringBootApplication
public class AccessdatawithmysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccessdatawithmysqlApplication.class, args);
    }


}
