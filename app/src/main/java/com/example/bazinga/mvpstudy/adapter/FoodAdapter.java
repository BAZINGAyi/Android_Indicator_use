package com.example.bazinga.mvpstudy.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bazinga.mvpstudy.R;
import com.example.bazinga.mvpstudy.bean.Food;

import java.util.List;


/**
 * Created by bazinga on 2017/4/10.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    List<Food> datas;

    public  FoodAdapter(List<Food> datas){

        this.datas = datas;

    }

    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        final FoodAdapter.ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(FoodAdapter.ViewHolder holder, int position) {

        holder.textView.setText(datas.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }


    public  class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView)itemView.findViewById(R.id.display);
        }
    }
}
