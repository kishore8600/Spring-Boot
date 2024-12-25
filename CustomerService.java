package com.example.springCURD1.Service;

import com.example.springCURD1.DTO.CustomerDTO;

import java.util.List;

public interface CustomerService {
    String saveOrUpdateCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> getAllCustomers();
    String deleteCustomer(int id);
}
