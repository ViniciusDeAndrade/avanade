package com.avadade.rest.model;

import com.avadade.rest.dto.AddressDTO;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "address")
@RequiredArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @NonNull
    private String street;

    @NonNull
    private String number;

    @NonNull
    private String city;

    @NonNull
    private String state;

    public AddressDTO toDto() {
        return new AddressDTO(
                this.street,
                this.number,
                this.city,
                this.state
        );
    }

}
