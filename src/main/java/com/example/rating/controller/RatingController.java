package com.example.rating.controller;

import com.example.rating.entities.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.rating.service.RatingService;

import java.util.List;

@RestController
@RequestMapping(value = "/rate")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> SayHi(){
        String str = "Hi Ayushi";
        return ResponseEntity.ok(str);
    }

    @RequestMapping(value = "/createRating", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        Rating rating1 = ratingService.createRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }

    @GetMapping("/{ratingId}")
    public ResponseEntity<Rating> getRatingById(@PathVariable String ratingId){
        Rating rating = ratingService.getRatingById(ratingId);
        return ResponseEntity.ok(rating);
    }

    @GetMapping("users/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
        List<Rating> ratings = ratingService.getRatingByUserId(userId);
        return ResponseEntity.ok(ratings);
    }

    @GetMapping("hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
        List<Rating> ratings = ratingService.getRatingByHotelId(hotelId);
        return ResponseEntity.ok(ratings);
    }

    @RequestMapping(value = "/getAllRatings", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Rating>> getAllRatings(){
        List<Rating> ratings = ratingService.getAllRating();
        return ResponseEntity.ok(ratings);
    }

}
