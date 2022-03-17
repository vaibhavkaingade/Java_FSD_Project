package com.vehicle.services;

import java.util.List;

import com.vehicle.entity.Service;


public interface ServiceService {
	void saveService(Service service) ;

	Service getServiceById(long id);

	void deleteServiceById(long id);

	List<Service> getAllServices();
}
