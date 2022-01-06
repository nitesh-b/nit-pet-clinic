package com.niteshb.nitpetclinic.models;

public class Person extends BaseEntity {
    private String firstName;
    private String lstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLstName() {
        return lstName;
    }

    public void setLstName(String lstName) {
        this.lstName = lstName;
    }
}
