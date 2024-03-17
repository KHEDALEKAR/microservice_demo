package com.example.rating.service;

import com.example.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    public Rating createRating(Rating rating);

    public Rating getRatingById(String reatingId);

    public List<Rating> getAllRating();

    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);
}
