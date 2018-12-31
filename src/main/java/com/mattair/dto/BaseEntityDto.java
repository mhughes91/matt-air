package com.mattair.dto;

import java.io.Serializable;

public abstract class BaseEntityDto implements Serializable {

    private static final long serialVersionUID = -4996307973944147354L;

    private Integer id;
    private int version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
