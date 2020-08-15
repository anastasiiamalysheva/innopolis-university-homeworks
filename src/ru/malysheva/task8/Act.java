package ru.malysheva.task8;

import java.util.Date;

public class Act {
    public static void main(String[] args) {

        Date date = new Date();

        String[] nameOfProduct = new String[]{"Wood", "Coal"};

        Contract contract1 = new Contract();
        Contract contract2 = new Contract();

        System.out.println("Номер договора: " + contract1.number);
        System.out.println("Дата: " + date.toString());
        System.out.println("Наименование товара: " + nameOfProduct[0]);
        System.out.println();
        System.out.println("Номер договора: " + contract2.number);
        System.out.println("Дата: " + date.toString());
        System.out.println("Наименование товара: " + nameOfProduct[1]);
    }
}

class Contract {
    double number = Math.random(); //присвоим договору уникальный номер
}
