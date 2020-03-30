package com.myserver.api.service;

import com.myserver.api.model.User;
import com.myserver.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll(){
        return (List<User>) userRepository.findAll();
    }
}
