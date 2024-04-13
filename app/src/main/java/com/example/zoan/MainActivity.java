package com.example.zoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
        b1 = findViewById(R.id.button11);
        b2 = findViewById(R.id.button10);
        /*
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(getApplicationContext(),admin1.class);
                startActivity(a);
            }
        });

         */
    }
    public void openActivity2(View v){
       // Toast.makeText(this,"opening second activity", Toast.LENGTH_SHORT).show();
        Intent abc = new Intent(this, admin1.class);
        startActivity(abc);
    }
    public void openActivity3(View v){
       // Toast.makeText(this,"opening third activity",Toast.LENGTH_SHORT).show();
        Intent b = new Intent(this, secondpage.class);
        startActivity(b);
    }
}