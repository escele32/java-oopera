package show;

import person.Actor;
import person.Director;
import person.Person;

public class Ballet extends MusicalShow{

    Person choreographer; //хореограф
    String librettoText = """
            1-й день рождения принца Зигфрида, молодёжь собралась на праздник. Прибывает королева и напоминает принцу,
            что ему пришло время жениться. Зигфрид опечален мыслями о своей ускользающей беспечной юности, у него нет
            желания выбирать невесту. Пытаясь развеселить принца, Шут указывает на летящую стаю диких лебедей и
            предлагает отправиться на охоту.
            """; //текст либретто

    public Ballet(String title, int duration, Director director, Person musicAuthor, Person choreographer) {
        super(title, duration, director, musicAuthor);
        this.choreographer = choreographer;
    }

    @Override
    public void addListOfActors(Actor actor) {
        super.addListOfActors(actor);
    }

    @Override
    public void printListOfActors () {
        System.out.println("Список актёров балета:");
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
            System.out.println(actor + " не принимает участие в этом балете!");
            System.out.println();
        }
    }

    @Override
    public void printLibrettoText() {
        System.out.println("Либретто балета:");
        System.out.println(librettoText);
    }

    @Override
    public void printDirector() {
        System.out.println("Режиссёр балета:");
        System.out.println(director.toString());
        System.out.println();
    }

    @Override
    public void addNewActorListOfActors(Actor actor) {
        for (Actor actors : listOfActors) {
            if (actors.equals(actor)) {
                System.out.println(actor + " уже принимает участие в балете!");
                System.out.println();
                break;
            } else {
                listOfActors.add(actor);
                break;
            }
        }
    }

}
