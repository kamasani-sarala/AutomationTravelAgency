package com.automation.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.automation.entity.Route;

@Service
public interface RouteService {
	 // Method to add a new route
   public Route addRoute(Route route);

    // Method to update an existing route
   public Route updateRoute(Route route);

    // Method to retrieve a route by its ID
   public Route getRouteByrId(int rId) throws Exception;

    // Method to retrieve all routes
   public List<Route> viewAllRoutes();

   public List<Route> sortingBasedOnDistance();

   public void deleteRouteByrId(int rId);
	public List<Route> findByvId(Integer rId);

  



   
}

