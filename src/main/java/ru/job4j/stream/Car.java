package ru.job4j.stream;

import java.time.LocalDate;

public class Car {
    private String brand;

    private String model;

    private LocalDate created;

    private double volume;

    private String color;

    public String toString() {
        String ln = System.lineSeparator();
        return "Car:" + ln
                + "Brand - " + brand + ";" + ln
                + "Model - " + model + ";" + ln
                + "Created - " + created + ";" + ln
                + "Volume - " + volume + ";" + ln
                + "Color - " + color + ".";
    }

    static class Builder {
        private String brand;
        private String model;
        private LocalDate created;
        private double volume;
        private String color;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildCreated(LocalDate created) {
            this.created = created;
            return this;
        }

        Builder buildVolume(double volume) {
            this.volume = volume;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.brand = brand;
            car.model = model;
            car.created = created;
            car.volume = volume;
            car.color = color;
            return car;
        }

    }

    public static void main(String[] args) {
        Car car = new Builder()
                .buildBrand("Toyota")
                .buildModel("Camry")
                .buildCreated(LocalDate.of(2021, 6, 1))
                .buildVolume(2.5)
                .buildColor("Red")
                .build();
        System.out.println(car);
        Car car1 = new Builder()
                .buildBrand("Honda")
                .buildModel("Accord")
                .buildCreated(LocalDate.of(2010, 5, 3))
                .buildVolume(2.5)
                .buildColor("Black")
                .build();
        System.out.println(car1);
    }
}
