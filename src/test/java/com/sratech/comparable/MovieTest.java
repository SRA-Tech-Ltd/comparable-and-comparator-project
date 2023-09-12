package com.sratech.comparable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

    @Test
    public void testCompareTo(){
        Movie movie = new Movie("Dilwale Dulhania Le Jayenge", 1995, 10.0);
        Movie movie2 = new Movie("Chalte Chalte", 2003, 8.9);
        assertEquals(-8, movie.compareTo(movie2));
    }
}
