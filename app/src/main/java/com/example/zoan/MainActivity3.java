package com.example.zoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText ed1,ed2;
    Button loginbutton;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        loginbutton = findViewById(R.id.button6);
        ed1 = findViewById(R.id.Loginrn);
        ed2 = findViewById(R.id.Loginpd);

        databaseHelper = new DatabaseHelper(this);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Loginrn = ed1.getText().toString();
                String Loginpd = ed2.getText().toString();

                if(Loginrn.equals("")||Loginpd.equals("")){
                    Toast.makeText(MainActivity3.this,"All fields are mandatory",Toast.LENGTH_SHORT).show();
                }else{
                    Boolean checkcredentials = databaseHelper.checkRollNumberSetPassword(Loginrn,Loginpd);

                    if(checkcredentials == true){
                        Toast.makeText(MainActivity3.this,"Login Successfull!!!",Toast.LENGTH_SHORT).show();
                        Intent cd = new Intent(getApplicationContext(), MainActivity4.class);
                        startActivity(cd);
                    }else{
                        Toast.makeText(MainActivity3.this,"Invalid Credentials!!!",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    /*
    public void openActivity6(View v){
        // Toast.makeText(this,"opening second activity", Toast.LENGTH_SHORT).show();
        Intent cd = new Intent(this, MainActivity4.class);
        startActivity(cd);
    }

     */
}