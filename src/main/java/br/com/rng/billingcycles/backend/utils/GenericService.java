package br.com.rng.billingcycles.backend.utils;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class GenericService<E> {

    private JpaRepository<E, Long> repository;

    public GenericService(JpaRepository<E, Long> repository) {
        this.repository = repository;
    }

    public E findById(Long id) {
        return this.repository.findById(id).get();
    }
}