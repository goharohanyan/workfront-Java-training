package javahomework.homework3.lesson6;

//    properties
//        - title
//        - rating
//    Create 10 movie objects in main, give them titles and random ratings in range (0 - 10) and store them in array;
//    Get the best rated movie/movies from array and display the title.

import java.util.Random;

public class Movie {
    private String title;
    private String director;
    private int rating;

    // region Setter, Getter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    //endregion

    public Movie() {
    }

    public Movie(String title, String director, int rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    private static Movie[] initializeMovieArray(Movie[] movies, Random random) {
        for (int i = 0; i < movies.length; i++) {
            movies[i] = new Movie();
            movies[i].setTitle("Title" + i);
            movies[i].setDirector("Director" + i);
            movies[i].setRating(random.nextInt(11));
        }
        return movies;
    }

    private static int getHighestRating(Movie[] movies) {
        int maxRating = Integer.MIN_VALUE;
        for (int i = 0; i < movies.length; i++) {
            if (maxRating < movies[i].getRating()) {
                maxRating = movies[i].getRating();
            }
        }
        return maxRating;
    }

    private static Movie[] getMoviesWithHighestRating(Movie[] movies, int rating) {
        int count = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating() == rating) {
                count++;
            }
        }
        Movie[] extractedMovies = new Movie[count];
        int index = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getRating() == rating) {
                extractedMovies[index++] = movies[i];
            }
        }
        return extractedMovies;
    }

    private static void printMoviesArray(Movie[] movies) {
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].getDirector() + " , " + movies[i].getTitle() + " : " + movies[i].getRating());
        }
    }

    public static void main(String[] args) {
        Movie[] movies = new Movie[10];
        Random random = new Random();
        initializeMovieArray(movies, random);
        System.out.println("initialized movies");
        printMoviesArray(movies);
        int highestRating = getHighestRating(movies);
        Movie[] moviesWithHighestRating = getMoviesWithHighestRating(movies, highestRating);
        System.out.println("Movie/movies with highest rating");
        printMoviesArray(moviesWithHighestRating);
    }
}
