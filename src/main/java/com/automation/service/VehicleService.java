package com.automation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.automation.entity.Route;
import com.automation.entity.Vehicle;
@Service
public interface VehicleService {
	
	    // Method to add a new vehicle
	   public Vehicle addVehicle(Vehicle vehicle);

	    // Method to update an existing vehicle
	    public Vehicle updateVehicle(Vehicle vehicle);

	    // Method to retrieve a vehicle by its ID
	    public Vehicle getVehicleByvId(int vId) throws Exception;

	    // Method to retrieve all vehicles
	    public List<Vehicle> viewAllVehicles();

		public List<Vehicle> sortingBasedOnCapacity();

		public void deleteVehicleByvId(int vId);

		


		
	}


