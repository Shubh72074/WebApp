package com.shubh.WebApp;

public class Employee {
    private String name;
    private long id;
    private String contactNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
