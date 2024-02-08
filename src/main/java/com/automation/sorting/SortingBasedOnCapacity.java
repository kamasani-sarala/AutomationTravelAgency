package com.automation.sorting;

import java.util.Comparator;

import com.automation.entity.Vehicle;

public class SortingBasedOnCapacity implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		// TODO Auto-generated method stub
		return o2.getCapacity()- o1.getCapacity();
	}

}
