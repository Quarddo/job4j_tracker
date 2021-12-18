package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String foundation;

    public Builder(String name, String surname, String education, int birthday, String drawing, String foundation) {
        super(name, surname, education, birthday, drawing);
        this.foundation = foundation;
    }
}

