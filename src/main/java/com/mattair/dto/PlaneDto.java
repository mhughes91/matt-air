package com.mattair.dto;

public class PlaneDto extends BaseEntityDto {

    private static final long serialVersionUID = 3522919754937482743L;

    private String callSign;
    private String planeType;

    public PlaneDto(final Integer id, final String callSign, final String planeType, final int version) {
        setId(id);
        this.callSign = callSign;
        this.planeType = planeType;
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
}
