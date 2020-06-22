package ru.malysheva.task6.coffeeshop;




public class SoyaMilk extends Milk {

    private int volume1; // объем проданных чашек



    SoyaMilk(int volume1, int CostPerLiter) {
        super(CostPerLiter);
        this.volume1 = volume1;
    }

    @Override
    int getCostPerLiter() {
        return super.getCostPerLiter() ;

    }


}
