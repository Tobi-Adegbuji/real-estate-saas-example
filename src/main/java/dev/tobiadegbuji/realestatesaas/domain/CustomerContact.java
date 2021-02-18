package dev.tobiadegbuji.realestatesaas.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class CustomerContact extends User{

    private Long targetHomePrice;

    private String targetHomeCity;

}
