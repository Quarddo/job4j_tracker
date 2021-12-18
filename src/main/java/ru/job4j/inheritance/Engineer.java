package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String drawing;

    public Engineer(String name, String surname, String education, int birthday, String drawing) {
        super(name, surname, education, birthday);
        this.drawing = drawing;
    }
}
