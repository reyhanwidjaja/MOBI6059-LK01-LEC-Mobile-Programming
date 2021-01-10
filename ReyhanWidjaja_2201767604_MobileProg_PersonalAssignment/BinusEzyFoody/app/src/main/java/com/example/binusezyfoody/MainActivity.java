package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickDrinks(View view) {
        Intent intent = new Intent(this, DrinksActivity.class);
        startActivity(intent);
    }

    public void onClickMyOrder(View view) {
        Intent intent = new Intent(this, MyOrderActivity.class);
        startActivity(intent);
    }
    public void onClickfood(View view) {
        Intent intent = new Intent(this, FoodActivity.class);
        startActivity(intent);
    }
    public void onClicksnack(View view) {
        Intent intent = new Intent(this, SnackActivity.class);
        startActivity(intent);
    }
    public void onClicktopup(View view) {
        Intent intent = new Intent(this, TopUpActivity.class);
        startActivity(intent);
    }

    public void Store(View view) {
        Intent intent = new Intent(this, StoreActivity.class);
        startActivity(intent);
        finish();
    }
}