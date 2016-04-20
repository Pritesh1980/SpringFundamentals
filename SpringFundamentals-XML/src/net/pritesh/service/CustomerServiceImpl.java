package net.pritesh.service;

import java.util.List;

import net.pritesh.model.Customer;
import net.pritesh.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService
{
	private CustomerRepository customerRepository;

	public CustomerServiceImpl()
	{
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository)
	{
		this.customerRepository = customerRepository;
	}
	
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
