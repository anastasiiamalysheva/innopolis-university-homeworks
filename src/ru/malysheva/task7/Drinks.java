package ru.malysheva.task7;

public enum Drinks {

    JUICE("Orange juice", 100),
    WATER("Steel water", 50),
    TEA("Ice tea", 75);

    private final String name;
    private final int price;

    private Drinks(String name, int cost) {
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

