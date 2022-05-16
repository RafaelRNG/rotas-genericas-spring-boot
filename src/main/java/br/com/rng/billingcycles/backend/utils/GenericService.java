package br.com.rng.billingcycles.backend.utils;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class GenericService<E extends GenericEntity> {

    private JpaRepository<E, Long> repository;

    public GenericService(JpaRepository<E, Long> repository) {
        this.repository = repository;
    }

    public Page<E> pagination(Integer page, Integer lines, String direction, String orderBy) {
        PageRequest pageRequest = PageRequest.of(page, lines, Direction.valueOf(direction), orderBy);

        return this.repository.findAll(pageRequest);
    }

    public E findById(Long id) {
        return this.repository.findById(id).get();
    }

    public void save(E object) {
        this.repository.save(object);
    }

    public void update(Long id, E newObject) {
        E oldObject = this.repository.findById(id).get();
        newObject.setId(oldObject.getId());

        this.repository.save(newObject);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}