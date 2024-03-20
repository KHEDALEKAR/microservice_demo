package com.example.rating;

import com.example.rating.entities.Rating;
import com.example.rating.service.RatingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RatingApplicationTests {

	@Autowired
	private RatingService ratingService;

	@Test
	void contextLoads() {
	}

//	@Test
//	void createRating(){
//		Rating rating = Rating.builder().rating(10).remark("7").userId("").ratingId("").remark("Average").build();
//		Rating savedRating = ratingService.createRating(rating);
//	}


}
