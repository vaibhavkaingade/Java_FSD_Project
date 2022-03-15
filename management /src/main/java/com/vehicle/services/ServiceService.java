package com.vehicle.services;

import com.vehicle.entity.Service;

public interface ServiceService {
	void saveService(Service service);

	Service getServiceById(long id);

	void deleteServiceById(long id);
}
