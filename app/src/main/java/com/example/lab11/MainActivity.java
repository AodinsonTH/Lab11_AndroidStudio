package com.example.lab11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lab11.model.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // เก็บ Food 2 อย่างไว้ใน ArrayList<Food> ชื่อว่า foods
        //
        List<Food> foods = new ArrayList<Food>();
        Food food = new Food();
        food.setFood_name("ยำหมูยอ");
        food.setFood_image("https://img.wongnai.com/p/1920x0/2019/11/19/b12451eebc7a4b08887217b7e50c1397.jpg");
        food.setFood_price(30);
        foods.add(food);

        Food food2 = new Food();
        food2.setFood_name("ส้มตำ");
        food2.setFood_image("https://www.eatecon.com/wp-content/uploads/2019/09/papaya-salad-g476c5fb29_1920-1170x878.jpg");
        food2.setFood_price(35);
        foods.add(food2);


        // ส่ง foods ไปให้ MyAdapter
        //
        mAdapter = new MyAdapter(foods, this);
        recyclerView.setAdapter(mAdapter);


    }
}