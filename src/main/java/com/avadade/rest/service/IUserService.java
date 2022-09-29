package com.avadade.rest.service;

import com.avadade.rest.dto.UserDTO;
import com.avadade.rest.form.UserForm;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IUserService {

    List<UserDTO> getAllUsers();

    UserDTO getUserById(Long id);

    @Transactional
    UserDTO createUser(UserForm user);
}
