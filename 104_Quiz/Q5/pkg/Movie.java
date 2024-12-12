package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRating;
    int revenue;
    
public Movie(){
    movieName = "Avengers";
    rating = 8.0;
    numRating = 33;
    revenue = 623357910;
}
public Movie(String mn, double rat, int nr, int rev){
    movieName = mn;
    rating = rat;
    numRating = nr;
    revenue = rev;
}
public void movieToString(){
    System.out.println("movie: " + movieName);
    System.out.println("rating: " + rating);
    System.out.println("numRating: " + numRating);
    System.out.println("revenue: " + revenue);
    return;
}
public String getMovieName(){
    return movieName;
}
public int getRevenue(){
    return revenue;
}

public void addRating(double movieRating){
    double x = movieRating*numRating;
    movieRating = x+movieRating/(numRating+1);
    return;
}
}
