package ru.job4j.oop;

public class DummyDic {
    public String english() {
        String word = "Dance";
        return word;
    }

    public String engToRus(String eng) {
        DummyDic dunno = new DummyDic();
        eng = dunno.english();
        return ("Неизвестное слово " + eng);
    }

    public String engTo(String eng) {
        eng = "Cop";
        return (" Неизвестное слово " + eng);
    }
}
