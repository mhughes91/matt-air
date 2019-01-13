package com.mattair.services.impl;

import com.mattair.domain.Flight;
import com.mattair.repositories.FlightRepository;
import com.mattair.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepository flightRepository;

    @Override
    public Iterable<Flight> getAllFlights() {
        return this.flightRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Flight flight) {
        this.flightRepository.save(flight);
    }
}
