package ru.malysheva.task6;


import ru.malysheva.task6.coffeeshop.Coffeeshop;
import ru.malysheva.task6.coffeeshop.SoyaMilk;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {


        Coffeeshop coffeeshop = new Coffeeshop();



        System.out.println ("1. Coffee expenses per month = " + coffeeshop.getCoffeeExpenses());
        System.out.println("2. Milk expenses per month = "+ coffeeshop.getMilkExpenses());
        System.out.println("3. Total income per Month = "+coffeeshop.geTotalIncome() );


    }
}

