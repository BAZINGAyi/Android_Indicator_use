package com.example.bazinga.mvpstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.bazinga.mvpstudy.adapter.FoodAdapter;
import com.example.bazinga.mvpstudy.bean.Food;
import com.example.bazinga.mvpstudy.presenter.BasePresenter;
import com.example.bazinga.mvpstudy.presenter.FoodPresenter_1;
import com.example.bazinga.mvpstudy.view.IfoodView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends MVPBaseActivity<IfoodView,FoodPresenter_1> implements IfoodView{

    private RecyclerView recyclerView;

    private FoodAdapter foodAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);


        LinearLayoutManager ll = new LinearLayoutManager(this);

        ll.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(ll);

        mPresenter.attach(this);

        mPresenter.setiFoodModel(1);
        
        mPresenter.fetch();

    }

    @Override
    protected FoodPresenter_1 createPresenter() {

        return new FoodPresenter_1();
    }

    @Override
    public void onLoading() {
        Toast.makeText(this,"加载数据",Toast.LENGTH_LONG).show();
    }

    @Override
    public void showFoods(List<Food> foods) {

        foodAdapter = new FoodAdapter(foods);

        recyclerView.setAdapter(foodAdapter);

    }

}
