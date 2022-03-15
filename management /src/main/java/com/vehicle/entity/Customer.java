package com.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	int customer_id;

	String customer_name;
	String customer_email_id;
	String customer_phone_number;

	public Customer(String customer_name, String customer_email_id, String customer_phone_number) {
		super();
		this.customer_name = customer_name;
		this.customer_email_id = customer_email_id;
		this.customer_phone_number = customer_phone_number;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_email_id() {
		return customer_email_id;
	}

	public void setCustomer_email_id(String customer_email_id) {
		this.customer_email_id = customer_email_id;
	}

	public String getCustomer_phone_number() {
		return customer_phone_number;
	}

	public void setCustomer_phone_number(String customer_phone_number) {
		this.customer_phone_number = customer_phone_number;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_email_id="
				+ customer_email_id + ", customer_phone_number=" + customer_phone_number + "]";
	}

}
