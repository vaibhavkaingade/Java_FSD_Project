package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.entity.*;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
		
}
