package com.rating.RatingService.Controller;

import com.rating.RatingService.Entity.Rating;
import com.rating.RatingService.Service.RatingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rating")
public class RatingController
{
    @Autowired
    private RatingServices ratingServices;

        @PostMapping("/addrating")
        public ResponseEntity<Rating> addRating(@RequestBody Rating rating){
          Rating newRating=  ratingServices.addRating(rating);
          return  new ResponseEntity<>(newRating, HttpStatus.CREATED);
        }

        @GetMapping("getratingbyhotelid/{hotelid}")
        public  ResponseEntity<Float>getRatingByHotelId(@PathVariable Long hotelid ){
            Rating rating =ratingServices.getRatingByHotelId(hotelid);
            return new ResponseEntity<>(rating.getHotelActualRating(),HttpStatus.OK);
        }
}
