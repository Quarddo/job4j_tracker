package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int y) {
        return x / y;
    }

    public int sumAllOperation() {
        return sum(10) + this.multiply(5) + minus(2) + this.divide(5);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int rsl1 = minus(2);
        System.out.println(rsl1);
        int result1 = calculator.divide(5);
        System.out.println(result1);
        int result2 = calculator.sumAllOperation();
        System.out.println(result2);
    }
}
