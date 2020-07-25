package ru.malysheva.VendingToday;


public enum DrinksMenu {

    JUICE("Orange juice", 100),
    WATER("Steel water", 50),
    TEA("Ice tea", 75);

    private final String name;
    private final int price;

    DrinksMenu(String name, int cost) {
        this.name = name;
        this.price = cost;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}

