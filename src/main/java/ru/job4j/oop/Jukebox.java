package ru.job4j.oop;

import java.util.jar.JarEntry;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бешут неуклюже");
        } else if (position == 2) {
                System.out.println("Спокойной ночи");
        } else {
                System.out.println("Песня не найдена");
            }
        }

    public static void main(String[] args) {
        Jukebox range = new Jukebox();
        range.music(1);
        range.music(2);
        range.music(3);
    }
}
