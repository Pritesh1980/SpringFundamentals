package net.pritesh.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.pritesh.model.Customer;

@Repository
public class HibernateCustomerRepositoryImpl implements CustomerRepository
{
	/* (non-Javadoc)
	 * @see net.pritesh.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll()
	{
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstname("John");
		customer.setLastname("Doe");
		
		customers.add(customer);
		
		return customers;
	}
}
