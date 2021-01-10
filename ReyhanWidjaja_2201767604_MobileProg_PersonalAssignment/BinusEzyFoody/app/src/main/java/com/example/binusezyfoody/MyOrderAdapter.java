package com.example.binusezyfoody;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;


import java.util.ArrayList;

public class MyOrderAdapter extends ArrayAdapter<MyOrder> {

    private Context context1;
    int mresource;

    public MyOrderAdapter(Context context, int resource, ArrayList<MyOrder> objects) {
        super(context, resource, objects);
        context1 = context;
        mresource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String drinkn = getItem(position).getDrinkn();
        Integer qty = getItem(position).getQty();
        Integer total;
        Integer grandtotal;
        Integer image = getItem(position).getImg();
        Integer price = getItem(position).getPrice();

        MyOrder myorder = new MyOrder(qty,image,price,drinkn);

        LayoutInflater inflater = LayoutInflater.from(context1);
        convertView = inflater.inflate(mresource,parent,false);

        ImageView ivDrinksimage3 = (ImageView) convertView.findViewById(R.id.imagedrink3);
        TextView tvDrinkname3 = (TextView) convertView.findViewById(R.id.drink3);
        TextView tvDrinkprice3 = (TextView) convertView.findViewById(R.id.total);


        ivDrinksimage3.setImageResource(myorder.getImg());
        tvDrinkname3.setText(drinkn);
        tvDrinkprice3.setText(String.valueOf(qty)+" x Rp "+price+" = "+"Rp "+String.valueOf(total=qty*price));


        return convertView;

    }
}