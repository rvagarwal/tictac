package com.tictac.tictac.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addUser(@RequestBody UserModel userModel, Errors errors) throws InterruptedException {
        userService.addUsers(userModel);
    }

    @GetMapping(path = "")
    @ResponseStatus(code = HttpStatus.OK)
    public List<User> getUsers(){
        return userService.getUsers();
    }
    
  
}
