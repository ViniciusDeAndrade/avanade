package com.avadade.rest.form;

import com.avadade.rest.model.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserForm {
    private String name;
    private String cpf;
    private LocalDate birthDate;
    private AddressForm address;


    public User toUser(){
        return new User(this.name, this.cpf, this.birthDate, this.address.toAddress());
    }
}
