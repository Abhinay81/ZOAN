package com.example.zoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class admin1 extends AppCompatActivity {

    TextView tv1;
    Button bu1;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin1);
        tv1 = findViewById(R.id.textView8);
        bu1 = findViewById(R.id.button);
        e1 = findViewById(R.id.codeword);

        //int s = Integer.parseInt(e1.getText().toString());

        //if (s == 8124) {

        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(admin1.this, admin2.class));
            }
        });

   // }else{
       //    Toast.makeText(admin1.this,"Incorrect Password",Toast.LENGTH_SHORT).show();
      //  }
    }
}