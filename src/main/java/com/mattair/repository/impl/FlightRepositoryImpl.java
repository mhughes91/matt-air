package com.mattair.repository.impl;

import com.mattair.domain.Flight;
import com.mattair.repository.FlightRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
public class FlightRepositoryImpl implements FlightRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Flight> getAllFlights() {
        //Works but commented out code below is better, needs chaging
        CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Flight> criteria = builder.createQuery(Flight.class);
        criteria.from(Flight.class);

        return this.entityManager.createQuery(criteria).getResultList();


//        final String queryString = "from Flight";
//
//        return this.entityManager.createQuery(queryString, Flight.class).getResultList();

    }

    @Override
    public void save(final Flight flight) {
        this.entityManager.persist(flight);
    }
}
