package com.example.asus.ktu_activitypoints;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText User_Name;
    private EditText Password;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User_Name=(EditText)findViewById(R.id.editTextUser);
        Password=(EditText)findViewById(R.id.editTextPass);
        Login=(Button) findViewById(R.id.Blogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(User_Name.getText().toString(),Password.getText().toString());
            }
        });

    }
    private void login (String user,String pass){
        if ((user.equals("Admin")) && (pass.equals("1234"))){

            Intent intent = new Intent(MainActivity.this,Menu.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(MainActivity.this,"Incorrect Username or Password" ,Toast.LENGTH_LONG).show();
        }
    }
}
