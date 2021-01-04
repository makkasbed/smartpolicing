package com.logiclabent.smartpolicing.smartpolicy.models;

public class User {
    String id, name, district, user_type, region, passwd, email;

    public User(String id, String name, String district, String user_type, String region, String passwd, String email) {
        this.id = id;
        this.name = name;
        this.district = district;
        this.user_type = user_type;
        this.region = region;
        this.passwd = passwd;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    public String getUserType() {
        return user_type;
    }

    public String getRegion() {
        return region;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setUserType(String user_type) {
        this.user_type = user_type;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
