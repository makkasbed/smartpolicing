package com.logiclabent.smartpolicing.smartpolicy.models;

import java.util.List;

public class Case {
    String id, case_type, created_at, updated_at, user_id, complainant, complainant_id, id_type, details, district_id,
            town, station, status;

    List<Evidence> evidences;

    public Case(String id, String case_type, String created_at, String updated_at, String user_id, String complainant,
            String complainant_id, String id_type, String details, String district_id, String town,
            List<Evidence> evidences, String station, String status) {
        this.id = id;
        this.case_type = case_type;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.user_id = user_id;
        this.complainant = complainant;
        this.complainant_id = complainant_id;
        this.id_type = id_type;
        this.details = details;
        this.district_id = district_id;
        this.town = town;
        this.evidences = evidences;
        this.station = station;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getId() {
        return id;
    }

    public String getCaseType() {
        return case_type;
    }

    public String getCreatedAt() {
        return created_at;
    }

    public String getUpdatedAt() {
        return updated_at;
    }

    public String getUserId() {
        return user_id;
    }

    public String getComplainant() {
        return complainant;
    }

    public String getComplainantId() {
        return complainant_id;
    }

    public String getIdType() {
        return id_type;
    }

    public String getDetails() {
        return details;
    }

    public String getDistrictId() {
        return district_id;
    }

    public String getTown() {
        return town;
    }

    public List<Evidence> getEvidences() {
        return evidences;
    }

    public String getStation() {
        return station;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCaseType(String case_type) {
        this.case_type = case_type;
    }

    public void setCreatedAt(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdatedAt(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setUserId(String user_id) {
        this.user_id = user_id;
    }

    public void setComplainant(String complainant) {
        this.complainant = complainant;
    }

    public void setComplainantId(String complainant_id) {
        this.complainant_id = complainant_id;
    }

    public void setIdType(String id_type) {
        this.id_type = id_type;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setDistrictId(String district_id) {
        this.district_id = district_id;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setEvidences(List<Evidence> evidences) {
        this.evidences = evidences;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
