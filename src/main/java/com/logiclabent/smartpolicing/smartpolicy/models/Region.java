package com.logiclabent.smartpolicing.smartpolicy.models;

import java.util.UUID;

public class Region {
    public UUID id;
    public String name;

    public Region(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
