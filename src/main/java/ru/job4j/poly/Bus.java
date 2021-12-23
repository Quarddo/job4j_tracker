package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void ride() {

    }

    @Override
    public int passengers() {
        int count = 4;
        return count;
    }

    @Override
    public int fuel(int price) {
        price = 13;
        return price;
    }
}
