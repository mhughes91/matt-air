package com.mattair.services;

import com.mattair.domain.Location;

import java.util.Optional;

public interface LocationService {

    Optional<Location> getLocationById(final int id);
}
