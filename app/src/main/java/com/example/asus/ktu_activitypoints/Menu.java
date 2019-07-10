package com.example.asus.ktu_activitypoints;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button bview;
    Button badd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        bview = (Button) findViewById(R.id.disp_details);
        badd = (Button) findViewById(R.id.add_details);

        bview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                det();

            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();

            }
        });

    }



    public void det(){
        Intent intent=new Intent(Menu.this,Display_Details.class);
        startActivity(intent);
    }

    public void add(){
        Intent intent=new Intent(Menu.this,Add_Details.class);
        startActivity(intent);

    }
}