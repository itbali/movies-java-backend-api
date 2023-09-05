package dev.alexitbali.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/movies/")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping("/imdb/{imdbId}")
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload, @PathVariable String imdbId) {
        return new ResponseEntity<Review>(reviewService.createReview(payload.get("reviewBody"), imdbId), HttpStatus.CREATED);
    }
}
