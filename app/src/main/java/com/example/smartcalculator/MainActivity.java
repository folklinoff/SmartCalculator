package com.example.smartcalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentTransaction;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.smartcalculator.Solution.FragmentNumbers;
import com.example.smartcalculator.Solution.FragmentSigns;
import com.example.smartcalculator.Solution.Solver.FragmentSolution;

public class MainActivity extends AppCompatActivity implements OnClickListener {

private final String TAG=this.getClass().getSimpleName();//для логов глобальная переменнная почему не статик

FragmentSigns fragmentSigns=new FragmentSigns();
FragmentNumbers fragmentNumbers=new FragmentNumbers();
FragmentSolution fragmentSolution=new FragmentSolution();

    final Button ButtonSigns=(Button)findViewById(R.id.buttonSigns);
    final Button ButtonNumbers=(Button)findViewById(R.id.buttonNumbers);
    final Button ButtonSolution=(Button)findViewById(R.id.buttonSolution);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setNewFragment(fragmentSigns);

        ButtonNumbers.setOnClickListener( this);
        ButtonSolution.setOnClickListener( this);
        ButtonSigns.setOnClickListener(this);
    }

    private void setNewFragment(Fragment f) {
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragmentContainerView,f);
        ft.commit();//это че сохраняет??
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id=item.getItemId();
        switch (id){
            case R.id.menuSupport://как использовать калькуль
                Toast.makeText(MainActivity.this,"It is not ready",Toast.LENGTH_LONG).show();
                break;
            case R.id.menuHelp://решение
                Toast.makeText(MainActivity.this,"It is not ready too",Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonSolution:
                setNewFragment(fragmentSolution);
                break;
            case R.id.buttonNumbers:
                setNewFragment(fragmentNumbers);
                Log.i(TAG,"fragmentNumbers");
                break;
            case R.id.buttonSigns:
                setNewFragment(fragmentSigns);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}