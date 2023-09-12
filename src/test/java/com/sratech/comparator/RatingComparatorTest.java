package com.sratech.comparator;

import com.sratech.comparable.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RatingComparatorTest {

    private RatingComparator ratingComparator;
    @BeforeEach
    public void setUp(){
        ratingComparator = new RatingComparator();
    }

    @Test
    public void compareMoviesTestWhereMovie1RatingGreaterThanMovie2Rating(){
        Movie movie1 = new Movie("Dilwale Dulhania Le Jayenge", 1995, 10.0);
        Movie movie2 = new Movie("Chalte Chalte", 2003, 8.9);
        assertEquals(1, ratingComparator.compare(movie1, movie2));
    }

    @Test
    public void compareMoviesTestWhereMovie1RatingLesserThanMovie2Rating(){
        Movie movie1 = new Movie("Anjaam", 1994, 6.0);
        Movie movie2 = new Movie("Chalte Chalte", 2003, 8.9);
        assertEquals(-1, ratingComparator.compare(movie1, movie2));
    }

    @Test
    public void compareMoviesTestWhereMovie1RatingSameAsMovie2Rating(){
        Movie movie1 = new Movie("Om Shanti Om", 2007, 8.9);
        Movie movie2 = new Movie("Chalte Chalte", 2003, 8.9);
        assertEquals(0, ratingComparator.compare(movie1, movie2));
    }

}
