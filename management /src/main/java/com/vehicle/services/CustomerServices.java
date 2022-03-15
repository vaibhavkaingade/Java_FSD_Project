package com.vehicle.services;

import java.util.List;

import com.vehicle.entity.Customer;

public interface CustomerServices {
	List<Customer> getAllCustomer();

	void saveCustomer(Customer customer);

	Customer getCustomerById(long id);

	void deleteCustomerById(long id);

}
