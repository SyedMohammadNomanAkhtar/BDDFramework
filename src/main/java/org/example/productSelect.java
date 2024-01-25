package org.example;

import java.util.Random;

public class productSelect {
    static Random random = new Random();
    static int randomInt = random.nextInt(6)+1;

    public static String CartXpath="//div[@class ='inventory_list']/div[@class='inventory_item']["+randomInt+"]/div[@class='inventory_item_description']/div[@class='pricebar']/button";

    public static String trolleyXpath="//a[@class='shopping_cart_link']";
}
