package ru.netology.taxes;

public class TaxSystemProfit extends TaxSystem {
    static final double RATE = 0.15;

    public int calcTaxFor(int debit, int credit) {
        if (debit <= credit) {
            return 0;
        }
        return (int) Math.ceil((debit - credit) * RATE);
    }
}
