package com.avadade.rest.form;

import com.avadade.rest.model.Address;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressForm {
    private String street;
    private String number;
    private String city;
    private String state;

    public Address toAddress() {
        return new Address(this.street, this.number, this.city, this.state);
    }
}
