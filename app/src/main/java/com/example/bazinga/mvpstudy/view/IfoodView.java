package com.example.bazinga.mvpstudy.view;

import com.example.bazinga.mvpstudy.bean.Food;

import java.util.List;

/**
 * Created by bazinga on 2017/4/10.
 */

// 用于显示数据
public interface IfoodView {

    void onLoading();

    void showFoods(List<Food> foods);
}
