package ru.malysheva.task2;

import java.util.Scanner;

public class priceCalculationNew {
    public static void main(String[] args) {
        double tariff = 43;

        System.out.println("Стоимость одного литра: " + tariff);
        System.out.println("Укажите количество литров: ");
        try (Scanner in = new Scanner(System.in)) {
            double order = in.nextDouble();
            double finalCost = tariff * order;
            System.out.format("Сумма к оплате: %.3f", finalCost);
        } catch (Exception e){
            System.out.println("Exception caught");
        }


    }
}

