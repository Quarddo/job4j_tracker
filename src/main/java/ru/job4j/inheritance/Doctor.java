package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String diagnosis;
    public Doctor(String diagnosis) {
        super();
        this.diagnosis = diagnosis;
    }

    public Doctor() {
    }
}
