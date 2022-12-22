package com.example.smartcalculator;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class ThemeActivity extends AppCompatActivity {
    TextView textOfTheme;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);
        textOfTheme= (TextView)findViewById(R.id.textView);
        //textOfTheme.setText(R.id.);
    }
}
