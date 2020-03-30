package com.myserver.api.service;

import com.myserver.api.model.User;
import java.util.List;

public interface IUserService {
    List<User> findAll();
}
