package com.altice_crt_a.android__avanzado_2.classes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.altice_crt_a.android__avanzado_2.R;

import java.util.ArrayList;

/**
 * Created by jaime on 5/19/2018.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private ArrayList<Car> cars;

    public CustomAdapter(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public int getItemViewType(int position) {
        if(position == 0){
            return R.layout.view_first_card;
        }

        if(position % 2 == 0){
            return R.layout.view_even_card;
        }else{
            return R.layout.view_odd_card;
        }
        //return super.getItemViewType(position);
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.countryText.setText(cars.get(position).getCountry());
        holder.brandText.setText(cars.get(position).getBrand());
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder{
        public TextView brandText;
        public TextView countryText;
        public CustomViewHolder(View itemView) {
            super(itemView);
            brandText = itemView.findViewById(R.id.brand);
            countryText = itemView.findViewById(R.id.country);
        }


    }
}
