package com.blurdel.sdjpa.domain.tableperclass;

import jakarta.persistence.Entity;

@Entity
public class Dog extends Mammel {

    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
