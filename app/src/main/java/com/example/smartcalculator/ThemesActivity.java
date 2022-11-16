package com.example.smartcalculator;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.example.smartcalculator.Solution.TableThemes;
import android.os.Bundle;

import java.util.ArrayList;


public class ThemesActivity extends AppCompatActivity implements View.OnClickListener {

    TableThemes tableThemes ;

    LinearLayout linearLayout;
    ArrayList<Button> arrayListOfButtonsThemes = new ArrayList<Button>();
    Button ButtonThemeMultiplying;
    Button ButtonThemeDivision;
    Button ButtonThemeSubstraction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_themes);

        tableThemes = new TableThemes (this);
        SQLiteDatabase base=tableThemes.getReadableDatabase();

        linearLayout=(LinearLayout)findViewById(R.id.linearLayoutThemes);

        arrayListOfButtonsThemes.add(ButtonThemeMultiplying);
        arrayListOfButtonsThemes.add(ButtonThemeDivision);
        arrayListOfButtonsThemes.add(ButtonThemeSubstraction);



        ButtonThemeMultiplying.setOnClickListener(this);
        ButtonThemeDivision.setOnClickListener(this);
        ButtonThemeSubstraction.setOnClickListener(this);

    }

   public void addNewButton(){

      if(arrayListOfButtonsThemes.get(arrayListOfButtonsThemes.size() - 1).getText()!="Write your theme"){

          linearLayout.addView(R.id.);

      }

   }


    @Override
    public void onClick(View v) {

    }
}
