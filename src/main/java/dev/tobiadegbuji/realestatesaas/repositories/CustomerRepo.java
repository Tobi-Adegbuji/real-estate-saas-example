package dev.tobiadegbuji.realestatesaas.repositories;

import dev.tobiadegbuji.realestatesaas.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, UUID> {
}
