package com.example.smartcalculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentNumbers#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentNumbers extends Fragment implements View.OnClickListener{


    private static final String ARG_PARAM1 = "param1";
    private String mParam1;

    String str="";
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

    public static FragmentNumbers newInstance(String param1, String param2) {//для передачи
        FragmentNumbers fragment = new FragmentNumbers();

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

        Button1.setOnClickListener(this);
        Button2.setOnClickListener(this);
        Button0.setOnClickListener(this);
        Button3.setOnClickListener(this);
        Button4.setOnClickListener(this);
        Button5.setOnClickListener(this);
        Button6.setOnClickListener(this);
        Button7.setOnClickListener(this);
        Button8.setOnClickListener(this);
        Button9.setOnClickListener(this);
        ButtonDot.setOnClickListener(this);
        ButtonX.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

       switch (view.getId()) {
            case R.id.button0:

                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='0';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.button1:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='1';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.button2:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='2';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.button3:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='3';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.button4:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='4';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.button5:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='5';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.button6:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='6';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.button7:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='7';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.button8:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='8';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.button9:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='9';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.button_dot:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='.';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.buttonX:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='x';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
        }
    }


}