package ru.yandex.practikum.model;

import ru.yandex.practikum.model.constants.Discount;

public abstract class Food implements Discountable{
   protected int amount;
    protected int price;

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    protected boolean isVegetarian;

    @Override
    public double getDiscount() {
        return Discount.discount0;
    }
}
