package com.example.springCURD1.Repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springCURD1.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
    // Custom query methods (if necessary)
}
