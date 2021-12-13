package ru.job4j.oop;

public class Cat {

    private String name;
    private String food;

    public void show() {
        System.out.println(this.name + this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meal) {
        this.food = meal;
    }

    public static void main(String[] args) {
        System.out.println("Cat named. There are Gav's food");
        Cat names = new Cat();
        names.giveNick("Gav ");
        names.eat("eats meat.");
        names.show();
    }
}
