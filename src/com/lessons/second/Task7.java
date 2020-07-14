package com.lessons.second;

public class Task7 {
    public static void main(String[] args) {

        int countOfProgrammer = 153;

        if (String.valueOf(countOfProgrammer).endsWith("1") & !String.valueOf(countOfProgrammer).endsWith("11")){
            System.out.println(countOfProgrammer + " программист");
        }else if (String.valueOf(countOfProgrammer).endsWith("2") || String.valueOf(countOfProgrammer).endsWith("3") || String.valueOf(countOfProgrammer).endsWith("4")){
            if (!String.valueOf(countOfProgrammer).endsWith("12") & !String.valueOf(countOfProgrammer).endsWith("13") & !String.valueOf(countOfProgrammer).endsWith("14")){
                System.out.println(countOfProgrammer + " программиста");
            } else {
                System.out.println(countOfProgrammer + " программистов");
            }
        }else{
            System.out.println(countOfProgrammer + " программистов");
        }
    }
}
