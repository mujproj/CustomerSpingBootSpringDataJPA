package springbootrestjpa.springbootrestjpa1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootrestjpa.springbootrestjpa1.entities.Customer;
import springbootrestjpa.springbootrestjpa1.service.ICustomerService;

@RestController
public class CustomerController {

	@Autowired
	private ICustomerService customerService;

	@PostMapping("/addCustomer")
	public Customer addCustomer(Customer customer) {
		customer = new Customer("ABC");
		customer = customerService.register(customer);
		return customer;
	}
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		List<Customer> customers = customerService.findAll();
		return customers;
	}

}
