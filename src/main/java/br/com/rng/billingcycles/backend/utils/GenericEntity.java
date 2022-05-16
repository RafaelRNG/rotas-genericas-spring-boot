package br.com.rng.billingcycles.backend.utils;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class GenericEntity {

    private Long id;

    public GenericEntity(){}

    public GenericEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}