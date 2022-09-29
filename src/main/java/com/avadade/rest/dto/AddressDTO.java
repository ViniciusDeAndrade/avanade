package com.avadade.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AddressDTO {
    private String street;
    private String number;
    private String city;
    private String state;

}
