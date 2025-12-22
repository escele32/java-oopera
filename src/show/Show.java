package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;

public class Show {

    protected String title; //название
    protected int duration; //длительность в минутах
    Director director; //режиссёр
    ArrayList<Actor> listOfActors; //список актёров

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printListOfActors () {
        System.out.println("Список актёров спектакля:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
        System.out.println();
    }

    public void printDirector() {
        System.out.println("Режиссёр спектакля:");
        System.out.println(director.toString());
        System.out.println();
    }

    public void addListOfActors(Actor actor) {
        listOfActors.add(actor);
    }

    public void removeListOfActors(Actor actor, Actor newActor) {
        boolean isFound = false;
        for (Actor actors : listOfActors) {
            if (actors.equals(actor)) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println(actor + " не принимает участие в этом спектакле!");
            System.out.println();
        }
    }

    public void addNewActorListOfActors(Actor actor) {
        for (Actor actors : listOfActors) {
            if (actors.equals(actor)) {
                System.out.println(actor + " уже принимает участие в спектакле!");
                System.out.println();
                break;
            } else {
                listOfActors.add(actor);
                break;
            }
        }
    }

}
