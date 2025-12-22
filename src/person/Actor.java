package person;

import java.util.Objects;

public class Actor extends Person{

    private final double height; //рост

    public Actor(String name, String surName, Gender gender, double height) {
        super(name, surName, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Actor actor = (Actor) object;
        return Objects.equals(name, actor.name) && Objects.equals(surName, actor.surName) && (height == actor.height);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (name != null) {
            hash = hash + name.hashCode();
        }

        hash = hash * 31;
        if (surName != null) {
            hash = hash + surName.hashCode();
        }

        hash = hash * 31;
        if (height != 0) {
            hash = hash + Double.hashCode(height);
        }
        return hash;
    }

    @Override
    public String toString() {
        return name + ' ' + surName + ' ' + '(' + height + ')';
    }

}
