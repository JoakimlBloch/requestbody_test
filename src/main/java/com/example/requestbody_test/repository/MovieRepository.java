package com.example.requestbody_test.repository;

import com.example.requestbody_test.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {}
