package springbootrestjpa.springbootrestjpa1.service;

import java.util.List;

import springbootrestjpa.springbootrestjpa1.entities.Customer;

public interface ICustomerService {

	Customer register(Customer customer);

	Customer update(Customer customer);

	List<Customer> findAll();
}
