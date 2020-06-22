package ru.malysheva.task6.coffeeshop;

class NormalMilk extends Milk{

    private int volume2; // объем проданных чашек
    NormalMilk(int volume2, int CostPerLiter) {
        super(CostPerLiter);
        this.volume2 = volume2;
    }

    @Override
    int getCostPerLiter() {
        return super.getCostPerLiter()  ;

    }
}
