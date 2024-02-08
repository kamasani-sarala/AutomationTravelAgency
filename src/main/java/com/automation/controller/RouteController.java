package com.automation.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.automation.entity.Route;
import com.automation.service.RouteService;
import com.automation.service.RouteServiceImpl;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/Route")
public class RouteController {
	@Autowired
     RouteService routeService;
	
	private final org.slf4j.Logger mylogs = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/")
	public String defaultMessage() {
		return "Welcome to Route Page";
	}
	
	
	//http://localhost:8080/Route/addRoute
	@PostMapping("/addRoute")
	public Route addRoute(@RequestBody Route route)  {
		try {
			return routeService.addRoute(route);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return route;
	}
	//http://localhost:8080/Route/allRoutes
	@GetMapping("/allRoutes")
	public List<Route> viewAllRoute() throws Exception{
	return routeService.viewAllRoutes();
	    }

	
	//http://localhost:8080/Route/updateRoute
	@PutMapping("/updateRoute")
	public Route updateRoute(@RequestBody Route route) throws Exception {
		try {
	        Route existingRoute = routeService.getRouteByrId(route.getrId());
	        if (existingRoute == null) {
	            throw new Exception("Route not found");
	        }
	       
	        // Update the properties of the existing route
	        existingRoute.setrId(route.getrId());
	        existingRoute.setStartLocation(route.getStartLocation());
	        existingRoute.setEndLocation(route.getEndLocation());
	        existingRoute.setDistance(route.getDistance());
	      

	        // Call the updateRoute() method from the routeService to save the changes
	        Route updatedRoute = routeService.updateRoute(existingRoute);
	        
	        return updatedRoute;
	    } catch (Exception e) {
	        e.printStackTrace();
	        throw new Exception("Route not found");
	    }
	}
	
	@DeleteMapping("/delete/{rId}") 
	public String deletebyrId(@PathVariable int rId)  {
	    try {
	        // Assuming routeService.deleteRouteByrId(rId) method exists to perform the delete operation
	        routeService.deleteRouteByrId(rId);
	        mylogs.info("Deleted = " + rId + " Data");
	        return "Deleted Id = " + rId + " Data";
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "Error deleting Id = " + rId + " Data: " + e.getMessage();
	    }
	}

	// localhost:8080/Route/sort/Distance
	@GetMapping("/sort/Distance") 
	public List<Route> getBySorting() {

	List<Route> allRoute = routeService.sortingBasedOnDistance();

	return allRoute;

}
}