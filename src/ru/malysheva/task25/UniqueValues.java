package ru.malysheva.task25;

import java.util.*;

public class UniqueValues {
    public static void main(String[] args) {
        Map<String, String> mapValues = new HashMap<> ();
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Введите количество пар:" );
        int n = in.nextInt ();
        System.out.println ( "Теперь введите данные в формате key=value" );
        for ( int i = 0; i < n; i++ ) {
            String a = in.next ();
            String b = in.next ();
            mapValues.put ( a, b );
        }
        for ( Map.Entry<String, String> m : mapValues.entrySet () ) {
            System.out.println ( m.getKey () + " " + m.getValue () );
        }
        Set<String> uniqueValues = new HashSet<> ( mapValues.values () );
        System.out.println ( mapValues.containsValue ( uniqueValues ) );
    }
}
