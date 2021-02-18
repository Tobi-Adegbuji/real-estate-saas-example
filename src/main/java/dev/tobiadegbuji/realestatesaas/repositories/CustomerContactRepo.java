package dev.tobiadegbuji.realestatesaas.repositories;

import dev.tobiadegbuji.realestatesaas.domain.CustomerContact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomerContactRepo extends CrudRepository<CustomerContact, UUID> {
}
