package ru.malysheva.task6c.coffeeshop1;


public class SoyaMilk1 extends Milk1 {
    private int volumeA;

    SoyaMilk1(int volumeA, int PricePerLiter) {
        super(PricePerLiter);
        this.volumeA = volumeA;
    }

    int getPricePerLiter() {
        return super.getPricePerLiter();
    }
}

