package com.avadade.rest.form;

import com.avadade.rest.model.User;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Getter
@Setter
public class UserForm {
    @NotBlank
    private String name;
    private String cpf;

    private LocalDate birthDate;
    private AddressForm address;


    public User toUser(){
        return new User(this.name, this.cpf, this.birthDate, this.address.toAddress());
    }
}
