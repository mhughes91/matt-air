package com.mattair.services;

import com.mattair.domain.Flight;

public interface FlightService {

    Iterable<Flight> getAllFlights();

    void save(final Flight flight);
}
