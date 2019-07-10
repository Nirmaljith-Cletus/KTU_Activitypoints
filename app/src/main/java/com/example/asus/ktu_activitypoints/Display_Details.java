package com.example.asus.ktu_activitypoints;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;


public class Display_Details extends AppCompatActivity {

    EditText Uid;
    EditText Tpoints;
    Button points;
    Button cert;
    int total=0;
    GridView gridView;
    ArrayList<List> list;
    ListAdapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display__details);

        Uid=(EditText) findViewById(R.id.editTextUid);
        Tpoints=(EditText) findViewById(R.id.editTextTpoints);
        points=(Button) findViewById(R.id.buttonTpoints);
        cert=(Button) findViewById(R.id.buttoncertificates);

        points.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Apoints(Uid.getText().toString());
            }
        });

        cert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Acert(Uid.getText().toString());

            }
        });


    }
    //Function to display activity points of a student
    public void Apoints(String Uidfn) {
        total=0;
        Cursor cursor = Add_Details.sqLiteHelper.getData("SELECT * FROM FOOD");

        //To print the certificates of student Uid
        while (cursor.moveToNext()) {

            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String price = cursor.getString(2);
            byte[] image = cursor.getBlob(3);

            if(name.equals(Uidfn)){

                total = total + (Integer.parseInt(price));
            }

        }

        Tpoints.setText(""+total);


    }


    //Function to display certificates of a students
    public void Acert(String Uidfn){

        Intent intent = new Intent(Display_Details.this, Uid_certificates.class);
        intent.putExtra("Uid",Uidfn);
        startActivity(intent);


    }



}
