package com.jovisco.security.authserver.repositories;

import org.springframework.stereotype.Repository;

import com.jovisco.security.authserver.entities.Customer;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

  Optional<Customer> findByEmail(String email);
}
