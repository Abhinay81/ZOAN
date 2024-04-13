package com.example.zoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    TextView t2, t3, t4, t5, t6;
    EditText e2, e3, e4, e5, e6, e7, e8;
    Button Signupbutton;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t2 = findViewById(R.id.textView2);
        t3 = findViewById(R.id.textView3);
        t4 = findViewById(R.id.textView4);
        t5 = findViewById(R.id.textView5);
        t6 = findViewById(R.id.textView6);
        e2 = findViewById(R.id.Name);
        e3 = findViewById(R.id.RollNumber);
        e4 = findViewById(R.id.Branch);
        e5 = findViewById(R.id.Year);
        e6 = findViewById(R.id.Section);
        e7 = findViewById(R.id.SetPassword);
        e8 = findViewById(R.id.PhnNumber);


        Signupbutton = findViewById(R.id.button5);


        databaseHelper = new DatabaseHelper(this);

        Signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String RollNumber = e3.getText().toString();
                String Name = e2.getText().toString();
                String Branch = e4.getText().toString();
                String Year = e5.getText().toString();
                String Section = e6.getText().toString();
                String SetPassword = e7.getText().toString();
                String PhnNumber = e8.getText().toString();
                if (RollNumber.equals("") || Name.equals("") || Branch.equals("") || Year.equals("") || Section.equals("") || SetPassword.equals("") || PhnNumber.equals("")) {
                    Toast.makeText(MainActivity2.this, "All fields are mandatory", Toast.LENGTH_SHORT).show();
                } else {
                    Boolean checkuserrollnumber = databaseHelper.checkRollNumber(RollNumber);

                    if (checkuserrollnumber == false) {
                        Boolean insert = databaseHelper.insertData(RollNumber, Name, Branch, Year, Section, PhnNumber, SetPassword);

                        if (insert == true) {
                            Toast.makeText(MainActivity2.this, "SignUp Successfully!!", Toast.LENGTH_SHORT).show();
                            Intent ab = new Intent(getApplicationContext(), MainActivity4.class);
                            startActivity(ab);
                            //openActivity7(v);
                        } else {
                            Toast.makeText(MainActivity2.this, "SignUp Failed!!", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(MainActivity2.this, "User already exists,please login", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });


    }

    /*

    public void openActivity7(View v){
        // Toast.makeText(this,"opening second activity", Toast.LENGTH_SHORT).show();
        Intent ab = new Intent(this, MainActivity4.class);
        startActivity(ab);
    }

     */
}