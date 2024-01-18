package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.MovieRepository;
import com.app.dto.MovieDTO;
import com.app.entity.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Long addMovie(MovieDTO movieDTO) {
        // Implement logic to add a movie
        Movie movie = new Movie();
        // set movieDTO properties to movie
        movieRepository.save(movie);
        return movie.getId();
    }
}
