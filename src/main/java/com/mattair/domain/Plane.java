package com.mattair.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "plane")
public class Plane extends BaseEntity {

    private static final long serialVersionUID = 5086573510137758902L;

    private String callSign;
    private String planeType;

    public Plane() {}

    public Plane(final Integer id, final String callSign, final String planeType) {
        setId(id);
        this.callSign = callSign;
        this.planeType = planeType;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }
}
