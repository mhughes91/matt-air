package com.mattair.repository;

import com.mattair.domain.Flight;

import java.util.List;

public interface FlightRepository {

    List<Flight> getAllFlights();

    void save(final Flight flight);
}
