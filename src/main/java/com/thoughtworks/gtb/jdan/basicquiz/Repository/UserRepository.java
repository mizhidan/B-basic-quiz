package com.thoughtworks.gtb.jdan.basicquiz.Repository;

import com.thoughtworks.gtb.jdan.basicquiz.Domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> userList = new ArrayList<>();
    UserRepository() {
        userList.add(User.builder()
                .id(1)
                .name("KAMIL")
                .age(24)
                .avatar("https://inews.gtimg.com/newsapp_match/0/3581582328/0")
                .description("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus, non, dolorem, cumque distinctio magni quam expedita velit laborum sunt amet facere tempora ut fuga aliquam ad asperiores voluptatem dolorum! Quasi.")
            .build());
    }

    public User getUserById(Integer id) {
        for(User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
