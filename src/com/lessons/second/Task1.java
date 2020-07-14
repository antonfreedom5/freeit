package com.lessons.second;

public class Task1 {
    public static void main(String[] args) {

        int number = -1111;
        int countOfDigits = String.valueOf(number).length();

        switch (countOfDigits){
            case 1:
                if (number > 0)
                    System.out.println("Это однозначное положительное число");
                break;
            case 2:
                if (number > 0) {
                    System.out.println("Это двухзначное положительное число");
                }else {
                    System.out.println("Это однозначное отрицательное число");
                }
                break;
            case 3:
                if (number > 0) {
                    System.out.println("Это трехзначное положительное число");
                }else {
                    System.out.println("Это двухзначное отрицательное число");
                }
                break;
            case 4:
                if (number < 0){
                    System.out.println("Это трехзначное отрицательное число");
                }else {
                    System.out.println("Это число содержит более трех цифр");
                }
                break;
            default:
                System.out.println("Это число содержит более трех цифр");
                break;
        }
    }
}
