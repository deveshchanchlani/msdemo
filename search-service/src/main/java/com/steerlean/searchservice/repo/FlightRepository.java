package com.steerlean.searchservice.repo;


import java.util.List;

import com.steerlean.searchservice.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FlightRepository extends JpaRepository<Flight, Long> {
	List<Flight> findByOriginAndDestinationAndFlightDate(String origin, String destination, String flightDate);

	Flight findByFlightNumberAndFlightDate(String flightNumber, String flightDate);
} 