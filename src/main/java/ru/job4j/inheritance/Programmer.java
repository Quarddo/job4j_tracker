package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String code;

    public Programmer(String name, String surname, String education, int birthday, String drawing, String code) {
        super(name, surname, education, birthday, drawing);
        this.code = code;
    }
}

