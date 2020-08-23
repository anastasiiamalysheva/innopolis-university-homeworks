package ru.malysheva.task12;

public class Exception {

    static void method() {
        try {
            throw new NullPointerException("Exception in method");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public static void main(String args[]) {
        System.out.println("Hello World!");
        try {
            method();
        } catch (NullPointerException e) {
            System.out.println("Catch inside main : " + e.getMessage());
        }
    }
}

