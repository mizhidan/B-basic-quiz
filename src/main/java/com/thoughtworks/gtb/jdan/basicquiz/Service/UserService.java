package com.thoughtworks.gtb.jdan.basicquiz.Service;

import com.thoughtworks.gtb.jdan.basicquiz.Domain.User;
import com.thoughtworks.gtb.jdan.basicquiz.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Integer id) {
        return userRepository.getUserById(id);
    }

    public long addUser(User user) {
        return userRepository.saveUser(user);
    }
}
