package com.mattair.controller.impl;

import com.mattair.controller.FlightController;
import com.mattair.converter.FlightConverter;
import com.mattair.domain.Flight;
import com.mattair.dto.FlightDto;
import com.mattair.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mattair/flight")
public class FlightControllerImpl implements FlightController {

    @Autowired
    private FlightService flightService;

    @Autowired
    private FlightConverter flightConverter;

    @Override
    @GetMapping("/all")
    public List<FlightDto> getAllFlights() {
        final List<Flight> flights = this.flightService.getAllFlights();

        return flights.stream().map(f -> this.flightConverter.convert(f)).collect(Collectors.toList());
    }
}
