package com.iunode.blog.service;

import com.iunode.blog.dao.UserRepository;
import com.iunode.blog.po.User;
import com.iunode.blog.util.MD5utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5utils.code(password));
        return user;
    }
}
