package com.sratech.comparator;

import com.sratech.comparable.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YearComparatorTest {
    private YearComparator yearComparator;
    @BeforeEach
    public void setUp(){
        yearComparator = new YearComparator();
    }


    @Test
    public void compareMoviesTestWhereMovie1YearGreaterThanMovie2Year(){
        Movie movie1 = new Movie("Anjaam", 1994, 6.0);
        Movie movie2 = new Movie("Baazigar", 1993, 9.2);
        assertEquals(1, yearComparator.compare(movie1, movie2));
    }

    @Test
    public void compareMoviesTestWhereMovie1YearLesserThanMovie2Year(){
        Movie movie1 = new Movie("Baazigar", 1993, 9.2);
        Movie movie2 = new Movie("Anjaam", 1994, 6.0);
        assertEquals(-1, yearComparator.compare(movie1, movie2));
    }

    @Test
    public void compareMoviesTestWhereMovie1YearSameAsMovie2Year(){
        Movie movie1 = new Movie("Chalte Chalte", 2003, 8.9);
        Movie movie2 = new Movie("Kal Ho Naa Ho", 2003, 9.0);
        assertEquals(0, yearComparator.compare(movie1, movie2));
    }

}
