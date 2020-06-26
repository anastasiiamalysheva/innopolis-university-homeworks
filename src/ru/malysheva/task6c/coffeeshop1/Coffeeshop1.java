package ru.malysheva.task6c.coffeeshop1;


public class Coffeeshop1 {
    private CoffeeBeans1[] CoffeeBeans1S = new CoffeeBeans1[2];
    private Milk1[] Milk1S;

    public Coffeeshop1() {
        this.CoffeeBeans1S[0] = new CoffeeBeans1(3000);
        this.CoffeeBeans1S[1] = new CoffeeBeans1(3500);
        this.Milk1S = new Milk1[2];
        this.Milk1S[0] = new NormalMilk1(360, 50);
        this.Milk1S[1] = new SoyaMilk1(360, 70);
    }

    private int getMonthlyExpenses1A() {
        int sumA = 0;
        for (CoffeeBeans1 CB1 : CoffeeBeans1S) {
            sumA += CB1.getPricePerKilo();
        }
        return sumA;
    }

    public int getCoffeeExpensesB() {

        return this.getMonthlyExpenses1A() * 3;// 6 пачек всего, по 3 одного вида
    }

    private int getMonthlyExpenses2B() {
        int sumB = 0;
        for (Milk1 M1 : Milk1S) {


            sumB = this.Milk1S[0].PricePerLiter + this.Milk1S[1].PricePerLiter;
        }

        return sumB;
    }

    public int getMilkExpensesA() {
        return this.getMonthlyExpenses2B() * 90; // 90 пачек каждого молока
    }

    public int geTotalIncomeA() {
        return 180 * 1000 / 250 * 150 - this.getMilkExpensesA() - this.getCoffeeExpensesB();
        // 90 Х 2 = 180 литров молока всего
        // Умножаем на 1000 мл, чтобы разделить на 250 мл требуемого молока для одной порции
        // Умножаем каждый напиток на 150 руб.(кофейня fix-price
        // Вычитаем затраты на кофе и молоко
    }
}
