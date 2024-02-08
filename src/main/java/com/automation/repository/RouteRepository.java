package com.automation.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.automation.entity.Route;
@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {

	Route getRouteByrId(int rId);



	

}

