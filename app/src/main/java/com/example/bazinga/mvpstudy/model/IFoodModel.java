package com.example.bazinga.mvpstudy.model;

import com.example.bazinga.mvpstudy.bean.Food;

import java.util.List;

/**
 * Created by bazinga on 2017/4/10.
 */
// model 业务逻辑层
public interface IFoodModel {
//用来加载数据

    void loadFood(FoodOnLoadListener foodOnLoadListener);
//用于回调
    interface FoodOnLoadListener{
        void onCompleted(List<Food> foods);
    }
}
