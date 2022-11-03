package com.example.smartcalculator.Solution;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.smartcalculator.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentNumbers#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentNumbers extends Fragment implements View.OnClickListener {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    Button Button0;
    Button Button1;
    Button Button2;
    Button Button3;
    Button Button4;
    Button Button5;
    Button Button6;
    Button Button7;
    Button Button8;
    Button Button9;
    Button ButtonDot;
    Button ButtonX;

    public FragmentNumbers() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentNumbers.
     */

    public static FragmentNumbers newInstance(String param1, String param2) {
        FragmentNumbers fragment = new FragmentNumbers();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_numbers, container, false);
        Button1 = (Button) view.findViewById(R.id.button1);
        Button2 = (Button) view.findViewById(R.id.button2);
        Button0 = (Button) view.findViewById(R.id.button0);
        Button3 = (Button) view.findViewById(R.id.button3);
        Button4 = (Button) view.findViewById(R.id.button4);
        Button5 = (Button) view.findViewById(R.id.button5);
        Button6 = (Button) view.findViewById(R.id.button6);
        Button7 = (Button) view.findViewById(R.id.button7);
        Button8 = (Button) view.findViewById(R.id.button8);
        Button9 = (Button) view.findViewById(R.id.button9);
        ButtonDot = (Button) view.findViewById(R.id.button_dot);
        ButtonX = (Button) view.findViewById(R.id.buttonX);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                break;
            case R.id.button1:
                break;
            case R.id.button2:
                break;
            case R.id.button3:
                break;
            case R.id.button4:
                break;
            case R.id.button5:
                break;
            case R.id.button6:
                break;
            case R.id.button7:
                break;
            case R.id.button8:
                break;
            case R.id.button9:
                break;
            case R.id.button_dot:
                break;
            case R.id.buttonX:
                break;
        }
    }
}