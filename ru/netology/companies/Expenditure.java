package ru.netology.companies;

public class Expenditure extends Deal {
    public Expenditure(String goods, int price) {
        super(String.format("Покупка  %s на %d руб.", goods, price), 0, price);
    }
}
