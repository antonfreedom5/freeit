package com.lessons.second;

public class Task2 {
    public static void main(String[] args) {

        int a = 1, b = 2, c = 3;

        if (a + b > c & a + c > b & b + c > a){
            System.out.println("Такой треугольник существует");
        }else {
            System.out.println("Такого треугольника не существует!");
        }
    }
}
