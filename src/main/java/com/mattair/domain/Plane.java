package com.mattair.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "plane")
public class Plane extends BaseEntity {

    private static final long serialVersionUID = 5086573510137758902L;

    private String callSign;
    private String planeType;
    private boolean inUse;

    public Plane() {}

    public Plane(final Integer id, final String callSign, final String planeType, final boolean inUse) {
        setId(id);
        this.callSign = callSign;
        this.planeType = planeType;
        this.inUse = inUse;
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

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
}
