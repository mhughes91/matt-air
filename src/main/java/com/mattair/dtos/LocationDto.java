package com.mattair.dtos;

public class LocationDto extends BaseEntityDto {

    private static final long serialVersionUID = 955283895136549420L;

    private String name;
    private String city;
    private String country;

    public LocationDto() {}

    public LocationDto(final Integer id, final String name, final String city, final String country, final int version) {
        setId(id);
        this.name = name;
        this.city = city;
        this.country = country;
        setVersion(version);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
