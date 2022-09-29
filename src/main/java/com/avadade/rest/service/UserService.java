package com.avadade.rest.service;

import com.avadade.rest.dto.UserDTO;
import com.avadade.rest.form.UserForm;
import com.avadade.rest.model.User;
import com.avadade.rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream().map(User::toDto).collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserById(Long id) {
        Optional<User> opUser =  userRepository.findById(id);
        return opUser.map(User::toDto).orElse(null);
    }

    @Override
    public UserDTO createUser(UserForm user) {

        return userRepository.save(user.toUser()).toDto();
    }
}
