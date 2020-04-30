package com.expensemanager.personalexpensemanager;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


import Database.TransportDB;

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
        textViewTransportSum.setText(String.valueOf(new TransportDB(this).findSum()));

        this.textViewFoodSum = (TextView) findViewById(R.id.textViewFoodSum);

        this.textViewShopSum = (TextView) findViewById(R.id.textViewShopSum);


        Double total = new TransportDB(this).findSum();

        this.totSum = (TextView) findViewById(R.id.totSum);
        totSum.setText(String.valueOf(total));
    }
}
