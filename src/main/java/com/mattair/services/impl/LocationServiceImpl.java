package com.mattair.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mattair.domain.Location;
import com.mattair.repositories.LocationRepository;
import com.mattair.services.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(final LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public Location getLocationById(final Integer id) {
        return this.locationRepository.findById(id).orElse(null);
    }
}
