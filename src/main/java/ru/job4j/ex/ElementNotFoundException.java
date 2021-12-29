package ru.job4j.ex;

public class ElementNotFoundException extends Exception {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            } else {
                throw new ElementNotFoundException(" Элемент не найден. ");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            System.out.println(ElementNotFoundException.indexOf(new String[]{"One", "Two", "Three"}, "Five"));
        } catch (Exception e) {
            System.out.println("Элемент не найден");
        }
    }
}
