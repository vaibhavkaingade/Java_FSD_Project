package com.vehicle.services;

import java.util.List;

import com.vehicle.entity.Vehicle;

public interface VehicleService {
	List<Vehicle> getAllVehicles();
	void saveVehicle(Vehicle vehicle);
	Vehicle getVehicleById(long id);
	void deleteVehicleById(long id);
}
