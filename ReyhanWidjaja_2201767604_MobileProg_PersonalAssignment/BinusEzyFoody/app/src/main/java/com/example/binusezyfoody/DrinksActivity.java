package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import android.content.Intent;

public class DrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drinks);

        final ListView drinklistView = (ListView) findViewById(R.id.listdrink);

        Drinks Mineral = new Drinks(R.drawable.mineral,"Air Mineral", 123);
        Drinks JusApel = new Drinks(R.drawable.apple,"Jus Apel", 123);
        Drinks JusMangga = new Drinks(R.drawable.mango,"Jus Mangga", 123);
        Drinks JusAlpukat = new Drinks(R.drawable.avocado,"Jus Alpukat", 123);


        final ArrayList<Drinks> drinklist = new ArrayList<Drinks>();
        drinklist.add(Mineral);
        drinklist.add(JusApel);
        drinklist.add(JusMangga);
        drinklist.add(JusAlpukat);


        DrinkListAdapter adapter = new DrinkListAdapter(this, R.layout.adapterdrinks, drinklist);
        drinklistView.setAdapter(adapter);


        drinklistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(view.getContext(), OrderActivity.class);
                    intent.putExtra("drinkval",drinklist.get(position).getDrinkname());
                    intent.putExtra("priceval",drinklist.get(position).getDrinkprice());
                    intent.putExtra("imgval",drinklist.get(position).getImage());
                    startActivity(intent);


            }
        });


    }



}