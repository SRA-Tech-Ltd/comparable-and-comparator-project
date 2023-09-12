package com.sratech.demo;

import com.sratech.comparable.Movie;
import com.sratech.comparator.NameComparator;
import com.sratech.comparator.RatingComparator;
import com.sratech.comparator.YearComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args){

        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Baazigar", 1993, 9.2));
        movieList.add(new Movie("Dilwale Dulhania Le Jayenge", 1995, 10.0));
        movieList.add(new Movie("Jawan", 2023, 9.8));
        movieList.add(new Movie("Kuch Kuch Hota Hai", 1998, 9.5));
        movieList.add(new Movie("Kabhi Khushi Kabhie Gham", 2001, 8.5));
        movieList.add(new Movie("Devdas", 2002, 9.5));
        movieList.add(new Movie("Trimurti", 1995, 4.6));
        movieList.add(new Movie("Chalte Chalte", 2003, 8.9));
        movieList.add(new Movie("Kal Ho Naa Ho", 2003, 9.0));
        movieList.add((new Movie("Chak De! India", 2007, 9.6)));
        movieList.add(new Movie("Anjaam", 1994, 6.0));


        NameComparator nameComparator = new NameComparator();

//        Collections.sort(movieList, nameComparator);
//        for(Movie movie: movieList){
//            System.out.println(movie.getName() + " "+ movie.getYear() + " "+ movie.getRating());
//        }
        System.out.println("========================");
        System.out.println("START OF SORTING BY NAME");
        System.out.println("========================");
        movieList.stream().sorted(nameComparator).forEach(movie -> System.out.println(movie.getName() + " "+ movie.getYear() + " "+ movie.getRating()));
        System.out.println("========================");
        System.out.println("END OF SORTING BY NAME");
        System.out.println("========================");

        RatingComparator ratingComparator = new RatingComparator();
        System.out.println("START OF SORTING BY RATING");
        System.out.println("========================");
        movieList.stream().sorted(ratingComparator).forEach(movie -> System.out.println(movie.getName() + " "+ movie.getYear() + " "+ movie.getRating()));
        System.out.println("END OF SORTING BY RATING");
        System.out.println("========================");

        YearComparator yearComparator = new YearComparator();
        System.out.println("START OF SORTING BY YEAR");
        System.out.println("========================");
        movieList.stream().sorted(yearComparator).forEach(movie -> System.out.println(movie.getName() + " "+ movie.getYear() + " "+ movie.getRating()));
        System.out.println("END OF SORTING BY YEAR");
        System.out.println("========================");
    }
}
