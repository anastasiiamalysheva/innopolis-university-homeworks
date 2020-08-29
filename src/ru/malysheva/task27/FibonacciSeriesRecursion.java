package ru.malysheva.task27;

import java.util.Scanner;

public class FibonacciSeriesRecursion {

    public static int recursion(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return recursion(n - 1) + recursion(n - 2);
        }
    }

    public static void main(String[] args) {
        // считывание переменной n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс последнего значения");
        int n = scanner.nextInt();

        // получение n-ого по счёту числа Фибоначчи
        int recursionN = recursion(n);

        // вывод n-ого по счёту числа Фибоначчи
        System.out.println(recursionN);
    }
}