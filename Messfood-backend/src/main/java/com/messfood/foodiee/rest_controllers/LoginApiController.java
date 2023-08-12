package com.messfood.foodiee.rest_controllers;


import com.messfood.foodiee.models.Login;
import com.messfood.foodiee.models.User;
import com.messfood.foodiee.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class LoginApiController {
    @Autowired
    UserService userService;
    @PostMapping("/user/login")
    public ResponseEntity authenticateUser(@RequestBody Login login){


        List<String> userEmail = userService.checkUserEmail(login.getEmail());

       if(userEmail.isEmpty() || userEmail == null){
           return new ResponseEntity("Email does ot exist", HttpStatus.NOT_FOUND);

       }
       String password = userService.checkUserPasswordByEmail(login.getEmail());

       if (!password.equals(login.getPassword())){
           return new ResponseEntity("Incorrect username or password", HttpStatus.BAD_REQUEST);
        }


       User user = userService.getUserDetailByEmail(login.getEmail());

       return new ResponseEntity(user, HttpStatus.OK);
    }

}
