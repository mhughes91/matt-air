package com.mattair.scheduler.impl;

import com.mattair.domain.Flight;
import com.mattair.domain.Location;
import com.mattair.domain.Plane;
import com.mattair.repositories.LocationRepository;
import com.mattair.repositories.PlaneRepository;
import com.mattair.scheduler.FlightScheduler;
import com.mattair.services.FlightService;
import com.mattair.services.LocationService;
import com.mattair.services.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class FlightSchedulerImpl implements FlightScheduler {

    private final FlightService flightService;
    private final LocationRepository locationRepository;
    private final LocationService locationService;
    private final PlaneRepository planeRepository;
    private final PlaneService planeService;

    private final static Logger LOGGER = Logger.getLogger(FlightSchedulerImpl.class.getName());

    @Autowired
    public FlightSchedulerImpl(final FlightService flightService, final LocationRepository locationRepository,
                               final LocationService locationService, final PlaneRepository planeRepository,
                               final PlaneService planeService) {
        this.flightService = flightService;
        this.locationRepository = locationRepository;
        this.locationService = locationService;
        this.planeRepository = planeRepository;
        this.planeService = planeService;
    }

    @Scheduled(fixedRate = 10000)
    public void generateRandomFlight() {
        final Plane plane = getRandomPlane();
        final Location startLocation = getRandomLocation();
        Location destination = getRandomLocation();

        while (startLocation.getId() == destination.getId() || startLocation.getCity().equals(destination.getCity())) {
            destination = getRandomLocation();
        }

        final Flight flight = new Flight.Builder()
                .setId(null)
                .setPlane(plane)
                .setStartLocation(startLocation)
                .setDestination(destination)
                .setDepartureDateTime(LocalDateTime.now())
                .setArrivalDateTime(LocalDateTime.now())
                .setCreatedDateTime(LocalDateTime.now())
                .createFlight();

        try {
            this.flightService.save(flight);
            LOGGER.log(Level.INFO, "Created Flight Successfully");
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Creating a flight failed", e);
        }
    }

    private Plane getRandomPlane() {
        final int randomNumber = generateRandomNumber(this.planeRepository.count());

        return this.planeService.getPlaneById(randomNumber);
    }

    private Location getRandomLocation() {
        final int randomNumber = generateRandomNumber(this.locationRepository.count());

        return this.locationService.getLocationById(randomNumber);
    }

    private int generateRandomNumber(final long bound) {
        final Random random = new Random();

        return random.nextInt(Math.toIntExact(bound)) + 1;
    }
}
