package com.example.dbconnections;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQL extends SQLiteOpenHelper {

    private static final  String DATABASE_NAME = "my_database.db";
    private static final int DATABASE_VERSION =1;

    public SQL(Context context){
        super(context, DATABASE_NAME,null, DATABASE_VERSION);

    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create the tables in the database
        db.execSQL("CREATE TABLE user (id INTEGER PRIMARY KEY,name TEXT,email TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Upgrade the tables in the database
        db.execSQL("DROP TABLE IF EXISTS user");
        onCreate(db);

    }
}






