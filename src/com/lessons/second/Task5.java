package com.lessons.second;

public class Task5 {
    public static void main(String[] args) {

        int a = 1, b = -2, c = 3;

        int countPositive = 0;
        int countNegative = 0;

        if (a > 0){
            countPositive++;
        } else {
            countNegative++;
        }
        if (b > 0){
            countPositive++;
        } else {
            countNegative++;
        }
        if (c > 0){
            countPositive++;
        } else {
            countNegative++;
        }

        System.out.println("Количество положительных: " + countPositive);
        System.out.println("Количество отрицательных: " + countNegative);
    }
}
