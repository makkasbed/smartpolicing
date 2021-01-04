package com.logiclabent.smartpolicing.smartpolicy.models;

import java.util.UUID;

public class District {
    public UUID id;
    public String district;
    public String region_id;

    public District(UUID id, String district, String region_id) {
        this.id = id;
        this.district = district;
        this.region_id = region_id;
    }

    public UUID getId() {
        return id;
    }

    public String getDistrict() {
        return district;
    }

    public String getRegionId() {
        return region_id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setRegionId(String region_id) {
        this.region_id = region_id;
    }
}
