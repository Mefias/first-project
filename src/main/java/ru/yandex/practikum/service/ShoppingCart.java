package ru.yandex.practikum.service;

import ru.yandex.practikum.model.Food;

public class ShoppingCart {

    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getPriceWithoutDiscount() {

        double sum = 0;

        for (int i = 0; i< foods.length;i++) {
            sum=sum+foods[i].getPrice() * foods[i].getAmount();
        }
        return sum;
    }

    public double getPriceWithDiscount() {

        double sum = 0;

        for (int i = 0; i< foods.length;i++) {
            sum=sum+(foods[i].getPrice()* foods[i].getAmount() * ((100 - foods[i].getDiscount()) / 100));
        }
        return sum;
    }

    public double getPriceVegetarian() {

        double sum = 0;

        for (int i = 0; i< foods.length;i++) {
           if (foods[i].isVegetarian()) {
               sum = sum + foods[i].getPrice()* foods[i].getAmount();
           }
        }
        return sum;
    }

}
