package ru.yandex.practikum;

import ru.yandex.practikum.model.Apple;
import ru.yandex.practikum.model.Food;
import ru.yandex.practikum.model.Meat;
import ru.yandex.practikum.model.constants.Colour;
import ru.yandex.practikum.service.ShoppingCart;


public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, Colour.redColour);
        Apple appleGreen = new Apple(8, 60, Colour.greenColour);
        Food[] food = new Food[]{meat, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(food);
        System.out.println("Сумма товаров без скидки: " + shoppingCart.getPriceWithoutDiscount());
        System.out.println("Сумма скидки для всей корзины: " + (shoppingCart.getPriceWithoutDiscount() - shoppingCart.getPriceWithDiscount()));
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + shoppingCart.getPriceVegetarian());
    }
}
