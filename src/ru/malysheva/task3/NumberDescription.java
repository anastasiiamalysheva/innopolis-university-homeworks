package ru.malysheva.task3;

import java.util.Scanner;

public class NumberDescription {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ваше число для описания: ");
        int numberfordescription = in.nextInt();


        if (numberfordescription > 0) {
            System.out.print("Число положительное и ");

        }else if (numberfordescription < 0) {
            System.out.print("Число отрицательное и ");
        }
        if  (numberfordescription %  2 == 0) {
            System.out.print("четное");

        }else if (numberfordescription %  2 == 1) {
            System.out.print("нечетное");
        }




    }
}

