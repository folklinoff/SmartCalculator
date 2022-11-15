package com.example.smartcalculator;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.smartcalculator.Solution.TableThemes;



public class ThemesActivity extends AppCompatActivity {

    TableThemes tableThemes ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_themes);

        tableThemes = new TableThemes (this);

        SQLiteDatabase base=tableThemes.getReadableDatabase();



    }




}
