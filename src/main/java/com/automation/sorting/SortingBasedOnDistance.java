package com.automation.sorting;

import java.util.Comparator;

import com.automation.entity.Route;

public class SortingBasedOnDistance implements Comparator<Route> {

	@Override
	public int compare(Route o1, Route o2) {
		// TODO Auto-generated method stub
		return o2.getDistance()- o1.getDistance();
	}

}
