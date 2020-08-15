package ru.malysheva.task11;

import java.util.Scanner;

public class Byaka {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String sent = getSentence();
        System.out.println();
        System.out.println(sent.replaceAll(" бяка ", " 'вырезано цензурой' "));
    }

    public static String getSentence() {
        System.out.println("Исходный текст без цензуры: ");
        String sent = "";
        if (scanner.hasNextLine()) {
            sent = scanner.nextLine();
        } else {
            System.out.println("Вы допустили ошибку при вводе текста. Попробуйте еще раз. ");
        }
        return sent;


    }

}
