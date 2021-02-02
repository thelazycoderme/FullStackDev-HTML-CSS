package com.example.Shopping.site.Service;

import com.example.Shopping.site.Entity.User;
import com.example.Shopping.site.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user)
    {
        return userRepository.save(user);
    }
    //to save list of users

    public List<User> saveUsers(List<User> users)
    {
        return userRepository.saveAll(users);
    }

    //Get methods

    public User getUserById(int id)
    {
        return userRepository.findById(id).orElse(null);
    }


    public User getUserByName(String name)
    {
        return userRepository.findByName(name);
    }

    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }

    public String deleteUserById(int id)
    {
        userRepository.deleteById(id);
        return "Product removed Successfully "+id;
    }
    public String deleteUserByName(String name)
    {
        userRepository.deleteByName(name);
        return "User removed Successfully "+name;
    }

    //=========================================>>>>>>>>>>>>>>>
    //Update commands

    public User updateUserById(User newUserValue)
    {
        //checking for existence of the user
        User existingUserValue=userRepository.findById(newUserValue.getId()).orElse(null);
        existingUserValue.setName(newUserValue.getName());
        existingUserValue.setAge(newUserValue.getAge());
        existingUserValue.setSalary(newUserValue.getSalary());
        existingUserValue.setAddress(newUserValue.getAddress());
        return userRepository.save(existingUserValue);
    }



}
