package ru.malysheva.task2;

import java.util.Scanner;

public class salaryNettoNew {
    public static void main(String[] args) {
        System.out.println("Укажите размер вашей заработной платы до вычета налогов: ");
        try (Scanner in = new Scanner(System.in)) {
            int salaryBrutto = in.nextInt();
            double salaryNaRuki = salaryBrutto * 0.87;
            System.out.format("Размер заработной платы после вычета налогов: %.2f", salaryNaRuki);
        }

    }

}




