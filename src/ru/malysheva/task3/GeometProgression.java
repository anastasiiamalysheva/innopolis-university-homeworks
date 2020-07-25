package ru.malysheva.task3;

import java.util.Scanner;

public class GeometProgression {
    public static void main(String args[]) {


        double firstTerm = Double.parseDouble(args[0]);
        double secondTerm = Double.parseDouble(args[1]);
        int quantityOfTerms = Integer.parseInt(args[2]);
        double commonRatio = secondTerm / firstTerm;
        double nTerm = firstTerm;

        Scanner in = new Scanner(System.in);
        System.out.println("Please choose your drink: ");
        int choice = in.nextInt();

        for (int i = 0; i < quantityOfTerms; i++) {
            System.out.println(nTerm *= commonRatio);
        }
    }




}



