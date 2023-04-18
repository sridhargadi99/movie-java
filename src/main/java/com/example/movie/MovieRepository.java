// Write your code here
package com.example.movie;

import java.util.ArrayList;
import com.example.movie.Movie;

public interface MovieRepository{
    ArrayList<Movie> allMovies();
    Movie addMovie(Movie movie);
    Movie getMovie(int movieId);
    Movie updateMovie(int movieId, Movie movie);
    void deleteMovie(int movieId);
}