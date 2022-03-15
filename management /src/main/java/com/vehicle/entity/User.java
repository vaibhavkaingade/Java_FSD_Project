package com.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int user_id;
	private String user_name;
	private String user_password;

	
	public User() {
		
	}
}
	