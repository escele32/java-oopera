package person;

public class Director extends Person{

    private final int numberOfShow; //количество поставленных спектаклей

    public Director(String name, String surName, Gender gender, int numberOfShow) {
        super(name, surName, gender);
        this.numberOfShow = numberOfShow;
    }

    @Override
    public String toString() {
        return name + ' ' + surName;
    }
}
