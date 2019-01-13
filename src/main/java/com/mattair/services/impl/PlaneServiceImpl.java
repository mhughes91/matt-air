package com.mattair.services.impl;

import com.mattair.domain.Plane;
import com.mattair.repositories.PlaneRepository;
import com.mattair.services.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaneServiceImpl implements PlaneService {

    @Autowired
    private PlaneRepository planeRepository;

    @Override
    public Plane getPlaneById(final int id) {
        return this.planeRepository.findById(id).get();
    }
}
