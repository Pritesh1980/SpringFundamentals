package net.pritesh.repository;

import java.util.List;

import net.pritesh.model.Customer;

public interface CustomerRepository
{

	List<Customer> findAll();

}