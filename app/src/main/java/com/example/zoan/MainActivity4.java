package com.example.zoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    TextView tex1,tex2,tex3,tex4;
    ImageView i1,i2,i3;
    Button rent1,rent2,rent3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        tex1 = findViewById(R.id.textView13);
        tex2 = findViewById(R.id.textView14);
        tex3 = findViewById(R.id.textView15);
        tex4 = findViewById(R.id.textView16);
        rent1 = findViewById(R.id.button9);
        rent2 = findViewById(R.id.button7);
        rent3 = findViewById(R.id.button8);
        i1 = findViewById(R.id.drafter);
        i2 = findViewById(R.id.usb);
        i3 = findViewById(R.id.paint);
    }
}