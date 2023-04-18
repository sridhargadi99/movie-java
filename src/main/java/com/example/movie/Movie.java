// Write your code here
package com.example.movie;

import java.util.ArrayList;

public class Movie{
    private int movieId;
    private String movieName;
    private String leadActor;

    public Movie(int movieId, String movieName, String leadActor){
        this.movieId = movieId;
        this.movieName = movieName;
        this.leadActor = leadActor;
    }

    public int getMovieId(){
        return this.movieId;
    }
    public void setMovieId(int movieId){
        this.movieId = movieId;
    }

    public String getMovieName(){
        return this.movieName;
    }
    public void setMovieName(String movieName){
        this.movieName = movieName;
    }

    public String getLeadActor(){
        return this.leadActor;
    }
    public void setLeadActor(String leadActor){
        this.leadActor = leadActor;
    }

}