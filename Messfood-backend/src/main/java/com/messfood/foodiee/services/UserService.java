package com.messfood.foodiee.services;


import com.messfood.foodiee.Repository.UserRepository;
import com.messfood.foodiee.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public int registerNewUserServiceMethod(String UNIQUEID, String email, String password){
        return userRepository.registerNewUser(UNIQUEID,email,password);
    }

    public List<String> checkUserEmail( String email){
        return userRepository.checkUserEmail(email);
    }
    public String checkUserPasswordByEmail( String password){
        return userRepository.checkUserPasswordByEmail(password);
    }

    public User getUserDetailByEmail(String email){
        return userRepository.getUserByDetail(email);
    }



}
