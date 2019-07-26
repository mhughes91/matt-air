package com.mattair.services.impl;

import org.springframework.stereotype.Service;

import com.mattair.domain.Plane;
import com.mattair.repositories.PlaneRepository;
import com.mattair.services.PlaneService;

@Service
public class PlaneServiceImpl implements PlaneService {

    private PlaneRepository planeRepository;

    public PlaneServiceImpl(final PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }

    @Override
    public Plane getPlaneById(final Integer id) {
        return this.planeRepository.findById(id).orElse(null);
    }
}
