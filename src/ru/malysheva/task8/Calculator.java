package ru.malysheva.task8;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = getNumber();
        double num2 = getNumber();
        int operation = getOperation();
        double result = calculation(num1, num2, operation);
        System.out.println("Результат вычисления: " + result);
    }

    public static double getNumber() {
        System.out.println("Введите число: ");
        double num = 0.0;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз. ");
        }
        return num;

    }

    public static int getOperation() {
        System.out.println("Введите необходимую операцию, где \n 1 -> +,\n 2 -> -,\n 3 -> *,\n 4 -> /,\n 5 -> % (Ваше первое число - исходное, а второе - необходимый процент от него): ");
        int operation = 0;
        if (scanner.hasNextInt()) {
            operation = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");

        }
        return operation;
    }

    public static double calculation(double num1, double num2, int operation) {
        double result = 0.0;
        final double percent = 100.0;
        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            case 5:
                result = num2 / percent * num1;
                break;
        }
        return result;
    }
}
