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

public class DrinkListAdapter extends ArrayAdapter<Drinks> {

    private Context context1;
    int mresource;

    public DrinkListAdapter(Context context, int resource, ArrayList<Drinks> objects) {
        super(context, resource, objects);
        context1 = context;
        mresource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String drinkname = getItem(position).getDrinkname();
        Integer drinkprice = getItem(position).getDrinkprice();
        Integer image = getItem(position).getImage();

        Drinks drinks = new Drinks(image, drinkname,drinkprice);

        LayoutInflater inflater = LayoutInflater.from(context1);
        convertView = inflater.inflate(mresource,parent,false);

        ImageView ivDrinksimage = (ImageView) convertView.findViewById(R.id.imagedrink);
        TextView tvDrinkname = (TextView) convertView.findViewById(R.id.drinksName);
        TextView tvDrinkprice = (TextView) convertView.findViewById(R.id.drinksPrice);

        ivDrinksimage.setImageResource(drinks.getImage());
        tvDrinkname.setText(drinkname);
        tvDrinkprice.setText("Rp "+String.valueOf(drinkprice));

        return convertView;

    }
}

