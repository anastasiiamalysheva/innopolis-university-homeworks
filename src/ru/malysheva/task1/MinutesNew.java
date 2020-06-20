package ru.malysheva.task1;

public class MinutesNew {
  public static void main(String[] args) {
    final double SECONDS_IN_AN_HOUR = 3600.0;
    double seconds = Double.parseDouble(args[0]);
    System.out.println("Конвертация секунд в часы: " + seconds / SECONDS_IN_AN_HOUR);
  }
}
