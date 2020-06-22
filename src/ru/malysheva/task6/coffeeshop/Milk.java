package ru.malysheva.task6.coffeeshop;

public class Milk {
    protected int CostPerLiter;
    Milk (int CostPerLiter){
        this.CostPerLiter = CostPerLiter;
    }
    int getCostPerLiter(){
        return CostPerLiter;
    }
}
