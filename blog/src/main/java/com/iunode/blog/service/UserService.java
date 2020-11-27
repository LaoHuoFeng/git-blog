package com.iunode.blog.service;

import com.iunode.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
