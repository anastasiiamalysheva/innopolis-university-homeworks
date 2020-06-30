package ru.malysheva.task6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    // todo считать из файла построчно данные о книгах и журналах, разместить их в массивах
    try (Scanner scanner = new Scanner(new FileReader("units.txt"))) {
      // считывание данных и расположение их в массивах
      String line = scanner.nextLine();
      String[] strings = line.split(",");
      String author = strings[0];
      String title = strings[1];
      int copies = Integer.parseInt(strings[2]);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    // todo вызывать метод для проверки срока сдачи учётных единиц обратно в библиотеку
    // возможно, стоит запустить цикл для эмуляции течения времени
  }
}
