package theatre;

import person.Actor;
import person.Director;
import person.Gender;
import person.Person;
import show.Ballet;
import show.Opera;
import show.Show;


public class Theatre {
    public static void main(String[] args) {

        Actor actor1 = new Actor("Павел", "Сидоров", Gender.MALE, 1.95);
        Actor actor2 = new Actor("Вероника", "Петрова", Gender.FEMALE, 1.68);
        Actor actor3 = new Actor("Иван", "Незабудкин", Gender.MALE, 1.85);

        Director director1 = new Director("Пётр", "Лысков", Gender.MALE, 4);
        Director director2 = new Director("Елена", "Иваныкина", Gender.FEMALE, 2);

        Person choreographer = new Person("Игорь", "Николаев", Gender.MALE);
        Person musicAuthor = new Person("Татьяна", "Удалых", Gender.FEMALE);

        Actor newActor = new Actor("Василий", "Епищенков", Gender.MALE, 1.78);

        Show show = new Show("Вишнёвый сад", 132,director1);
        Ballet ballet = new Ballet("Лебединое озеро", 90, director2, musicAuthor,choreographer);
        Opera opera = new Opera("Кармен", 78, director1, musicAuthor, 2);

        show.addListOfActors(actor1);
        show.addListOfActors(actor2);
        ballet.addListOfActors(actor2);
        ballet.addListOfActors(actor3);
        opera.addListOfActors(actor1);
        opera.addListOfActors(actor3);

        show.printListOfActors();
        ballet.printListOfActors();
        opera.printListOfActors();

        opera.removeListOfActors(actor1, newActor);
        opera.printListOfActors();
        show.removeListOfActors(actor3, newActor);

        show.printDirector();

        ballet.addNewActorListOfActors(newActor);
        ballet.printListOfActors();
        ballet.addNewActorListOfActors(actor2);

        opera.printLibrettoText();
        ballet.printLibrettoText();

    }
}
