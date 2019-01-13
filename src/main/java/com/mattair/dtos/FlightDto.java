package com.mattair.dtos;

public class FlightDto extends BaseEntityDto {

    private static final long serialVersionUID = 7203561586001401826L;

    private PlaneDto plane;
    private LocationDto startLocation;
    private LocationDto destination;
    private String departureDateTime;
    private String arrivalDateTime;
    private String createdDateTime;

    public FlightDto() {}

    public FlightDto(final Integer id, final PlaneDto plane, final LocationDto startLocation,
                     final LocationDto destination, final String departureDateTime, final String arrivalDateTime,
                     final String createdDateTime) {
        setId(id);
        this.plane = plane;
        this.startLocation = startLocation;
        this.destination = destination;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.createdDateTime = createdDateTime;
    }

    public PlaneDto getPlane() {
        return plane;
    }

    public void setPlane(PlaneDto plane) {
        this.plane = plane;
    }

    public LocationDto getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(LocationDto startLocation) {
        this.startLocation = startLocation;
    }

    public LocationDto getDestination() {
        return destination;
    }

    public void setDestination(LocationDto destination) {
        this.destination = destination;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public static class Builder {
        private Integer id;
        private PlaneDto plane;
        private LocationDto startLocation;
        private LocationDto destination;
        private String departureDateTime;
        private String arrivalDateTime;
        private String createdDateTime;
        private int version;

        public Builder setId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder setPlane(PlaneDto plane) {
            this.plane = plane;
            return this;
        }

        public Builder setStartLocation(LocationDto startLocation) {
            this.startLocation = startLocation;
            return this;
        }

        public Builder setDestination(LocationDto destination) {
            this.destination = destination;
            return this;
        }

        public Builder setDepartureDateTime(String departureDateTime) {
            this.departureDateTime = departureDateTime;
            return this;
        }

        public Builder setArrivalDateTime(String arrivalDateTime) {
            this.arrivalDateTime = arrivalDateTime;
            return this;
        }

        public Builder setCreatedDateTime(String createdDateTime) {
            this.createdDateTime = createdDateTime;
            return this;
        }

        public Builder setVersion(int version) {
            this.version = version;
            return this;
        }

        public FlightDto createFlightDto() {
            return new FlightDto(id, plane, startLocation, destination, departureDateTime, arrivalDateTime, createdDateTime);
        }
    }
}
