package com.rating.RatingService.Service;

import com.rating.RatingService.Entity.Rating;
import com.rating.RatingService.Repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingServices {

    @Autowired
    private RatingRepository ratingRepository;


    public Rating addRating (Rating rating){
       return  ratingRepository.save(rating);
    }

    public Rating  getRatingByHotelId(Long hotelid){
       return  ratingRepository.findByHotelId(hotelid);
    }
}
