package com.mattair.controller.impl;

import com.mattair.controller.FlightController;
import com.mattair.domain.Flight;
import com.mattair.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mattair/flight")
public class FlightControllerImpl implements FlightController {

    @Autowired
    private FlightService flightService;

    @Override
    @GetMapping("/all")
    public List<Flight> getAllFlights() {
        return this.flightService.getAllFlights();
    }

    @Override
    @PostMapping("/save")
    public void save(@RequestBody final Flight flight) {
        this.flightService.save(flight);
    }



}
