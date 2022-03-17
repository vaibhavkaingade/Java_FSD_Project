package com.vehicle.services;

import com.vehicle.entity.Vehicle;

public interface VehicleService {

	void savevehicle(Vehicle vehicle);
	Vehicle getVehicleById(long id);
	void deletevehicleById(long id);
}
