package com.example.zoan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class admin2 extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> RollNumber,Name,Branch,Year,Section,PhnNumber,Password;
    DatabaseHelper DB;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin2);
        DB = new DatabaseHelper(this);
        RollNumber = new ArrayList<>();
        Name = new ArrayList<>();
        Branch = new ArrayList<>();
        Year = new ArrayList<>();
        Section = new ArrayList<>();
        PhnNumber = new ArrayList<>();
        Password = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerview);
        adapter = new MyAdapter(this,RollNumber,Name,Branch,Year,Section,PhnNumber,Password);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        displaydata();
    }

    private void displaydata() {
        Cursor cursor = DB.getData();
        if(cursor.getCount() == 0){
            Toast.makeText(admin2.this,"No Entry Exists",Toast.LENGTH_SHORT).show();
            return;
        }else{
            while(cursor.moveToNext()){
                RollNumber.add(cursor.getString(0));
                Name.add(cursor.getString(1));
                Branch.add(cursor.getString(2));
                Year.add(cursor.getString(3));
                Section.add(cursor.getString(4));
                PhnNumber.add(cursor.getString(5));
                Password.add(cursor.getString(6));
            }
        }
    }
}