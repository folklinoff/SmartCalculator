
package com.example.smartcalculator;


import android.content.ComponentName;
import android.content.ServiceConnection;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.smartcalculator.Solution.TableThemes;

import java.util.ArrayList;


public class ThemesActivity extends AppCompatActivity implements ServiceCallbacks{

    final String LOG_ThemesActivity = this.getClass().getSimpleName();;

    TableThemes tableThemes ;

    LinearLayout linearLayout;
    ArrayList<Button> arrayListOfButtonsThemes = new ArrayList<Button>();
    Button ButtonThemeMultiplying;
    Button ButtonThemeDivision;
    Button ButtonThemeSubstraction;
    Button ButtonTemp;

    ServiceForNewButton mService;
    private boolean isBound;



        @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            Log.d(LOG_ThemesActivity, "onCreate");

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



        ButtonThemeMultiplying.setOnClickListener(onClickListener);
        ButtonThemeDivision.setOnClickListener(onClickListener);
        ButtonThemeSubstraction.setOnClickListener(onClickListener);

        ButtonThemeMultiplying.setOnLongClickListener(onLongClickListener);
        ButtonThemeDivision.setOnLongClickListener(onLongClickListener);
        ButtonThemeSubstraction.setOnLongClickListener(onLongClickListener);





            ViewGroup.LayoutParams Param = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
       /* if(arrayListOfButtonsThemes.get(arrayListOfButtonsThemes.size() -1).getText()!="Write your theme") {
            mService.createNewButton(arrayListOfButtonsThemes, ButtonTemp, Param, linearLayout, onLongClickListener, onClickListener);
            //mService.proverka();

        }*/

    }

    @Override
    protected void onStart() {
        super.onStart();



    }

    @Override
    protected void onStop() {
        super.onStop();

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    View.OnLongClickListener onLongClickListener= new View.OnLongClickListener(){
        @Override
        public boolean onLongClick(View v) {
            ButtonTemp.setText("opa!");
            return true;
        }

    };


    View.OnClickListener onClickListener= new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            int id=v.getId();
            switch (id){
                case R.id.buttonThemeMultiplying:
                    setContentView(R.layout.activity_theme);
                    break;
                case R.id.buttonThemeDivision:
                    setContentView(R.layout.activity_theme);
                    break;
                case R.id.buttonThemeSubstraction:
                    setContentView(R.layout.activity_theme);
                    break;
                default:
                    break;

            }

        }
    };



    @Override
    public boolean checkButton() {
        Log.d(LOG_ThemesActivity, "checkButton");
        if(arrayListOfButtonsThemes.get(arrayListOfButtonsThemes.size() - 1).getText()=="Write your theme") {
return false;
        } else return true;
    }

    ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            // используем mService экземпляр класса для доступа к публичному ServiceForNewButton
            ServiceForNewButton.LocalBinder localService = (ServiceForNewButton.LocalBinder) service;
            mService = localService.getService();
            isBound = true;

            Log.d(LOG_ThemesActivity, "onServiceConnected");
            mService.setCallbacks(ThemesActivity.this);

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;
        }
    };

    @Override
public void addNewButton(){
        Log.d(LOG_ThemesActivity, "addNewButton");
          ButtonTemp=new Button(this);
          ButtonTemp.setText("Write your theme");
          LayoutParams Param = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
          ButtonTemp.setLayoutParams(Param);
          linearLayout.addView(ButtonTemp);
          ButtonTemp.setOnClickListener(onClickListener);
          ButtonTemp.setOnLongClickListener(onLongClickListener);
          arrayListOfButtonsThemes.add(ButtonTemp);
      }

}
