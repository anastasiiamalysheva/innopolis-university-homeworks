package ru.malysheva.task19;

public class ReceiptExample {
    public static void main(String[] args) {
        String heading1 = "Наименование";
        String heading2 = "Цена";
        String heading3 = "Количество";
        String heading4 = "Сумма";

        String divider = "---------------------------------------------------------------";

        String name1 = "Колбаса";
        String name2 = "Картошка";
        String name3 = "Молоко";

        Integer price1 = 10;
        Integer price2 = 20;
        Integer price3 = 30;

        Integer quantity1 = 1;
        Integer quantity2 = 2;
        Integer quantity3 = 3;

        Integer total1 = price1 * quantity1;
        Integer total2 = price2 * quantity2;
        Integer total3 = price3 * quantity3;

        System.out.printf ( "%-15s %15s %15s %15s %n", heading1, heading2, heading3, heading4 );
        System.out.println ( divider );

        System.out.printf ( "%-15s %15d %15d %15d %n", name1, price1, quantity1, total1 );
        System.out.printf ( "%-15s %15d %15d %15d %n", name2, price2, quantity2, total2 );
        System.out.printf ( "%-15s %15d %15d %15d %n", name3, price3, quantity3, total3 );

        System.out.println ( divider );
        System.out.println ( "" );
    }
}



