package com.mattair.services.impl;

import com.mattair.domain.Location;
import com.mattair.repositories.LocationRepository;
import com.mattair.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Optional<Location> getLocationById(final int id) {
        return this.locationRepository.findById(id);
    }
}
