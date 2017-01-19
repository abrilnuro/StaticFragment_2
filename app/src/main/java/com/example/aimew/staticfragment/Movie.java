package com.example.aimew.staticfragment;

/**
 * Created by aimew on 17/01/2017.
 */

public class Movie {

    String title;
    String genre;
    String director;
    int image;

    public Movie(String title, String genre, String director, int image) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
