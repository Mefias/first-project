package ru.yandex.practikum.model;

import ru.yandex.practikum.model.constants.Colour;
import ru.yandex.practikum.model.constants.Discount;

public class Apple extends Food  {

    public Apple(int amount, int price, String colour) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = true;
        this.colour = colour;
    }

    private final String colour;

    @Override
    public double getDiscount() {
        if (this.colour.equals(Colour.redColour)){
            return Discount.discount60;
        }
        return Discount.discount0;
    }
}

