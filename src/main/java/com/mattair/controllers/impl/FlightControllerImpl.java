package com.mattair.controllers.impl;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mattair.controllers.FlightController;
import com.mattair.domain.Flight;
import com.mattair.dtos.FlightDto;
import com.mattair.services.FlightService;

@RestController
@RequestMapping("/mattair/flight")
public class FlightControllerImpl implements FlightController {

    private FlightService flightService;

    private ModelMapper modelMapper;

    @Autowired
    public FlightControllerImpl(final FlightService flightService, final ModelMapper modelMapper) {
        this.flightService = flightService;
        this.modelMapper = modelMapper;
    }

    @Override
    @GetMapping("/all")
    public Iterable<FlightDto> getAllFlights() {
        final List<Flight> flights = newArrayList(this.flightService.getAllFlights());
        final List<FlightDto> flightDtos = newArrayList();

        flights.forEach(flight -> flightDtos.add(this.modelMapper.map(flight, FlightDto.class)));

        return flightDtos;
    }
}
