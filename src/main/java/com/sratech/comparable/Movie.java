package com.sratech.comparable;

public class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    public Movie(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie movie) {
        return this.getYear() - movie.getYear();
    }
}
