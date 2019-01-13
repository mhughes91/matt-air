package com.mattair.controllers;

import com.mattair.dtos.FlightDto;

public interface FlightController {

    Iterable<FlightDto> getAllFlights();
}
