package com.example.smartcalculator.Solution;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class TableThemes extends SQLiteOpenHelper {

public static final int DATABASE_VERSION = 1;
public static final String DATABASE_NAME = "base";
public static final String TABLE_CONTACTS = "themes";

public static final String THEME_ID = "_id";
public static final String TEXT = "text";



    public TableThemes(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_CONTACTS + "(" + THEME_ID
                + "_id integer primary key autoincrement ," + TEXT + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
db.execSQL("drop table if exists " + TABLE_CONTACTS);

onCreate(db);
    }
}
