package show;

import person.Actor;
import person.Director;
import person.Person;

public class Opera extends MusicalShow {

    private final int choirSize; //количество человек в хоре
    String librettoText = """
            В карауле
            жизнью улиц
            мы живём по часам.
            Толпы народа, шум и гам!
            Толпы народа, шум и гам!
            Весело нам!
            Весело нам!
            Толпы народа, шум и гам!
            Весело нам!
            Весело нам!
            """; //текст либретто

    public Opera(String title, int duration, Director director, Person musicAuthor, int choirSize) {
        super(title, duration, director, musicAuthor);
        this.choirSize = choirSize;
    }

    @Override
    public void addListOfActors(Actor actor) {
        super.addListOfActors(actor);
    }

    @Override
    public void printListOfActors() {
        System.out.println("Список актёров оперы:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
        System.out.println();
    }

    @Override
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
            System.out.println(actor + " не принимает участие в этой опере!");
            System.out.println();
        }
    }

    @Override
    public void printLibrettoText() {
        System.out.println("Либретто оперы:");
        System.out.println(librettoText);
        System.out.println();
    }

    @Override
    public void printDirector() {
        System.out.println("Режиссёр оперы:");
        System.out.println(director.toString());
    }

    @Override
    public void addNewActorListOfActors(Actor actor) {
        for (Actor actors : listOfActors) {
            if (actors.equals(actor)) {
                System.out.println(actor + " уже принимает участие в опере!");
                System.out.println();
                break;
            } else {
                listOfActors.add(actor);
                break;
            }
        }
    }

}
