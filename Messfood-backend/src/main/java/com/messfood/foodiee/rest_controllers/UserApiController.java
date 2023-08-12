package com.messfood.foodiee.rest_controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserApiController {
    @GetMapping("/test")
    public String testendpoint(){
        return "test end point is working";
    }
}
