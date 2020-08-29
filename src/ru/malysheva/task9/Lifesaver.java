package ru.malysheva.task9;

public class Lifesaver extends Human {

    @Override
    public void run() {
        System.out.println("Скорость спасателя бегом 15 км в час");

    }

    @Override
    public void swim() {
        System.out.println("Скорость спасателя вплавь 5 км в час");
    }

}
