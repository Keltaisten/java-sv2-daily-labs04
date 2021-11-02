package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int dateOfRelease;
    List<Actor> actorsList = new ArrayList<>();

    public Movie(String title, int dateOfRelease) {
        this.title = title;
        this.dateOfRelease = dateOfRelease;
    }

    public void addActor(Actor actor){
        actorsList.add(actor);
    }

    private int actorsInTheirTwenties(){
        int number = 0;
        for(Actor actor: actorsList){
            if(Math.abs(actor.getAgeOfBirth()-dateOfRelease)>=20 &&Math.abs(actor.getAgeOfBirth()-dateOfRelease)<30){
//                System.out.println(actor.getName());
                number++;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Terminator", 1991);
        movie.addActor(new Actor("John", 1968));
        movie.addActor(new Actor("Jane", 1972));
        movie.addActor(new Actor("Jack", 1941));
        movie.addActor(new Actor("Jamie", 1970));
        movie.addActor(new Actor("Joey", 1965));
        System.out.println(movie.actorsInTheirTwenties());
    }
}
