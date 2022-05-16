package br.com.rng.billingcycles.backend.entities;

import br.com.rng.billingcycles.backend.utils.GenericEntity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_users")
public class User extends GenericEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public User() {
    }

    public User(Long id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}