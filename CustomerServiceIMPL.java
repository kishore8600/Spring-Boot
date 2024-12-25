package com.example.springCURD1.Service;

import com.example.springCURD1.Repositery.CustomerRepo;
import com.example.springCURD1.DTO.CustomerDTO;
import com.example.springCURD1.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public String saveOrUpdateCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(           //creates an entity
                customerDTO.getCustomerid(),
                customerDTO.getCustomername(),
                customerDTO.getCustomeraddress(),
                customerDTO.getMobile()
        );
        customerRepo.save(customer);
        return "Customer " + customer.getCustomername() + " saved/updated successfully";
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepo.findAll().stream().map(customer -> new CustomerDTO(
                customer.getCustomerid(),
                customer.getCustomername(),
                customer.getCustomeraddress(),
                customer.getMobile()
        )).collect(Collectors.toList());
    }

    @Override
    public String deleteCustomer(int id) {
        if (customerRepo.existsById((long) id)) {
            customerRepo.deleteById((long) id);
            return "Customer with ID " + id + " deleted successfully";
        }
        return "Customer not found";
    }
}
