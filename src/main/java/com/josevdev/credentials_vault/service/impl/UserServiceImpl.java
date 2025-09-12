package com.josevdev.credentials_vault.service.impl;


import com.josevdev.credentials_vault.model.User;
import com.josevdev.credentials_vault.repository.UserRepository;
import com.josevdev.credentials_vault.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;



    @Override
    public User createUser(User user) {

        return userRepository.save(user);
    }
}
