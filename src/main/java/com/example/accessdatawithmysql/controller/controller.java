package com.example.accessdatawithmysql.controller;

import com.example.accessdatawithmysql.model.User;
import com.example.accessdatawithmysql.model.UserRepository;
import com.example.accessdatawithmysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
@Validated
public class controller {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;


    @GetMapping("/")
    public String homePage(Model model){
        return "index";
    }

     @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addNewUser (@RequestParam String name
      , @RequestParam String email) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    User n = new User();
    n.setName(name);
    n.setEmail(email);
    userRepository.save(n);
    return "Saved";
  }

//    @PostMapping("/add")
//    public void addUser(@RequestBody User user){
//         userService.addUser(user);
//    }

//    @GetMapping(path="/all")
//    public @ResponseBody Iterable<User> getAllUsers() {
//        return userService.listAll();
//    }
@GetMapping("/all")
    public String findAll(Model model) {
        model.addAttribute("candidates", userRepository.findAll());
        return "candidates";
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        userService.delete(id);
    }

    @PutMapping("/users/{id}")
    User replaceUser(@RequestBody User newUser, @PathVariable Integer id) {

        return userRepository.findById(id)
                .map(user -> {
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    return userRepository.save(user);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return userRepository.save(newUser);
                });
    }




}
//   @GetMapping("/all")
//    public String findAll(Model model) {
//        model.addAttribute("candidates", userRepository.listAll());
//        return "candidates";
//    }