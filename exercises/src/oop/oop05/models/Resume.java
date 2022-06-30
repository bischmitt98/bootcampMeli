package oop.oop05.models;

import java.util.Arrays;

public class Resume extends Document{
    private Person person;
    private String[] skills;

    public Resume(Person person, String[] skills) {
        this.person = person;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "person=" + person +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}
