package com.example.smartcalculator;



import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
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
    Button ButtonTemp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_themes);

        tableThemes = new TableThemes (this);
        SQLiteDatabase base=tableThemes.getReadableDatabase();

        linearLayout=(LinearLayout)findViewById(R.id.linearLayoutThemes);


        ButtonThemeSubstraction=(Button)findViewById(R.id.buttonThemeSubstraction);
        ButtonThemeDivision=(Button)findViewById(R.id.buttonThemeDivision);
        ButtonThemeMultiplying=(Button)findViewById(R.id.buttonThemeMultiplying);



        arrayListOfButtonsThemes.add(ButtonThemeMultiplying);
        arrayListOfButtonsThemes.add(ButtonThemeDivision);
        arrayListOfButtonsThemes.add(ButtonThemeSubstraction);



        ButtonThemeMultiplying.setOnClickListener(this);
        ButtonThemeDivision.setOnClickListener(this);
        ButtonThemeSubstraction.setOnClickListener(this);





       addNewButton();
    }



    View.OnLongClickListener onLongClickListener= new View.OnLongClickListener(){
        @Override
        public boolean onLongClick(View v) {
            ButtonTemp.setText("opa!");




            return true;
        }

    };



   public void addNewButton(){
      if(arrayListOfButtonsThemes.get(arrayListOfButtonsThemes.size() - 1).getText()!="Write your theme"){

          ButtonTemp=new Button(this);
          ButtonTemp.setText("Write your theme");
          LayoutParams Param = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
          ButtonTemp.setLayoutParams(Param);
          linearLayout.addView(ButtonTemp);
          ButtonTemp.setOnClickListener(this);
          ButtonTemp.setOnLongClickListener(onLongClickListener);
      }

   }




    @Override
    public void onClick(View v) {

    }
}
