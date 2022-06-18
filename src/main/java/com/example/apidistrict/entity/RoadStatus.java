package com.example.apidistrict.entity;

public enum RoadStatus {
    USING(1), REPAIR(-1), CONSTRUCTION(0);
    public final Integer value;
    RoadStatus(Integer value) {
        this.value = value;
    }
}
