import com.sun.jdi.event.MonitorContendedEnteredEvent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie extends Media{
    private int duration;


    Movie(){

    }
    Movie(String title, String auteur, String ISBN, double price, int duration){
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    void watch(User user){
        //Allows users to watch the movie by adding the movie to the purchased list
        user.addToCart(this);
    }

    List<Movie> recommendSimilarMovies(List<Movie> movieCatalog){
        //Recommends similar movies based on the director (auteur)
        List<Movie> recommendedMovies = new ArrayList<>();

        for (Movie movie : movieCatalog) {
            if (movie.getAuteur().equals(this.getAuteur())) {
                recommendedMovies.add(movie);
            }
        }

        return recommendedMovies;
    }

    @Override
    public String getMediaType() {
        /*
        if duration >= 120
        else return "Movie"
         */
        if (duration >= 120){
            return "Long Movie";
        }else {
            return "Movie";
        }

    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                '}';
    }

    public String getDuration() {
        return null;
    }
}
