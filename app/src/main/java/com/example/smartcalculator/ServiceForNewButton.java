package com.example.smartcalculator;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class ServiceForNewButton extends Service {

    final String LOG_TAG = "myLogs";

    private final IBinder mBinder = new LocalBinder();
    private ServiceCallbacks serviceCallbacks;



    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(LOG_TAG, "onBind");
        return mBinder;
    }

    @Override
    public void onCreate() {//создание
        super.onCreate();
        Log.d(LOG_TAG, "onCreate");
    }
    public class LocalBinder extends Binder{

        ServiceForNewButton getService(){
            return ServiceForNewButton.this;
        }


        public PodSeviceStub(PodService service) {// added a constructor for Stub here
            mService = new WeakReference<PodService>(service);

        }

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
       if (serviceCallbacks.checkButton()){

        serviceCallbacks.addNewButton();}


        Log.d(LOG_TAG, "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    public void setCallbacks(ServiceCallbacks callbacks){
        serviceCallbacks=callbacks;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    /*void createNewButton(ArrayList<Button>arrayListOfButtonsThemes,
                         Button ButtonTemp,
                         ViewGroup.LayoutParams Param,
                         LinearLayout linearLayout,
                         View.OnLongClickListener onLongClickListener,
                         View.OnClickListener onClickListener) {
       // if(arrayListOfButtonsThemes.get(arrayListOfButtonsThemes.size() -1).getText()!="Write your theme") {
            ButtonTemp = new Button(this);
            ButtonTemp.setText("Write your theme");
            ButtonTemp.setLayoutParams(Param);
            linearLayout.addView(ButtonTemp);
            ButtonTemp.setOnClickListener(onClickListener);
            ButtonTemp.setOnLongClickListener(onLongClickListener);

        //}
    }
*/
    /*void proverka(){
        addNewButton();
    }*/
}
