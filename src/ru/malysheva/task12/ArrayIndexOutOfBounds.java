package ru.malysheva.task12;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        String[] array = new String[ 2 ];
        array[ 0 ] = "Hello, ";
        array[ 1 ] = "world!";

        System.out.print ( array[ 1 ] );
        System.out.print ( array[ 2 ] );

        //System.out.print (array[0]);
        //System.out.print (array[1]);
    }
}