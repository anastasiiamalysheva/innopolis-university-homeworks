package ru.malysheva.task33;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String s = sc.nextLine();

        char[] letters = s.toCharArray();
        Map<Character, Integer> keyValue = new HashMap<>();
        for (char letter : letters) {
            keyValue.merge(letter, 1, Integer::sum);
        }
        System.out.println(keyValue);
        int max = Integer.MIN_VALUE;
        for (Integer value : keyValue.values()) {
            max = Integer.max(max, value);
        }
        System.out.println(max);
    }
}

