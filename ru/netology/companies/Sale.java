package ru.netology.companies;

public class Sale extends Deal {
    public Sale(String goods, int price) {
        super(String.format("Продажа %s на %d руб.", goods, price), price, 0);
    }
}
