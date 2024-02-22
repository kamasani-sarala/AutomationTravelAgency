package com.automation.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.automation.entity.Route;
@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {

	Route getRouteByrId(int rId);
    
	public List<Route> findByvId(Integer id);
	
	
	@Query("from Route r where r.rId=:rId")
	public Route getRoutebyrId(@Param(value="rId")Integer rId );

	
	@Query("from Route r where r.startLocation=:startLocation and r.endLocation=:endLocation")
	public Route findRouteBystartLocationandendLocation(@Param(value="startLocation") String startLocation,@Param(value="endLocation")String endLocation);

	

}

