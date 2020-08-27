package ru.malysheva.task31;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String string = sc.nextLine().toLowerCase();

        Deque<Character> stack = new ArrayDeque<>();

        System.out.println(string);
        char[] chars = string.toCharArray();
        for (char ch : chars) {
            stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb.toString().equals(string));
    }
}
