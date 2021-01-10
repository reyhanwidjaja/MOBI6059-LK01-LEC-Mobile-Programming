package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import android.content.Intent;
import android.widget.TextView;

public class MyOrderActivity extends AppCompatActivity {
    MyOrder order1;
    MyOrder order2;
    MyOrder order3;
    MyOrder order4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myorder);
        int grand = 0;

        int v;
        int im;
        int p;
        String n;
        final ListView myorderlistView = (ListView) findViewById(R.id.listmyorder);
        v=getIntent().getIntExtra("qtyval",0);
        im=getIntent().getIntExtra("dimgval",0);
        p=getIntent().getIntExtra("dpriceval",0);
        n=getIntent().getStringExtra("dnameval");

        order1 = new MyOrder(v, im,p,n );

        order2 = new MyOrder(2, R.drawable.avocado, 123, "Jus Alpukat");
        order3 = new MyOrder(4, R.drawable.mango,123, "Jus Mangga");
        order4 = new MyOrder(1, R.drawable.apple, 123, "Jus Apel");

        TextView tvGrand = (TextView) findViewById(R.id.grandtotal);


        final ArrayList<MyOrder> myorderlist = new ArrayList<MyOrder>();
        myorderlist.add(order1);
        grand += getIntent().getIntExtra("dpriceval",0)* getIntent().getIntExtra("qtyval",0);
        myorderlist.add(order2);
        grand += 2*123;
        myorderlist.add(order3);
        grand += 4*123;
        myorderlist.add(order4);
        grand += 1*123;

        if(v==0 && p==0 && im==0 && n==null){
            myorderlist.remove(order1);
        }


        tvGrand.setText("Total: Rp. "+String.valueOf(grand));



        final MyOrderAdapter adapter = new MyOrderAdapter(this, R.layout.adaptermyorder, myorderlist);
        myorderlistView.setAdapter(adapter);

        myorderlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    myorderlist.remove(order1);
                    adapter.notifyDataSetChanged();
                }


            }
        });
    }

    public void onClickPayNow(View view) {
        Intent intent = new Intent(this, OrderCompleteActivity.class);
        intent.putExtra("qtyval1",getIntent().getIntExtra("qtyval",0));
        intent.putExtra("dnameval1", getIntent().getStringExtra("dnameval"));
        intent.putExtra("dpriceval1", getIntent().getIntExtra("dpriceval",0));
        intent.putExtra("dimgval1", getIntent().getIntExtra("dimgval",0));
        startActivity(intent);


    }

}