package com.expensemanager.personalexpensemanager;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


import Database.ShoppingDB;


public class summary extends AppCompatActivity {

    TextView textViewTransportSum;
    TextView textViewFoodSum;
    TextView textViewShopSum;
    TextView totSum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        this.textViewTransportSum = (TextView) findViewById(R.id.textViewTransportSum);

        this.textViewFoodSum = (TextView) findViewById(R.id.textViewFoodSum);

        this.textViewShopSum = (TextView) findViewById(R.id.textViewShopSum);
        textViewShopSum.setText(String.valueOf(new ShoppingDB(this).findSum()));

        double total = new ShoppingDB(this).findSum();

        this.totSum = (TextView) findViewById(R.id.totSum);
        totSum.setText(String.valueOf(total));
    }
}
