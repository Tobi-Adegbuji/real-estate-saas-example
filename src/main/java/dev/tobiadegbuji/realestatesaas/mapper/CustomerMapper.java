package dev.tobiadegbuji.realestatesaas.mapper;

import dev.tobiadegbuji.realestatesaas.domain.Customer;
import dev.tobiadegbuji.realestatesaas.dto.CustomerData;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDataToCustomer(CustomerData customerData);

    CustomerData customerToCustomerData(Customer customer);

}
