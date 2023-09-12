package com.sratech.comparator;

import com.sratech.comparable.Movie;

import java.util.Comparator;

public class YearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getYear() - movie2.getYear();
    }
}
