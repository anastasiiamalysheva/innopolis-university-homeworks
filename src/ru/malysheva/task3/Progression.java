package ru.malysheva.task3;

public class Progression {
  public static void main(String[] args) {
    String typeOfProgression = args[0];
    double firstTerm = Double.parseDouble(args[1]);
    double secondTerm = Double.parseDouble(args[2]);
    int quantityOfTerms = Integer.parseInt(args[3]);
    double commonRatio = 0.0;
    switch (typeOfProgression) {
      case "a" -> commonRatio = secondTerm - firstTerm;
      case "g" -> commonRatio = secondTerm / firstTerm;
      default -> throw new IllegalStateException("Unexpected value: " + typeOfProgression);
    }
    double nextTerm = firstTerm;
    for (int i = 0; i < quantityOfTerms; i++) {
      System.out.println(nextTerm);
      if (typeOfProgression.equals("a")) {
        nextTerm += commonRatio;
      } else if (typeOfProgression.equals("g")) {
        nextTerm *= commonRatio;
      }
    }
  }
}
