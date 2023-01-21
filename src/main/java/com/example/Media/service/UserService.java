package com.example.Media.service;

import com.example.Media.POJO.Users;
import com.example.Media.repositor.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void addUser(Users users) {

        userRepository.save(users);

    }
}
