package dev.tobiadegbuji.realestatesaas.domain;

import dev.tobiadegbuji.realestatesaas.enums.StateEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@Builder
public class User extends BaseEntity{

    private String firstName;

    private String lastName;

    private String email;

    private String username;

    private String password;

    @Column(length = 10)
    private String phoneNumber;

    private String streetAddress;

    private String suite_apt_number;

    private String city;

    @Enumerated(EnumType.STRING)
    private StateEnum state;

    //Numbers don't have leading zeros.
    // The presence of meaningful leading zeros on ZIP codes is yet another proof that they're not numeric.
    @Column(length = 5)
    private String zipcode;

}
