package com.mattair.repositories;

import com.mattair.domain.Plane;
import org.springframework.data.repository.CrudRepository;

public interface PlaneRepository extends CrudRepository<Plane, Integer> {
}
