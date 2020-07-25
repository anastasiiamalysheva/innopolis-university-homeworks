package ru.malysheva.VendingToday;

import java.util.Scanner;

public class DrinkVendo {
    public static void main(String[] args) {

        for (DrinksMenu dm : DrinksMenu.values()) {
            System.out.println(dm);
            System.out.println();
        }

        double money = 0.0;
        money = acceptMoney();

        if (isMoneyEnough(money)) {
            dispenseDrink();
        } else {
            notify("Not enough money");
        }

        if (money > chooseItemPrice()) {
            System.out.println("\nYour change is " + issueChange(money) + " roubles. ");
        }
    }


    public static double acceptMoney() {
        Scanner input = new Scanner(System.in);
        double payAmount = 0.0;

        System.out.println("Please insert money ");
        payAmount = input.nextDouble();

        return payAmount;
    }

    public static boolean isMoneyEnough(double myMoney) {
        if (myMoney >= chooseItemPrice()) {
            return true;
        } else {
            return false;
        }
    }

    public static void dispenseDrink() {
        System.out.println("Your drink is served ");
    }

    public static void notify(String message) {
        System.out.println(message);
    }

    public static double issueChange(double payment) {
        double change = 0.0;

        change = payment - chooseItemPrice();

        return change;

    }

    public static double chooseItemPrice() {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;

        System.out.println("Please type the price of drink ");
        itemPrice = in.nextDouble();
        return itemPrice;

    }

    public int chooseMachineButton() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please push the button, where 1: menu, 2: enter money, 3: make an order and 0: exit. ");
        int machineButton = in.nextInt();
        return machineButton;

    }


}
