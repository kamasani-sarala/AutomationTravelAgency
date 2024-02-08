package com.automation.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automation.entity.Route;
import com.automation.entity.Vehicle;
import com.automation.repository.VehicleRepository;
import com.automation.sorting.SortingBasedOnCapacity;
import com.automation.sorting.SortingBasedOnDistance;

@Service
public class VehicleServiceImpl implements VehicleService {
    
	@Autowired
	public VehicleRepository vehicleRepo;
	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return vehicleRepo.save(vehicle);
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		Vehicle v = vehicle;
		try {
			v = getVehicleByvId(vehicle.getvId());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        if (v== null) {
            throw new NumberFormatException("No Vehicle Exits with same this vid: " + vehicle.getvId());
        }

 

        return vehicleRepo.save(vehicle);
    }


	@Override
	public Vehicle getVehicleByvId(int vId) throws Exception {
		// TODO Auto-generated method stub
		if(vId == 0) {
			throw new Exception("invalid vId is not excepted");
		}
		
		return vehicleRepo.getVehicleByvId(vId) ;
	}
	
	@Override
	public List<Vehicle> viewAllVehicles() {
		// TODO Auto-generated method stub
		List<Vehicle> allVehicle= vehicleRepo.findAll(); // Note : same as save
		return allVehicle;
	}
	
	@Override
	public List<Vehicle> sortingBasedOnCapacity() {
		// TODO Auto-generated method stub
		List<Vehicle> list = vehicleRepo.findAll();

		List<Vehicle> vehicle = new ArrayList<>();

		Collections.sort(list, new SortingBasedOnCapacity());

		return list;
	}

	@Override
	public void deleteVehicleByvId(int vId) {
		// TODO Auto-generated method stub
		vehicleRepo.deleteById(vId);
	}
}
