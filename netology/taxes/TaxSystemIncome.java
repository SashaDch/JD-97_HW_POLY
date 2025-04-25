package ru.netology.taxes;

public class TaxSystemIncome extends TaxSystem {
    static final double RATE = 0.06;

    public int calcTaxFor(int debit, int credit) {
        return (int) Math.ceil(debit * RATE);
    }
}
