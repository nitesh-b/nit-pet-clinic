package com.niteshb.nitpetclinic.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //hibernate recommendation: primitive could be null, not this one

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
