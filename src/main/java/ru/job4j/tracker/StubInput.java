package ru.job4j.tracker;

public class StubInput implements Input {

    @Override
    public String askStr(System question) {
        return null;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
