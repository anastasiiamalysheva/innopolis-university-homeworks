package ru.malysheva.task6.coffeeshop;

import ru.malysheva.task6.coffeeshop.CoffeeBeans;

public class Coffeeshop {
    private CoffeeBeans[] CoffeeBeansS;
    private Milk[] MilkS;

    public Coffeeshop() {
        CoffeeBeansS = new CoffeeBeans[2];
        CoffeeBeansS[0] = new CoffeeBeans(3000);
        CoffeeBeansS[1] = new CoffeeBeans(3500);
        MilkS = new Milk[2];
        MilkS[0] = new NormalMilk(300, 50);
        MilkS[1] = new SoyaMilk(300, 70);


    }


    private int getMonthlyExpenses1() {
        int sum = 0;
        for (CoffeeBeans cPK : CoffeeBeansS) {
            sum += cPK.getCostPerKilo();

        }
        return sum;

    }

    public int getCoffeeExpenses() {
        return getMonthlyExpenses1() * 3; // for 6 Packages Coffee (2 types: Ethiopia, Kenya for Example)
    }


    private int getMonthlyExpenses2() {
        int sum2 = 0;
        for (Milk M : MilkS) {
            sum2 = MilkS[0].CostPerLiter + MilkS[1].CostPerLiter;

        }
        return sum2;

    }

    public int getMilkExpenses() {
        return getMonthlyExpenses2() * 90;    // 50.00 x 90 Times, 70.00 X 90 Times
        // (2 types: normal, soya)


    }

    public int geTotalIncome(){
        return 180*1000/250 * 150 - getMilkExpenses()- getCoffeeExpenses();
        // 180 пачек молока на 1000 мл, делим на 250 мл (1 порция)
        // Умножаем на 150 рублей, стоимость любого напитка
    }


}


