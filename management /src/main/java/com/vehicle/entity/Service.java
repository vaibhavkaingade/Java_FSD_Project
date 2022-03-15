package com.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Service {

	@Id
	@GeneratedValue
	int service_id;
	int service_charge;
	String service_type;
	String service_description;

	
	public int getService_charge() {
		return service_charge;
	}

	public void setService_charge(int service_charge) {
		this.service_charge = service_charge;
	}

	public String getService_type() {
		return service_type;
	}

	public void setService_type(String service_type) {
		this.service_type = service_type;
	}

	public String getService_description() {
		return service_description;
	}

	public void setService_description(String service_description) {
		this.service_description = service_description;
	}

	public int getService_id() {
		return service_id;
	}

	@Override
	public String toString() {
		return "Services [service_id=" + service_id + ", service_charge=" + service_charge + ", service_type="
				+ service_type + ", service_description=" + service_description + "]";
	}

}
