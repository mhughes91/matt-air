package com.mattair.scheduler;

import com.mattair.domain.Flight;
import com.mattair.domain.Location;
import com.mattair.domain.Plane;
import com.mattair.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class FlightScheduler {

    @Autowired
    private FlightService flightService;

    private final static Logger LOGGER = Logger.getLogger(FlightScheduler.class.getName());

    @Scheduled(fixedRate = 10000)
    public void generateRandomFlight() {
        final Plane plane = new Plane(1,"1234","747");
        final Location start = new Location(1, "Manchester", "England");
        final Location destination = new Location(1, "Manchester", "England");
        final LocalDateTime time = LocalDateTime.now();

        Flight flight = new Flight(null,plane,start,destination,time, time, time);

        try {
            this.flightService.save(flight);
            LOGGER.log(Level.INFO, "Generated Flight Successfully");
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Generating a random flight failed", e);
        }
    }
}
