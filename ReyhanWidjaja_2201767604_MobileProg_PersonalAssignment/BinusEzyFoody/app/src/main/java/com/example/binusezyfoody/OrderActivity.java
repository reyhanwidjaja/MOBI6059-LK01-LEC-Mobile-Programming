package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {
    Integer qtyinp;
    String dname;
    Integer dprice;
    Integer dimg;
    EditText x;
    TextView a;
    TextView b;
    ImageView c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);

        a=(TextView) findViewById(R.id.drinksname2);
        b =(TextView) findViewById(R.id.drinksprice2);
        c=(ImageView) findViewById(R.id.imagedrink2);
        a.setText(getIntent() .getStringExtra("drinkval"));
        b.setText("Rp "+String.valueOf(getIntent() .getIntExtra("priceval",0)));
        c.setImageResource(getIntent().getIntExtra("imgval",0));
        x = (EditText) findViewById(R.id.qtyinput);

    }

    public void onClickOrderMore(View view) {
        Intent intent = new Intent(this, DrinksActivity.class);
        startActivity(intent);
    }

    public void onClickMyOrder(View view) {

        Intent intent = new Intent(this, MyOrderActivity.class);
        qtyinp = Integer.parseInt(x.getText().toString());
        dname = getIntent() .getStringExtra("drinkval");
        dprice = getIntent() .getIntExtra("priceval",0);
        dimg = getIntent().getIntExtra("imgval",0);

        intent.putExtra("qtyval",qtyinp);
        intent.putExtra("dnameval", dname);
        intent.putExtra("dpriceval", dprice);
        intent.putExtra("dimgval", dimg);
        startActivity(intent);

    }


}