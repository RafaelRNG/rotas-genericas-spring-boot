package br.com.rng.billingcycles.backend.controllers;

import br.com.rng.billingcycles.backend.entities.User;
import br.com.rng.billingcycles.backend.repositories.UserRepository;
import br.com.rng.billingcycles.backend.utils.GenericService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/users")
public class UserController extends GenericService<User> {

    public UserController(UserRepository userRepository) {
        super(userRepository);
    }

    @GetMapping
    public ResponseEntity<Page<User>> findAll(@RequestParam(name = "page", defaultValue = "0") Integer page,
            @RequestParam(name = "lines", defaultValue = "10") Integer lines,
            @RequestParam(name = "direction", defaultValue = "ASC") String direction,
            @RequestParam(name = "orderBy", defaultValue = "id") String orderBy) {

        return ResponseEntity.ok(this.pagination(page, lines, direction, orderBy));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<User> findUser(@PathVariable Long id) {
        return ResponseEntity.ok(this.findById(id));
    }
}