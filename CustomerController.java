package com.example.springCURD1.Controller;

import com.example.springCURD1.DTO.CustomerDTO;
import com.example.springCURD1.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/saveOrUpdate")
    public String saveOrUpdateCustomer(@RequestBody CustomerDTO customerDTO) {
        return customerService.saveOrUpdateCustomer(customerDTO);
    }

    @GetMapping("/getAll")
    public List<CustomerDTO> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
        return customerService.deleteCustomer(id);
    }
}
