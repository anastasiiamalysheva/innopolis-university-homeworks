package ru.malysheva.task3;

import java.util.Scanner;

public class minimumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Первое число: ");
        int firstnumber1 = in.nextInt();


        System.out.println("Второе число: ");
        int secondnumber2 = in.nextInt();

        if (firstnumber1 > secondnumber2) {
            System.out.println("Меньшее значение: " + secondnumber2);
        }else{
            System.out.println("Меньшее значение: " + firstnumber1);

        }
    }
}