package com.blurdel.sdjpa.domain.tableperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Mammel {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE) // Can not use IDENTITY with TABLE_PER_CLASS
    private Long id;

    private String species;

    private Integer bodyTemp;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Integer getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(Integer bodyTemp) {
        this.bodyTemp = bodyTemp;
    }
}
