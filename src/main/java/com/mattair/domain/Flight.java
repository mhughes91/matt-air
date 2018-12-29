package com.mattair.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "flight")
public class Flight extends BaseEntity {

    private static final long serialVersionUID = -4970497115161591143L;

    @OneToOne
    @JoinColumn(name = "FK_PlaneID")
    private Plane plane;

    @OneToOne
    @JoinColumn(name = "FK_StartLocationID")
    private Location startLocation;

    @OneToOne
    @JoinColumn(name = "FK_DestinationID")
    private Location destination;

    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private LocalDateTime createdDateTime;

    public Flight() {}

    public Flight(final Integer id, final Plane plane, final Location startLocation, final Location destination,
                  final LocalDateTime departureDateTime, final LocalDateTime arrivalDateTime,
                  final LocalDateTime createdDateTime) {
        setId(id);
        this.plane = plane;
        this.startLocation = startLocation;
        this.destination = destination;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.createdDateTime = createdDateTime;
    }

    public Plane getPlane() {
        return plane;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public Location getDestination() {
        return destination;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public class FlightBuilder {
        private Integer id;
        private Plane plane;
        private Location startLocation;
        private Location destination;
        private LocalDateTime departureDateTime;
        private LocalDateTime arrivalDateTime;
        private LocalDateTime createdDateTime;

        public FlightBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public FlightBuilder setPlane(Plane plane) {
            this.plane = plane;
            return this;
        }

        public FlightBuilder setStartLocation(Location startLocation) {
            this.startLocation = startLocation;
            return this;
        }

        public FlightBuilder setDestination(Location destination) {
            this.destination = destination;
            return this;
        }

        public FlightBuilder setDepartureDateTime(LocalDateTime departureDateTime) {
            this.departureDateTime = departureDateTime;
            return this;
        }

        public FlightBuilder setArrivalDateTime(LocalDateTime arrivalDateTime) {
            this.arrivalDateTime = arrivalDateTime;
            return this;
        }

        public FlightBuilder setCreatedDateTime(LocalDateTime createdDateTime) {
            this.createdDateTime = createdDateTime;
            return this;
        }

        public Flight createFlight() {
            return new Flight(id, plane, startLocation, destination, departureDateTime, arrivalDateTime, createdDateTime);
        }
    }
}
