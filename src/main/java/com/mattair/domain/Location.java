package com.mattair.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class Location extends BaseEntity {

    private static final long serialVersionUID = 4339472500073126516L;

    private String name;
    private String city;
    private String country;

    public Location() {}

    public Location(final Integer id, final String name, final String city, final String country) {
        setId(id);
        this.name = name;
        this.city = city;
        this.country = country;
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
