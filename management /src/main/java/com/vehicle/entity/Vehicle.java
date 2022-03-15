package com.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue
	int vehicle_id;
	String vehicle_number;
	String vehicle_type;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	Customer customer;

	String vehicle_desciption;
	String vehicle_service_status;

	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getVehicle_number() {
		return vehicle_number;
	}

	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}

	public String getVehicle_type() {
		return vehicle_type;
	}

	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getVehicle_desciption() {
		return vehicle_desciption;
	}

	public void setVehicle_desciption(String vehicle_desciption) {
		this.vehicle_desciption = vehicle_desciption;
	}

	public String getVehicle_service_status() {
		return vehicle_service_status;
	}

	public void setVehicle_service_status(String vehicle_service_status) {
		this.vehicle_service_status = vehicle_service_status;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicle_id=" + vehicle_id + ", vehicle_number=" + vehicle_number + ", vehicle_type="
				+ vehicle_type + ", customer=" + customer + ", vehicle_desciption=" + vehicle_desciption
				+ ", vehicle_service_status=" + vehicle_service_status + "]";
	}
}
