package com.example.requestbody_test.config;

import com.example.requestbody_test.model.Movie;
import com.example.requestbody_test.repository.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    private MovieRepository movieRepository;

    public InitData(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        movieRepository.save(new Movie("The Godfather", "Movie #1", 1972));
        movieRepository.save(new Movie("The Shawshank Redemption", "Movie #2", 1994));
        movieRepository.save(new Movie("The Dark Knight", "Movie #3", 2008));
        movieRepository.save(new Movie("12 Angry Men", "Movie #4", 1957));
    }
}
