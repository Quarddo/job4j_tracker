package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String anesthesia;

    public Dentist(String name, String surname, String education, int birthday, String diagnosis, String anesthesia) {
        super(name, surname, education, birthday, diagnosis);
        this.anesthesia = anesthesia;
    }
}

