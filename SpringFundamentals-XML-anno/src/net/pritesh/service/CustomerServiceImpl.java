package net.pritesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.pritesh.model.Customer;
import net.pritesh.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService
{
	//@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	public final void setCustomerRepository(CustomerRepository customerRepository)
	{
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see net.pritesh.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll()
	{
		return customerRepository.findAll();
	}
}
