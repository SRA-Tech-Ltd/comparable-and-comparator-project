package com.sratech.comparator;

import com.sratech.comparable.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameComparatorTest {

    private NameComparator nameComparator;
    @BeforeEach
    public void setUp(){
        nameComparator = new NameComparator();
    }

    @Test
    public void compareMoviesWhereMovie1NameGreaterThanMovie2Name(){
        Movie movie1 = new Movie("Dilwale Dulhania Le Jayenge", 1995, 10.0);
        Movie movie2 = new Movie("Chalte Chalte", 2003, 8.9);
        assertEquals(1, nameComparator.compare(movie1, movie2));
    }

    @Test
    public void compareMoviesWhereMovie1NameLesserThanMovie2Name(){
        Movie movie1 = new Movie("Baazigar", 1993, 9.2);
        Movie movie2 = new Movie("Chalte Chalte", 2003, 8.9);
        assertEquals(-1, nameComparator.compare(movie1, movie2));
    }

    @Test
    public void compareMoviesWhereMovie1NameStartingLetterSameAsMovie2Name(){
        Movie movie1 = new Movie("Chak De! India", 2007, 9.6);
        Movie movie2 = new Movie("Chalte Chalte", 2003, 8.9);
        assertEquals(-1, nameComparator.compare(movie1, movie2));
    }

}
