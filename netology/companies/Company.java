package ru.netology.companies;

import ru.netology.taxes.TaxSystem;

public class Company {
    private String title;
    private TaxSystem taxSystem;
    private int debit = 0;
    private int credit = 0;

    public Company (String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            this.debit += amount;
        } else {
            this.credit -= amount;
        }
    }

    public void payTaxes() {
        System.out.printf("Компания %s уплатила налог в размере: %d руб.\n",
                this.title,
                this.taxSystem.calcTaxFor(this.debit, this.credit));
        this.debit = 0;
        this.credit = 0;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public int applyDeals(Deal[] deals) {
        for (Deal deal : deals) {
            this.debit += deal.debitChange;
            this.credit += deal.creditChange;
        }

        int profit = this.debit - this.credit;
        payTaxes();
        return profit;
    }
}
