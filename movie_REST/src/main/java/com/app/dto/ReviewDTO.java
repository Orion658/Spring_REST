package com.app.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDTO {
    private Long movieId;
    private String review;
    private int rating;
    private Long userId;
}
