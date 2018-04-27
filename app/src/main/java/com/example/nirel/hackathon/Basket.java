package com.example.nirel.hackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Basket extends AppCompatActivity {

    static public int items_quantity = 0;
    static public double total_price = 0;

    static public String[] basket = new String[12];

    static public void add(String str, double item_price){
        if (items_quantity < 12)
        {
            for (int i = 0; i < 12; i++){
                if (basket[i] == null)
                {
                    basket[i] = str;
                    total_price += item_price;
                    items_quantity++;
                    break;
                }
            }
        }
        else {
            System.out.println("basket is full");
        }
    }

    static public void print_basket(){
        for (int i = 0; i < 12; i++){
            System.out.println(basket[i]);
        }
        System.out.println("total price: " + total_price);
    }
}
