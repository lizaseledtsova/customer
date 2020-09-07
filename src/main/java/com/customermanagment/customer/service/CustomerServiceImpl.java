package com.customermanagment.customer.service;

import com.customermanagment.customer.models.Customer;
import com.customermanagment.customer.repository.ICustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    ICustomerRepository icustomerRepository;

    @Override
    public void save(Customer customer) {
        log.info("IN CustomerServiceImpl save {}", customer);
       icustomerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("IN CustomerServiceImpl delete {}", id);
        icustomerRepository.delete(id);
    }

    @Override
    public Optional<Customer> getByid(Long id) {
        log.info("IN CustomerServiceImpl getById {}", id);
        return icustomerRepository.findOne(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("IN CustomerServiceImpl getAll");
        return icustomerRepository.findAll();
    }
}