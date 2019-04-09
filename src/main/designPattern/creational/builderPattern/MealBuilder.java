package main.designPattern.creational.builderPattern;

/**
 * Created by wong on 2019/4/8.
 */
public class MealBuilder {

    public Meal buildVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal buildNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
