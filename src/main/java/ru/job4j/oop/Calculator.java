package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return y + x;
    }

    public int multiply(int a) {
        return a * x;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
         return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + this.multiply(d) + minus(d) + this.divide(d);
    }

    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int rsl1 = minus(5);
        System.out.println(rsl1);
        int result1 = calculator.divide(5);
        System.out.println(result1);
        int result2 = calculator.sumAllOperation(5);
        System.out.println(result2);
    }
}
