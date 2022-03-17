package com.vehicle.repository;


import org.hibernate.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.entity.Service;

@Repository
public interface ServicesRepository extends JpaRepository<Service, Long>{

	
	
    }
