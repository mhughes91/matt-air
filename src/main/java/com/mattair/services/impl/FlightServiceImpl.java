package com.mattair.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mattair.domain.Flight;
import com.mattair.repositories.FlightRepository;
import com.mattair.services.FlightService;

@Service
public class FlightServiceImpl implements FlightService {

    private FlightRepository flightRepository;

    @Autowired
    public FlightServiceImpl(final FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

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
