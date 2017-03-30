package com.forever.createPattern.builderPattern;

/**
 * Created by Administrator on 2017/3/16.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareVegMeal();
        Float total = meal.getTotal();
        System.out.println(total);
        meal.showItems();

        Meal meal1 = mealBuilder.prepareNoVegMeal();
        meal1.addItem(new VegBurger());
        System.out.println(meal1.getTotal());
        meal1.showItems();

    }
}
