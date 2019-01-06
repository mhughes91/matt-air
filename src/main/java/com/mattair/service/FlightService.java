package com.mattair.service;

import com.mattair.domain.Flight;

public interface FlightService {

    Iterable<Flight> getAllFlights();

    void save(final Flight flight);
}
