package com.example.bazinga.mvpstudy.model;

import com.example.bazinga.mvpstudy.bean.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bazinga on 2017/4/10.
 */

public class FoodModel_1 implements IFoodModel {
    @Override
    public void loadFood(FoodOnLoadListener foodOnLoadListener) {

        List<Food> foods = new ArrayList<>();

        for (int i = 0; i < 10 ;i++){

            Food food = new Food();

            food.setName("dasdsad"+i);

            foods.add(food);
        }

        foodOnLoadListener.onCompleted(foods);
    }
}
