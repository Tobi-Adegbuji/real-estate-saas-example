package dev.tobiadegbuji.realestatesaas.domain;

import dev.tobiadegbuji.realestatesaas.enums.ContactMethodEnum;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Customer extends User {

    @Column(nullable = false)
    private String companyName;

    private String website;

    private String crmEmail;

    private String externalEmail;

    private String title;

    private String license_dre;

    @Enumerated(EnumType.STRING)
    private ContactMethodEnum contactMethod;

    @OneToMany
    private Set<CustomerContact> customerContactSet;


}
