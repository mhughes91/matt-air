package com.mattair.dto;

public class FlightDto extends BaseEntityDto {

    private static final long serialVersionUID = 7203561586001401826L;

    private PlaneDto plane;
    private LocationDto startLocation;
    private LocationDto destination;
    private String departureDateTime;
    private String arrivalDateTime;
    private String createdDateTime;

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

    public LocationDto getStartLocation() {
        return startLocation;
    }

    public LocationDto getDestination() {
        return destination;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public class FlightDtoBuilder {
        private Integer id;
        private PlaneDto plane;
        private LocationDto startLocation;
        private LocationDto destination;
        private String departureDateTime;
        private String arrivalDateTime;
        private String createdDateTime;
        private int version;

        public FlightDtoBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public FlightDtoBuilder setPlane(PlaneDto plane) {
            this.plane = plane;
            return this;
        }

        public FlightDtoBuilder setStartLocation(LocationDto startLocation) {
            this.startLocation = startLocation;
            return this;
        }

        public FlightDtoBuilder setDestination(LocationDto destination) {
            this.destination = destination;
            return this;
        }

        public FlightDtoBuilder setDepartureDateTime(String departureDateTime) {
            this.departureDateTime = departureDateTime;
            return this;
        }

        public FlightDtoBuilder setArrivalDateTime(String arrivalDateTime) {
            this.arrivalDateTime = arrivalDateTime;
            return this;
        }

        public FlightDtoBuilder setCreatedDateTime(String createdDateTime) {
            this.createdDateTime = createdDateTime;
            return this;
        }

        public FlightDtoBuilder setVersion(int version) {
            this.version = version;
            return this;
        }

        public FlightDto createFlightDto() {
            return new FlightDto(id, plane, startLocation, destination, departureDateTime, arrivalDateTime, createdDateTime);
        }
    }
}
