import java.util.*;
public class Movie
{
    private ArrayList<MovieOptions> movie;
    public Movie(){
        movie = new ArrayList<MovieOptions>();
    }
    public void add(MovieOptions a){
        movie.add(new MovieOptions(a.getName(),a.getMinutes(),a.getPrice(),a.getCount(),a.getTime()));
    }
    public String toString(){
        String a = "";
        for(int i=0;i<movie.size();i++){
            a = a+movie.get(i)+"\n";
        }
        return a;
    }
    public void timeChange(Time other){
        for(int i=0;i<movie.size();i++){
            movie.get(i).addTime(other);
        }
    }
}
