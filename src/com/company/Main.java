package com.company;
//
//1)комп загадал число от 1 до 100
//        2)спросить у пользователя какое число он хочет ввести
//        3)считать введённое пользователем число
//        4)сравнить введённое пользователем и загаднное компом число
//        5.1)если число пользователя МЕНЬШЕ числа компа, то вывести подсказку что введите число больше и перейти на шаг 2
//        5.2)если число пользователя БОЛЬШЕ числа компа, то вывести подсказку что введите число меньше и перейти на шаг 2
//        5.3)если число пользователя РАВНО числу компа, то вывести что вы угадали и закончить программу
//
//        1)Random random = new Random()
//        2)System out println
//        3)Scanner input NextInt
//        4)if comp==Random
//        5)if System out println


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random rnd = new Random();
        int numberOfAttempts=0;
        int compNumber;
        int userNumber ;
        final int EXIT_CODE = -1;

        compNumber = rnd.nextInt(10)+1;

        do {
            System.out.println("Введите любое число от 1 до 10: ");
            userNumber = input.nextInt();

            if(userNumber > compNumber){
                System.out.println("Введите число поменьше: ");
            }
            else if(userNumber < compNumber){
                System.out.println("Введите число побольше: ");
            }

            if (userNumber != EXIT_CODE) {
                numberOfAttempts++;
            }


        }while (compNumber!=userNumber);

        System.out.println("Поздравляю,вы угадали число!! ");
        System.out.println("Количество попыток: "+numberOfAttempts);

        if(numberOfAttempts<=3){
            System.out.println("гений");
        }else if (numberOfAttempts>3 && numberOfAttempts<=6){
            System.out.println("среднячок");
        }else {
            System.out.println("лошара");
        }

    }
}