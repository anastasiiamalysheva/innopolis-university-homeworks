package ru.malysheva.task7;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        for (Drinks d : Drinks.values()) {
            System.out.println(d);
            System.out.println();
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Please choose your drink: ");
        int choice = in.nextInt();

        System.out.println("Insert money: ");
        int money = in.nextInt();

        if (choice == 1) {

            System.out.println("Your balance now: " + (money - 100));

        } else if (choice == 2) {
            System.out.println("Your balance now: " + (money - 50));

        } else if (choice == 3) {
            System.out.println("Your balance now: " + (money - 75));

        } else {
            System.out.println("Your choice: " + choice + " is not available. Please choose another one.");
        }
        int a = money - 100;
        int b = money - 50;
        int c = money - 75;

        if (a > 0 | b > 0 | c > 0) {
            System.out.println("Your drink is served. Would you like to buy something else? ");
        } else {
            System.out.println("Thank you! Goodbye! ");
        }
    }


}
