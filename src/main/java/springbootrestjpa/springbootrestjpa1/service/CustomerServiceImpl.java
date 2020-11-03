package springbootrestjpa.springbootrestjpa1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springbootrestjpa.springbootrestjpa1.dao.ICustomerRepository;
import springbootrestjpa.springbootrestjpa1.entities.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepository customerDao;

	@Override
	public Customer register(Customer customer) {
		Customer cust = customerDao.save(customer);
		return cust;
	}

	@Override
	public Customer update(Customer customer) {
		Customer cust = customerDao.save(customer);
		return cust;
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = (List<Customer>) customerDao.findAll();
		return customers;
	}

}
