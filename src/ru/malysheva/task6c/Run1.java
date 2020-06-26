package ru.malysheva.task6c;


import ru.malysheva.task6c.coffeeshop1.Coffeeshop1;

public class Run1 {


    public static void main(String[] args) {
        Coffeeshop1 Coffeeshop1 = new Coffeeshop1();
        System.out.println("1. Coffee expenses per month = " + Coffeeshop1.getCoffeeExpensesB());
        System.out.println("2. Milk expenses per month = " + Coffeeshop1.getMilkExpensesA());
        System.out.println("3. Total income per Month = " + Coffeeshop1.geTotalIncomeA());
    }

}
