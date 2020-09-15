package com.thoughtworks.gtb.jdan.basicquiz.Repository;

import com.thoughtworks.gtb.jdan.basicquiz.Domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {
    Map<Integer, User> userMap = new LinkedHashMap<>();
    private static Integer id = 1;
    UserRepository() {
        userMap.put(id ,User.builder()
                .id(1)
                .name("KAMIL")
                .age(24)
                .avatar("https://inews.gtimg.com/newsapp_match/0/3581582328/0")
                .description("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus, non, dolorem, cumque distinctio magni quam expedita velit laborum sunt amet facere tempora ut fuga aliquam ad asperiores voluptatem dolorum! Quasi.")
            .build());
        ++id;
    }

    public long saveUser(User user) {
        userMap.put(id, user);
        ++id;
        return id - 1;
    }

    public User getUserById(Integer id) {
        return userMap.get(id);
    }
}
