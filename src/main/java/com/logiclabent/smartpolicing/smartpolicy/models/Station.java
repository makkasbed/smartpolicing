package com.logiclabent.smartpolicing.smartpolicy.models;

import java.util.UUID;

public class Station {
    public UUID id;
    public String name;
    public String district;
    public String location;
    public String phone;
    public String region_id;

    public Station(UUID id, String name, String district, String location, String phone, String region_id) {
        this.id = id;
        this.name = name;
        this.district = district;
        this.location = location;
        this.phone = phone;
        this.region_id = region_id;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setRegionId(String region_id) {
        this.region_id = region_id;
    }

}
