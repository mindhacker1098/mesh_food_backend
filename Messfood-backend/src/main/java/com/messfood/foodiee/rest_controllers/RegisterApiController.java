package com.messfood.foodiee.rest_controllers;

import com.messfood.foodiee.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RegisterApiController {

    @Autowired
    UserService userService;

    @PostMapping("/user/register")
    public ResponseEntity registerNewUser(@RequestParam("UNIQUEID")String UNIQUEID,
                                          @RequestParam("email")String email,
                                          @RequestParam("password")String password
                                          ){

if(UNIQUEID.isEmpty() || email.isEmpty() || password.isEmpty()){
    return new ResponseEntity("Please enter all the fields", HttpStatus.BAD_REQUEST);
}
//    String hashed_password = BCrypt.hashpw(password, BCrypt.gensalt());


int result = userService.registerNewUserServiceMethod(UNIQUEID, email, password);

if (result != 1){
    return new ResponseEntity("Failed", HttpStatus.BAD_REQUEST);

}
        return new ResponseEntity("Success", HttpStatus.OK);

    }


}
