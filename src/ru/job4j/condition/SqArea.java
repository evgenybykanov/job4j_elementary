package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double rsl = ((p / (2*(k + 1))) * k)* (p / (2*(k + 1))) ;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" square = " + result1);
    }
}

