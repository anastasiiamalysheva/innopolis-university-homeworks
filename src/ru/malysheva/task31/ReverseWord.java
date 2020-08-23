package ru.malysheva.task31;

public class ReverseWord {
    public static void main(String[] args) {
        Stack stack = new Stack(100);
        String string = "nastya";

        System.out.println(string);
        char[] chars = string.toCharArray();
        for (char ch : chars) {
            stack.push(ch);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println();

    }

}
