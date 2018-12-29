package com.mattair.service;

import com.mattair.domain.Flight;

import java.util.List;

public interface FlightService {

    List<Flight> getAllFlights();

    void save(final Flight flight);
}
