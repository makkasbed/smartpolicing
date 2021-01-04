package com.logiclabent.smartpolicing.smartpolicy.models;

import java.util.UUID;

public class Evidence {
    UUID id;
    String name;
    String description;
    String file_type;

    public Evidence(UUID id, String name, String description, String file_type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.file_type = file_type;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getFileType() {
        return file_type;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFileType(String file_type) {
        this.file_type = file_type;
    }
}
