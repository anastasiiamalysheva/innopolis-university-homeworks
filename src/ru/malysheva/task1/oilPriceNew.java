package ru.malysheva.task1;

public class oilPriceNew {
    public static void main(String args[]) {
            final double TARIFF = 43.0;
            int quantity = Integer.parseInt(args[0]);
            System.out.println ("Сумма к оплате: " + TARIFF * quantity);

    }
}


