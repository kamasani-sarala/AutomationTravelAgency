package com.automation.service;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.automation.entity.Route;

import com.automation.repository.RouteRepository;
import com.automation.sorting.SortingBasedOnDistance;
@Service
public class RouteServiceImpl implements RouteService {
	
	@Autowired
	RouteRepository routeRepo;

    @Override
    public Route addRoute(Route route) {
    	return routeRepo.save(route);
    }
    @Override
    public Route updateRoute(Route route) {
    	Route r = route;
		try {
			r = getRouteByrId(route.getrId());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        if (r== null) {
            throw new NumberFormatException("No Route Exits with same this vid: " + route.getrId());
        }

 

        return routeRepo.save(route);
    }

    @Override
    public Route getRouteByrId(int rId) throws Exception {
    	if(rId == 0) {
			throw new Exception("invalid rId is not excepted");
		}
		
		return routeRepo.getRouteByrId(rId) ;
	}

    @Override
    public List<Route> viewAllRoutes() {
    	List<Route> allRoutes = routeRepo.findAll(); // Note : same as save
		return allRoutes;

    }

	@Override
	public List<Route> sortingBasedOnDistance() {
		List<Route> list = routeRepo.findAll();

		List<Route> route = new ArrayList<>();

		Collections.sort(list, new SortingBasedOnDistance());

		return list;
	}

	@Override
	public void deleteRouteByrId(int rId) {
		// TODO Auto-generated method stub
		routeRepo.deleteById(rId);
	}
	@Override
	public List<Route> findByvId(Integer rId) {
		// TODO Auto-generated method stub
		return routeRepo.findByvId(rId);
	}

	
}