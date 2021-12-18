package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String preparation;

    public Surgeon(String name, String surname, String education, int birthday, String diagnosis, String preparation) {
        super(name, surname, education, birthday, diagnosis);
        this.preparation = preparation;
    }
}
