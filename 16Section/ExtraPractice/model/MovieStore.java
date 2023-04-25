package model;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class MovieStore {

    private List<Movie> movies;
    
    public MovieStore() {
        this.movies = new ArrayList<>();
    }
    
    public void addMovie(Movie newMovie) {
        this.movies.add(new Movie(newMovie));
    }
    
    public List<Movie> filterByGenre(String genre) {
        List<Movie> filteredMovies = movies.stream()
            .filter(movie -> movie.getGenre().equalsIgnoreCase(genre))
            .collect(Collectors.toList());
            
        return filteredMovies;
    }

    public List<Movie> sortByReleaseYear() {
        List<Movie> filteredMovies = movies.stream()
            .sorted((movie1, movie2) -> Integer.compare(movie1.getReleaseYear(), movie2.getReleaseYear()))
            .collect(Collectors.toList());
            
        return filteredMovies;
    }
    
    public List<Movie> getTopRatedMovies(int limit) {
        List<Movie> topRatedMovies = movies.stream()
            .sorted((movie1, movie2) -> Double.compare(movie1.getRating(), movie2.getRating()))
            .limit(limit)
            .collect(Collectors.toList());
            
        return topRatedMovies;
    }
    
}