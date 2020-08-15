package ru.malysheva.task9;

import java.util.Arrays;

public abstract class Animal {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Animals.values()));

        System.out.print(Animals.SHARK.getName() + " ");
        System.out.print(Animals.DUCK.getName() + " ");
        System.out.print(Animals.DOG.getName());

    }


}



