package com.avadade.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserDTO {

    private Long id;
    private String name;
    private AddressDTO address;
}
