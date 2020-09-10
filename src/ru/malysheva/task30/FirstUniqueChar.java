package ru.malysheva.task30;

import java.util.Scanner;

public class FirstUniqueChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Введите слово: " );
        String s = scanner.nextLine ().toLowerCase ();

        for ( int i = 0; i < s.length (); i++ ) {
            if ( i == s.lastIndexOf ( s.charAt ( i ) ) && i == s.indexOf ( s.charAt ( i ) ) ) {
                System.out.println ( s.charAt ( i ) );
                break;
            }
        }
    }
}

