package com.mattair.service.impl;

import com.mattair.domain.Flight;
import com.mattair.repository.FlightRepository;
import com.mattair.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepository flightRepository;

    @Override
    public List<Flight> getAllFlights() {
        return this.flightRepository.getAllFlights();
    }

    @Override
    @Transactional
    public void save(Flight flight) {
        this.flightRepository.save(flight);
    }
}
