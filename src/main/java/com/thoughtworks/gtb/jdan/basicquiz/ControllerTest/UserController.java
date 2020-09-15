package com.thoughtworks.gtb.jdan.basicquiz.ControllerTest;

import com.thoughtworks.gtb.jdan.basicquiz.Domain.User;
import com.thoughtworks.gtb.jdan.basicquiz.Repository.UserRepository;
import com.thoughtworks.gtb.jdan.basicquiz.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id) {
        return ResponseEntity.ok(userService.getUser(id));
    }
}
