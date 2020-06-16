package ru.malysheva.task2;

import java.util.Scanner;
import java.lang.Math;

public class hotAndColdNew {
    public static void main(String[] args) {

        double x = ( Math.random() * 100 ) + 1;

        System.out.println("Угадайте загаданное число в диапазоне от нуля до ста");

        Scanner in = new Scanner (System.in);
        System.out.println("Попробуйте например ввести число 0: ");
        int numbernull = in.nextInt();

        if (numbernull > x)
            System.out.println("Загаданное число меньше");
        else if (numbernull < x)
            System.out.println("Загаданное число больше");
        else if (numbernull == x)
            System.out.println("Вы угадали!");



        System.out.println("Выберите любое число от 1 до 100: ");
        int usernumber  =  in.nextInt();
        do {
            if  (usernumber > x)
                System.out.println("Загаданное число меньше");
            else if (numbernull < x)
                System.out.println("Загаданное число больше");
            else System.out.println("Вы угадали!");
        } while (in.nextInt() == x);
        System.out.println("Вы угадали!");



    }
}
