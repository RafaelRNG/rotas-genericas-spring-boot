package br.com.rng.billingcycles.backend.controllers;

import br.com.rng.billingcycles.backend.entities.User;
import br.com.rng.billingcycles.backend.repositories.UserRepository;
import br.com.rng.billingcycles.backend.utils.GenericService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController extends GenericService<User> {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

    @GetMapping(path = "/{id}")
    public User findUser(@PathVariable Long id) {
        return this.findById(id);
    }
}