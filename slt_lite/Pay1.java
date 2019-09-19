package com.example.acer.slt_lite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Pay1 extends AppCompatActivity {
    Button acc,payp,acc1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay1);


        acc = (Button) findViewById(R.id.acc);
        payp = (Button) findViewById(R.id.payp);
        acc1 = (Button) findViewById(R.id.acc1);



        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pay1.this, Acc2.class);
                startActivity(intent);
            }
        });
        payp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pay1.this, com.example.acer.slt_lite.Pay.class);
                startActivity(intent);
            }
        });

        acc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pay1.this, Acc3.class);
                startActivity(intent);
            }
        });
    }
}
