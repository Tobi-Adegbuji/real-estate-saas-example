package dev.tobiadegbuji.realestatesaas.dto;

import dev.tobiadegbuji.realestatesaas.enums.ContactMethodEnum;
import dev.tobiadegbuji.realestatesaas.enums.StateEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.UUID;


@Getter
@Setter
public class CustomerData {

    private UUID id;

    private String firstName;

    private String lastName;

    private String email;

    private String username;

    private String phoneNumber;

    private String streetAddress;

    private String suite_apt_number;

    private String city;

    private StateEnum state;

    private String zipcode;

    private String companyName;

    private String website;

    private String crmEmail;

    private String externalEmail;

    private String title;

    private String license_dre;

    private ContactMethodEnum contactMethod;


}
