package ru.malysheva.task9;

public class Student extends Human {


    @Override
    public void run() {
        System.out.println("Скорость студента бегом 12 км в час");
    }

    @Override
    public void swim() {
        System.out.println("Скорость студента вплавь 3 км в час");
    }
}
