package dev.tobiadegbuji.realestatesaas.controller;

import dev.tobiadegbuji.realestatesaas.domain.Customer;
import dev.tobiadegbuji.realestatesaas.domain.User;
import dev.tobiadegbuji.realestatesaas.dto.CustomerData;
import dev.tobiadegbuji.realestatesaas.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final PasswordEncoder passwordEncoder;

    private final CustomerService customerService;

    public ResponseEntity registerUser(@RequestBody RegisterBody registerBody, BindingResult bindingResult) {

        //IF SUCCESS
        Customer customer = (Customer) User.builder()
                .firstName(registerBody.getFirstName())
                .lastName(registerBody.getLastName())
                .email(registerBody.getEmail())
                .username(registerBody.getUsername())
                .password(passwordEncoder.encode(registerBody.getPassword()))
                .phoneNumber(registerBody.getPhoneNumber())
                .build();



        Customer customer1 = customerService.registerCustomer(customer);
        return null;
    }







}

//TODO: Add Validation to the request fields
@Getter
@NoArgsConstructor
class RegisterBody {
    private String firstName;

    private String lastName;

    private String email;

    private String username;

    private String password;

    private String phoneNumber;
}