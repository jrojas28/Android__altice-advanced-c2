package com.altice_crt_a.android__avanzado_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;

import com.altice_crt_a.android__avanzado_2.classes.Car;
import com.altice_crt_a.android__avanzado_2.classes.CustomAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CardView cardView;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Toyota", "Japon"));
        cars.add(new Car("Honda", "Japon"));
        cars.add(new Car("Mitsubishi", "Japon"));
        cars.add(new Car("Volkswagen", "Alemania"));
        cars.add(new Car("Kia", "Korea"));
        cars.add(new Car("Dodge", "United States"));
        cars.add(new Car("Hyundai", "Korea"));
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, LinearLayout.VERTICAL));
        recyclerView.setAdapter(new CustomAdapter(cars));

    }
}
