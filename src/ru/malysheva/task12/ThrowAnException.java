package ru.malysheva.task12;

public class ThrowAnException {
    public static void main(String[] args) {
        try {
            String sent = concatenation ( "hello ", "world" );
            System.out.printf ( "The whole sentence: %s%n", sent );
            concatenation ( "hello ", "w" );
            System.out.printf ( "The whole sentence: %s%n", sent );
        } catch (IllegalArgumentException ex) {
            System.out.println ( ex.getMessage () );
        }
    }

    public static String concatenation(String i, String j) {
        if ( j.equals ( "w" ) ) {
            throw new IllegalArgumentException ( "Слово 'world' написано неправильно" );
        }
        return i + j;
    }
}

