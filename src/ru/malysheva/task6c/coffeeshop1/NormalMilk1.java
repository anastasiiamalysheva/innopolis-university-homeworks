package ru.malysheva.task6c.coffeeshop1;


class NormalMilk1 extends Milk1 {
    private int volumeB;

    NormalMilk1(int volumeB, int PricePerLiter) {
        super(PricePerLiter);
        this.volumeB = volumeB;
    }

    int getPricePerLiter() {
        return super.getPricePerLiter();
    }
}
