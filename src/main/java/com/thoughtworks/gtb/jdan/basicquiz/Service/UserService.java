package com.thoughtworks.gtb.jdan.basicquiz.Service;

import com.thoughtworks.gtb.jdan.basicquiz.Domain.User;
import com.thoughtworks.gtb.jdan.basicquiz.Exception.UserException;
import com.thoughtworks.gtb.jdan.basicquiz.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Integer id) throws UserException {
        // GTB: 用 Optional 改进下面的几行代码
        if(userRepository.getUserById(id) == null) {
            throw new UserException("cannot find Cannot find basic info for user with id " + id +".");
        }
        return userRepository.getUserById(id);
    }

    public long addUser(User user) {
        return userRepository.saveUser(user);
    }
}
