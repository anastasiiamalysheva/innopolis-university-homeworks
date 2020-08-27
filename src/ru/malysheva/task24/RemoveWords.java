package ru.malysheva.task24;

import java.util.HashSet;
import java.util.Set;

public class RemoveWords {

    public static void main(String[] args) {

        Set<String> myHashSet = new HashSet<>();

        myHashSet.add("Anjela");
        myHashSet.add("Olivera");
        myHashSet.add("Anastasia");
        myHashSet.add("Polina");

        System.out.println("Before remove:");
        System.out.println(myHashSet);

        System.out.println("After remove:");
        myHashSet.removeIf(x -> x.length() % 2 == 0); // удаляем слова, длина которых дает ноль при делении на два
        System.out.println(myHashSet);

    }


}
