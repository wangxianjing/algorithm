package main.design.creational.builderPattern;

/**
 * 要素：具体的食物（包装，价格，名字）item，一个套餐meal包含几个食物，一个套餐创建者mealBuilder创建两个套餐；
 * <p>
 * Created by wong on 2019/4/8.
 */
public class Client {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.buildNonVegMeal();
        meal.showItems();
        System.out.println("--------------------");

        Meal meal1 = mealBuilder.buildVegMeal();
        meal1.showItems();
    }
}
