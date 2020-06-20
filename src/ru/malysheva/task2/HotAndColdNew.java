package ru.malysheva.task2;

import java.util.Scanner;

public class HotAndColdNew {
  public static void main(String[] args) {

    double x = (Math.random() * 100) + 1;

    System.out.println("Угадайте загаданное число в диапазоне от нуля до ста");

    Scanner in = new Scanner(System.in);
    System.out.println("Попробуйте например ввести число 0: ");
    int numberNull = in.nextInt();

    if (numberNull > x)
      System.out.println("Загаданное число меньше");
    else if (numberNull < x) System.out.println("Загаданное число больше");
    else if (numberNull == x) System.out.println("Вы угадали!");

    System.out.println("Выберите любое число от 1 до 100: ");
    int userNumber = in.nextInt();
    do {
      if (userNumber > x) System.out.println("Загаданное число меньше");
      else if (numberNull < x) System.out.println("Загаданное число больше");
      else System.out.println("Вы угадали!");
    } while (in.nextInt() == x);
    System.out.println("Вы угадали!");
  }
}
