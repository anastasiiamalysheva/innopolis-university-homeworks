package ru.malysheva.task2;

import java.util.Locale;
import java.util.Scanner;

public class ConvertingTimeNew {
  public static void main(String[] args) {
    System.out.println("Введите количество секунд: ");
    try (Scanner in = new Scanner(System.in).useLocale(Locale.US)) {
      double seconds = in.nextDouble();
      double minutes = seconds / 60;
      double hours = minutes / 60;
      System.out.format("Конвертация секунд в часы: %f", hours);
    }
  }
}
