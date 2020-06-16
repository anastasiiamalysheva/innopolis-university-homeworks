package ru.malysheva.task1;

public class salariesNew {
    public static void main(String args[]) {
            final double NALOGSTAVKA = 0.87;
            int salaryBrutto = Integer.parseInt(args[0]);
            System.out.println ("Размер заработной платы после вычета налогов: " + NALOGSTAVKA * salaryBrutto);

    }

}



