package com.example.smartcalculator;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
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

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }




/*
        int id=item.getItemId();
        switch (id) {
            case R.id.menuCalculator:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.menuThemes:
                Toast.makeText(ThemesActivity.this,"Already run",Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }*/




}
