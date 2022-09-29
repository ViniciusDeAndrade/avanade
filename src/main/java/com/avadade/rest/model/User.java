package com.avadade.rest.model;


import com.avadade.rest.dto.UserDTO;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String cpf;

    @NonNull
    private LocalDate birthDate;

    @NonNull
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public UserDTO toDto() {
        return new UserDTO(this.id, this.name, this.address.toDto());
    }

}
