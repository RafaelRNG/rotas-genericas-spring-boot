package br.com.rng.billingcycles.backend.repositories;

import br.com.rng.billingcycles.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}