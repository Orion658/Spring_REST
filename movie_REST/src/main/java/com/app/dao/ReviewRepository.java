package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByMovieTitle(String title);
    List<Review> findByUserId(Long userId);
}
