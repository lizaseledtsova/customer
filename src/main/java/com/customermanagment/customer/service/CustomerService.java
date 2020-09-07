package com.customermanagment.customer.service;

import com.customermanagment.customer.models.Customer;

import java.util.List;
import java.util.Optional;


public interface CustomerService {
    Optional<Customer> getByid(Long id);
    List<Customer> getAll();
    void save(Customer customer);
    void delete(Long id);




}
