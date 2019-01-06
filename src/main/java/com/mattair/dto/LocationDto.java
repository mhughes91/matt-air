package com.mattair.dto;

public class LocationDto extends BaseEntityDto {

    private static final long serialVersionUID = 955283895136549420L;

    private String city;
    private String country;

    public LocationDto() {}

    public LocationDto(final Integer id, final String city, final String country, final int version) {
        setId(id);
        this.city = city;
        this.country = country;
        setVersion(version);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
