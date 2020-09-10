package ru.malysheva.task12;

public class NullPointerException {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        printString ( name );
    }

    private void printString(String s) {
        System.out.println ( s + " (" + s.length () + ")" );
    }

    public static void main(String[] args) {
        NullPointerException printer = new NullPointerException ();
        //printer.setName("Hello world");
        printer.print ();
    }

}
