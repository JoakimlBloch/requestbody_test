package com.example.requestbody_test.controller;

import com.example.requestbody_test.model.Movie;
import com.example.requestbody_test.repository.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/all")
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @PostMapping("/add")
    public Movie addMovie(@RequestBody Movie newMovie) {
        return movieRepository.save(newMovie);
    }
}
