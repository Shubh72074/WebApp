package com.shubh.WebApp.dal;

import com.shubh.WebApp.model.User;

import java.util.List;

public interface UserDal {
    List<User> getAllUsers();

    User getUserById(String userId);

    User addNewUser(User user);
}
