package ru.malysheva.task3;

public class multiplicationTable{
    public static void main(String[] args){
        for (int i = 1; i < 10; i++){
            for (int k = 1; k < 10; k++)
                System.out.print(k * i + "  ");
                System.out.println("\n");
        }

    }

}