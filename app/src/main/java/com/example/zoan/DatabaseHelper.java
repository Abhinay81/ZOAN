package com.example.zoan;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String databasename="Students.db";

    public DatabaseHelper(@Nullable Context context) {
        super(context, "Students.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDatabase) {
        MyDatabase.execSQL("create Table students(RollNumber TEXT primary key,Name TEXT,Branch TEXT,Year TEXT,Section TEXT,PhnNumber TEXT,SetPassword TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDatabase, int i, int i1) {
        MyDatabase.execSQL("drop Table if exists students");

    }

    public Boolean insertData(String RollNumber,String Name,String Branch,String Year,String Section,String PhnNumber,String SetPassword){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("RollNumber",RollNumber);
        values.put("Name",Name);
        values.put("Branch",Branch);
        values.put("Year",Year);
        values.put("Section",Section);
        values.put("PhnNumber",PhnNumber);
        values.put("SetPassword",SetPassword);
        long result = MyDatabase.insert("students",null,values);

        if(result == -1){
            return false;
        }else{
            return true;
        }
    }

    public Cursor getData(){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        Cursor cursor = MyDatabase.rawQuery("Select * from students",null);
        return cursor;
    }

    public Boolean checkRollNumber(String RollNumber){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        Cursor cursor = MyDatabase.rawQuery("Select * from students where RollNumber = ?",new String[]{RollNumber});

        if(cursor.getCount() > 0){
            return true;
        }else{
            return false;
        }
    }

    public Boolean checkRollNumberSetPassword(String RollNumber,String SetPassword){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        Cursor cursor = MyDatabase.rawQuery("Select * from students where RollNumber = ? and SetPassword = ?",new String[]{RollNumber,SetPassword});

        if(cursor.getCount() > 0){
            return true;
        }else{
            return false;
        }
    }
}
