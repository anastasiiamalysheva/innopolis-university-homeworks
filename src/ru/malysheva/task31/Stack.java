package ru.malysheva.task31;

public class Stack {
    char[] items;
    int top;

    public Stack(int size) {
        top = -1;
        items = new char[size];
    }

    public void push(char item) {
        if (top == items.length - 1) {
            throw new RuntimeException("Stek perepolnen");
        }
        items[++top] = item;
        //  top++;

    }

    public char pop() {
        // top--;
        if (top == -1) {
            throw new RuntimeException("Stek pust");
        }
        return items[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
