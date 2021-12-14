package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left >= right;
        int result = condition ? left : right;
        return result;
    }

    public static int max(int left, int right, int up) {
        boolean condition = left >= right;
        int result = condition ? (left > up ? left : up) : (right > up ? right : up);
        return result;
    }

    public static int max(int left, int right, int up, int down) {
        int maxi = left > right ? left : right;
        maxi = maxi > up ? maxi : up;
        maxi = maxi > down ? maxi : down;
        return maxi;
    }

    public static void main(String[] args) {
        int sq = Max.max(3, 2);
        System.out.println(sq);
    }
}
