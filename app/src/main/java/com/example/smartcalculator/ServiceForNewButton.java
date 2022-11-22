package com.example.smartcalculator;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ServiceForNewButton extends Service {

    final String LOG_TAG = "myLogs";


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    public void onCreate() {//создание
        super.onCreate();
        Log.d(LOG_TAG, "onCreate");
    }

    public void onStartCommand(Intent intent,
                               ArrayList<Button>arrayListOfButtonsThemes ,
                               Button ButtonTemp,
                               LinearLayout linearLayout,
                               View.OnLongClickListener onLongClickListener,
                               View.OnClickListener onClickListener) {
        Log.d(LOG_TAG, "onStartCommand");
        createNewButton(arrayListOfButtonsThemes, ButtonTemp, linearLayout,onLongClickListener,onClickListener);
        /*  return super.onStartCommand(intent);*/
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    void createNewButton(ArrayList<Button>arrayListOfButtonsThemes,
                         Button ButtonTemp,
                         LinearLayout linearLayout,
                         View.OnLongClickListener onLongClickListener,
                         View.OnClickListener onClickListener) {

            ButtonTemp= new Button(this);
            ButtonTemp.setText("Write your theme");
            ViewGroup.LayoutParams Param = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            ButtonTemp.setLayoutParams(Param);
            linearLayout.addView(ButtonTemp);
            ButtonTemp.setOnClickListener(onClickListener);
            ButtonTemp.setOnLongClickListener(onLongClickListener);


    }
}
