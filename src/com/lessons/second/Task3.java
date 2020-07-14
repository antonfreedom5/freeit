package com.lessons.second;

public class Task3 {
    public static void main(String[] args) {

        int number = 0;

        if (number > 0){
            number++;
        } else if (number < 0){
            number = number - 2;
        } else if (number == 0){
            number = 10;
        }
        System.out.println(number);
    }
}
