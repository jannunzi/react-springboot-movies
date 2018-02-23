package edu.neu.cs4500;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
 
    private final MovieRepository repository;
 
    @Autowired
    public DatabaseLoader(MovieRepository repository) {
        this.repository = repository;
    }
 
    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Movie("tt0083658", "Blade Runner"));
        this.repository.save(new Movie("tt1856101", "Blade Runner 2049"));
        this.repository.save(new Movie("tt0499549", "Avatar"));
    }
}