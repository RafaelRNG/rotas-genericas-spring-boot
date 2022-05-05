package br.com.rng.billingcycles.backend.configurations;

import br.com.rng.billingcycles.backend.database.InitialDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfiguration {

    @Autowired
    private InitialDatabase initialDatabase;

    @Bean
    public boolean startDB() {
        this.initialDatabase.startDatabase();

        return true;
    }
}