package springbootrestjpa.springbootrestjpa1.dao;

import org.springframework.data.repository.CrudRepository;

import springbootrestjpa.springbootrestjpa1.entities.Customer;

public interface ICustomerRepository extends CrudRepository<Customer, Long>{

}
