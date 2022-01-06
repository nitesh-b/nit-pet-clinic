package com.niteshb.nitpetclinic.models;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id; //hibernate recommendation: primitive could be null, not this one

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
