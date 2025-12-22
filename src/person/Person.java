package person;

public class Person {

    protected String name; //имя
    protected String surName; //фамилия
    protected Gender gender; //пол

    public Person(String name, String surName, Gender gender) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
    }

}