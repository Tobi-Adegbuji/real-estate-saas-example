package dev.tobiadegbuji.realestatesaas.service;

import dev.tobiadegbuji.realestatesaas.domain.Customer;
import dev.tobiadegbuji.realestatesaas.dto.CustomerData;
import dev.tobiadegbuji.realestatesaas.mapper.CustomerMapper;
import dev.tobiadegbuji.realestatesaas.repositories.CustomerRepo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    private final CustomerMapper customerMapper;

    public Customer registerCustomer(Customer customer){
        Customer savedCustomer = customerRepo.save(customer);
        return savedCustomer;
    }

}


