package com.mattair.dtos;

public class PlaneDto extends BaseEntityDto {

    private static final long serialVersionUID = 3522919754937482743L;

    private String callSign;
    private String planeType;
    private String inUse;

    public PlaneDto() {}

    public PlaneDto(final Integer id, final String callSign, final String planeType, final String inUse,
                    final int version) {
        setId(id);
        this.callSign = callSign;
        this.planeType = planeType;
        this.inUse = inUse;
        setVersion(version);
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

    public String getInUse() {
        return inUse;
    }

    public void setInUse(String inUse) {
        this.inUse = inUse;
    }
}
