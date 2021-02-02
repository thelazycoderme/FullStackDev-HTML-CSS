package com.example.Shopping.site.Controller;


import com.example.Shopping.site.Entity.User;
import com.example.Shopping.site.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/home")
    public void welcomeMessage()
    {
        System.out.println("Welcome to homepage");
    }


    @PostMapping("/addUser")
    public User addUser(@RequestBody User user)
    {
        return userService.saveUser(user);
    }

    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> users)
    {
        return userService.saveUsers(users);
    }

    //==================>>getMappings

    @GetMapping("/getUserById")
    public User getUser(@RequestBody int id)
    {
        return userService.getUserById(id);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers()
    {
       return userService.getAllUsers();
    }
    @GetMapping("/getUserById/{id}")
    public User getAllUser(@PathVariable int id)
    {
        return userService.getUserById(id);
    }

    @GetMapping("/getUserByName/{name}")
    public User getAllUser(@PathVariable String name)
    {
        return userService.getUserByName(name);
    }

    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user)
    {
       return userService.updateUserById(user);
    }
    
//    @PutMapping("/patchUser")
//    public User patchUser(@RequestBody User user)
//    {
//        return userService.updateUserById(user);
//    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id)
    {
       return userService.deleteUserById(id);
    }
//
//    @DeleteMapping("/deleteUserByName/{name}")
//    public String deleteUser(@PathVariable String name)
//    {
//        return userService.deleteUserByName(name);
//    }

}
