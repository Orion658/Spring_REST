package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ReviewRepository;
import com.app.dto.ReviewDTO;
import com.app.entity.Review;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public List<ReviewDTO> getReviewsByMovieTitle(String title) {
        // Implement logic to get reviews by movie title
        List<Review> reviews = reviewRepository.findByMovieTitle(title);
        return convertReviewListToDTOList(reviews);
    }

    @Override
    public List<ReviewDTO> getReviewsByUserId(Long userId) {
        // Implement logic to get reviews by user id
        List<Review> reviews = reviewRepository.findByUserId(userId);
        return convertReviewListToDTOList(reviews);
    }

    @Override
    public Long addReview(ReviewDTO reviewDTO) {
        // Implement logic to add a review
        Review review = new Review();
        // set reviewDTO properties to review
        reviewRepository.save(review);
        return review.getId();
    }

    private ReviewDTO convertReviewToDTO(Review review) {
        ReviewDTO reviewDTO = new ReviewDTO();
        reviewDTO.setMovieId(review.getMovie().getId());
        reviewDTO.setReview(review.getReview());
        reviewDTO.setRating(review.getRating());
        reviewDTO.setUserId(review.getUser().getId());
        return reviewDTO;
    }

    private List<ReviewDTO> convertReviewListToDTOList(List<Review> reviews) {
        return reviews.stream()
                .map(this::convertReviewToDTO)
                .collect(Collectors.toList());
    }
}
