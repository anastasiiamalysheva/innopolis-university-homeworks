package ru.malysheva.task9;

public enum Animals {

    SHARK("Andy"),
    DUCK("Donald"),
    DOG("Micro");

    private final String name;

    private Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
