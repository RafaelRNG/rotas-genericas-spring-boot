package br.com.rng.billingcycles.backend.database;

import br.com.rng.billingcycles.backend.entities.User;
import br.com.rng.billingcycles.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class InitialDatabase {

    @Autowired
    private UserRepository userRepository;

    public void startDatabase() {
        User rafael = new User(null, "Rafael");
        User neves = new User(null, "Neves");
        User gomila = new User(null, "Gomila");

        this.userRepository.saveAll(Arrays.asList(rafael, neves, gomila));
    }
}