package ru.malysheva.task33;


import java.util.HashMap;

public class MostFrequent {

    public static void main(String[] args) {

        String s = "anastasia";

        String[] letters = s.split("");

        HashMap<String, Integer> keyValue = new HashMap<>();

        for (int i = 0; i <= letters.length - 1; i++) {

            if (keyValue.containsKey(letters[i])) {

                int counter = keyValue.get(letters[i]);

                keyValue.put(letters[i], counter + 1);

            } else {
                keyValue.put(letters[i], 1);
            }
        }
        System.out.println(keyValue);
    }
}

