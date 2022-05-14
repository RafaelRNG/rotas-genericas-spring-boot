package br.com.rng.billingcycles.backend.services;

import br.com.rng.billingcycles.backend.entities.User;
import br.com.rng.billingcycles.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void update(Long id, User newUser) {
        User oldUser = this.userRepository.findById(id).get();
        newUser.setId(oldUser.getId());
        this.userRepository.save(newUser);
    }
}