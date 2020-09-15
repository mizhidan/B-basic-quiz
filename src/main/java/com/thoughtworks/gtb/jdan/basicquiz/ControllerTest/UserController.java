package com.thoughtworks.gtb.jdan.basicquiz.ControllerTest;

import com.thoughtworks.gtb.jdan.basicquiz.Domain.Education;
import com.thoughtworks.gtb.jdan.basicquiz.Domain.User;
import com.thoughtworks.gtb.jdan.basicquiz.Exception.UserException;
import com.thoughtworks.gtb.jdan.basicquiz.Repository.UserRepository;
import com.thoughtworks.gtb.jdan.basicquiz.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id) throws UserException {
        return ResponseEntity.ok(userService.getUser(id));
    }

    @PostMapping("/users")
    public ResponseEntity<Long> addUser(@Valid @RequestBody User user) {
        long id = userService.addUser(user);
        return  ResponseEntity.status(HttpStatus.CREATED).body(id);
    }
}
