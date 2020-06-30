package ru.malysheva.task6;

import java.time.Period;

public abstract class Unit {
    private int copies; // количество экземпляров
    private Period period; // на сколько можно взять учётную единицу домой
    // other fields...

    public int getCopies() {
        return copies;
    }
}
