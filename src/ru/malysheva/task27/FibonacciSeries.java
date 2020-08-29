package ru.malysheva.task27;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int number, n1 = 0, n0, n2 = 1;

        Scanner iIndex = new Scanner(System.in);
        System.out.println("Введите индекс последнего значения");
        number = iIndex.nextInt();
        System.out.println("1) Итерация: ");

        for (int i = 0; i < number + 1; i++) {
            n0 = n1;
            n1 = n2;
            n2 = n0 + n1;
            System.out.print(n0 + " ");
        }
    }
}

