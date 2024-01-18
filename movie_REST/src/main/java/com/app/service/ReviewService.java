package com.app.service;

import java.util.List;

import com.app.dto.ReviewDTO;

public interface ReviewService {
    List<ReviewDTO> getReviewsByMovieTitle(String title);
    List<ReviewDTO> getReviewsByUserId(Long userId);
    Long addReview(ReviewDTO reviewDTO);
}