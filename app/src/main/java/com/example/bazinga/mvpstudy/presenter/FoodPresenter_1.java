package com.example.bazinga.mvpstudy.presenter;

import com.example.bazinga.mvpstudy.bean.Food;
import com.example.bazinga.mvpstudy.model.FoodModel_1;
import com.example.bazinga.mvpstudy.model.FoodModel_2;
import com.example.bazinga.mvpstudy.model.IFoodModel;
import com.example.bazinga.mvpstudy.view.IfoodView;

import java.util.List;

/**
 * Created by bazinga on 2017/4/10.
 */

public class FoodPresenter_1 extends BasePresenter<IfoodView> {

    IFoodModel iFoodModel ;

    IfoodView ifoodView;

    public FoodPresenter_1(){

    }

    public void attach(IfoodView ifoodView) {
        this.ifoodView = ifoodView;
    }

    // 绑定 view 和 model
    public void fetch(){

        ifoodView.onLoading();

        if (iFoodModel != null){

            iFoodModel.loadFood(new IFoodModel.FoodOnLoadListener() {
                @Override
                public void onCompleted(List<Food> foods) {

                    ifoodView.showFoods(foods);
                }
            });
        }

    }

    public void setiFoodModel(int i){

        if (i == 0)

            iFoodModel = new FoodModel_1();

        else if(i == 1)

            iFoodModel = new FoodModel_2();

    }


}
