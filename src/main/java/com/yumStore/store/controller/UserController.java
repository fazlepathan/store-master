package com.yumStore.store.controller;

import com.yumStore.store.model.User;
import com.yumStore.store.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:4200/")
@RestController
public class UserController {
    @Autowired
    private UserRepo uRepo;

    @GetMapping("/user/find/all")
    public List<User> getAllUser(){
        return uRepo.findAll();
    }

    @PostMapping("/user/add")
    public String addUser(@RequestBody User user){
        uRepo.save(user);
        return "Added new user with id "+user.getUserName();
    }


    @PostMapping("/user/delete")
    public void deleteUserById(@RequestBody String userName){
        uRepo.deleteById(userName);

    }

    @GetMapping("/user/find/{userName}")
    public Optional<User> getUserByUserName(@PathVariable String userName){
        return uRepo.findById(userName);
    }
}
