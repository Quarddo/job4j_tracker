package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book moon = new Book("Moon", 100);
        Book sun = new Book("Sun", 110);
        Book wind = new Book("Wind", 90);
        Book cleanCode = new Book("Clean code", 85);
        Book[] books = {moon, sun, wind, cleanCode};
        for (int i = 0; i < books.length; i++) {
            Book prt = books[i];
            System.out.println("Книга " + prt.getName() + " имеет " + prt.getCountPage() + " страниц.");
        }
        System.out.println(System.lineSeparator() + "Поменяем местами книги \"Moon\" и \"Clean code\".");
        books[0] = cleanCode;
        books[3] = moon;
        for (int i = 0; i < books.length; i++) {
            Book prt = books[i];
            System.out.println("Книга " + prt.getName() + " имеет " + prt.getCountPage() + " страниц.");
        }
        System.out.println(System.lineSeparator() + "Вывод книг с именем \"Clean code\".");
        for (int i = 0; i < books.length; i++) {
            Book prt = books[i];
           if ("Clean code".equals(prt.getName())) {
               System.out.println("Книга " + prt.getName() + " имеет " + prt.getCountPage() + " страниц.");
           }
        }
    }
}
