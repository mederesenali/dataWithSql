package com.example.accessdatawithmysql.service;

import com.example.accessdatawithmysql.model.User;
import com.example.accessdatawithmysql.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> listAll() {
        return (List<User>) repo.findAll();
    }



    public User get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }


    public void addUser(User userForm) {
        repo.save(userForm);
    }

    public Optional<User> updateUser(Integer id) {
        return repo.findById(id);
    }
}
