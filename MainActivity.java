package ru.s.second;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;



public class MainActivity extends Activity implements View.OnClickListener {

    Button l1;
    Button l2;
    Button l3;
    Button l4;
    Button r1;
    Button r2;
    Button r3;
    Button r4;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 = (Button) findViewById(R.id.l1);
        l2 = (Button) findViewById(R.id.l2);
        l3 = (Button) findViewById(R.id.l3);
        l4 = (Button) findViewById(R.id.l4);
        r1 = (Button) findViewById(R.id.r1);
        r2 = (Button) findViewById(R.id.r2);
        r3 = (Button) findViewById(R.id.r3);
        r4 = (Button) findViewById(R.id.r4);


        l1.setOnClickListener(this);
        l2.setOnClickListener(this);
        l3.setOnClickListener(this);
        l4.setOnClickListener(this);
        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
        r4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intentl1 = new Intent(MainActivity.this, l1.class);
        Intent intentr1 = new Intent(MainActivity.this, r1.class);
        Intent intentl2 = new Intent(MainActivity.this, l2.class);
        Intent intentr2 = new Intent(MainActivity.this, r2.class);
        Intent intentl3 = new Intent(MainActivity.this, l3.class);
        Intent intentr3 = new Intent(MainActivity.this, r3.class);
        Intent intentl4 = new Intent(MainActivity.this, l4.class);
        Intent intentr4 = new Intent(MainActivity.this, r4.class);

        switch (v.getId()) {
            case R.id.l1:
                startActivity(intentl1);
                break;
            case R.id.l2:
                startActivity(intentl2);
                break;
            case R.id.l3:
                startActivity(intentl3);
                break;
            case R.id.l4:
                startActivity(intentl4);
                break;
            case R.id.r1:
                startActivity(intentr1);
                break;
            case R.id.r2:
                startActivity(intentr2);
                break;
            case R.id.r3:
                startActivity(intentr3);
                break;
            case R.id.r4:
                startActivity(intentr4);
                break;
        }
    }
}