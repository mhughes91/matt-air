package com.mattair.controller.impl;

import com.mattair.controller.FlightController;
import com.mattair.domain.Flight;
import com.mattair.dto.FlightDto;
import com.mattair.service.FlightService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

@RestController
@RequestMapping("/mattair/flight")
public class FlightControllerImpl implements FlightController {

    @Autowired
    private FlightService flightService;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    @GetMapping("/all")
    public Iterable<FlightDto> getAllFlights() {
        final List<Flight> flights = newArrayList(this.flightService.getAllFlights());
        final List<FlightDto> flightDtos = newArrayList();

        for (final Flight flight : flights) {
            flightDtos.add(this.modelMapper.map(flight, FlightDto.class));
        }

        return flightDtos;
    }
}
