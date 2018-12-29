package com.mattair.controller;

import com.mattair.domain.Flight;

import java.util.List;

public interface FlightController {

    List<Flight> getAllFlights();

    void save(final Flight flight);
}
