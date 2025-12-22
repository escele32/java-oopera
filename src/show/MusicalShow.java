package show;

import person.Director;
import person.Person;

public class MusicalShow extends Show{

    Person musicAuthor; //автор музыки
    String librettoText = """
            Тем временем влюбленная пара тихо опустилась на воду и поплыла к высоким зарослям.
            До рассвета оставалось совсем немного. После танца любви Фло и Адель переплелись своими длинными шеями,
            положили головы друг другу на розовые крылья, чтобы выспаться и набраться сил. Сон поглотил мир.
            """; //текст либретто

    public MusicalShow(String title, int duration, Director director, Person musicAuthor) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }

}
