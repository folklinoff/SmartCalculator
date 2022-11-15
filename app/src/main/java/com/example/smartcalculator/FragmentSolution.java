package com.example.smartcalculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentSolution extends Fragment implements View.OnClickListener {

    private static final String ARG_PARAM1 = "param1";
    private String mParam1;

    Button ButtonFullSolution;
    Button ButtonThemes;
    public FragmentSolution() {
        // Required empty public constructor
    }

    public static FragmentSolution newInstance(String param1) {
        FragmentSolution fragment = new FragmentSolution();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);

        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,//связка с лайаутом
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_solution, container, false);

        ButtonFullSolution= (Button) view.findViewById(R.id.buttonFullSolution);
        ButtonThemes= (Button) view.findViewById(R.id.buttonThemes);

        ButtonFullSolution.setOnClickListener( this);
        ButtonThemes.setOnClickListener( this);

        return view;
    }



    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.buttonFullSolution:
                Toast.makeText(getActivity(),"Test",Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(getActivity(),  SolutionActivity.class);
                startActivity(intent1);
                break;
            case R.id.buttonThemes:
                Toast.makeText(getActivity(),"Test",Toast.LENGTH_LONG).show();
                Intent intent2 = new Intent(getActivity(), ThemesActivity.class);
                startActivity(intent2);
                break;

        }
    }
}