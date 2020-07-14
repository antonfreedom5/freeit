package com.lessons.second;

public class Task4 {
    public static void main(String[] args) {

        int a = 1, b = -2, c = 3;

        int countPositive = 0;

        if (a > 0)
            countPositive++;
        if (b > 0)
            countPositive++;
        if (c > 0)
            countPositive++;

        System.out.println("Количество положительных: " + countPositive);
    }
}
