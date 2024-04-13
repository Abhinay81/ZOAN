package com.example.zoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondpage extends AppCompatActivity {

    Button b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(c);
            }
        });

    }
    /*
    public void openActivity4(View v){
        // Toast.makeText(this,"opening second activity", Toast.LENGTH_SHORT).show();
        Intent c = new Intent(this, MainActivity2.class);
        startActivity(c);
    }*/
    public void openActivity5(View v){
        // Toast.makeText(this,"opening second activity", Toast.LENGTH_SHORT).show();
        Intent d = new Intent(this, MainActivity3.class);
        startActivity(d);
    }
}