package com.blurdel.sdjpa.domain.tableperclass;

import jakarta.persistence.Entity;

@Entity
public class Dolphin extends Mammel {

    private Boolean hasSpots;

    public Boolean getHasSpots() {
        return hasSpots;
    }

    public void setHasSpots(Boolean hasSpots) {
        this.hasSpots = hasSpots;
    }
}
