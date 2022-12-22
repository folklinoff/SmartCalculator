package com.example.smartcalculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import java.util.Stack;


public class FragmentSigns extends Fragment implements View.OnClickListener { //передаем данные

    private static final String ARG_PARAM1 = "param1";
    public String mParam1;

    Stack<String> line = new Stack<>();


    String str="";

    Button ButtonMinus;
    Button ButtonPlus;
    Button ButtonMultiply;
    Button ButtonEqual;
    Button ButtonLeftBracket;
    Button ButtonRightBracket;
    Button ButtonDivision;
    Button ButtonSQRT;

    public FragmentSigns() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment FragmentSigns.
     */

    public static FragmentSigns newInstance(String param1) {
        FragmentSigns fragment = new FragmentSigns();

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
        View view = inflater.inflate(R.layout.fragment_signs, container, false);

        ButtonMinus = (Button) view.findViewById(R.id.buttonMinus);
        ButtonPlus = (Button) view.findViewById(R.id.buttonPlus);
        ButtonMultiply = (Button) view.findViewById(R.id.buttonMultiply);
        ButtonDivision = (Button) view.findViewById(R.id.buttonDivision);
        ButtonEqual = (Button) view.findViewById(R.id.buttonEqual);
        ButtonSQRT = (Button) view.findViewById(R.id.buttonSqrt);
        ButtonLeftBracket = (Button) view.findViewById(R.id.buttonleftbracket);
        ButtonRightBracket = (Button) view.findViewById(R.id.buttonrightbracket);

        ButtonMinus.setOnClickListener(this);
        ButtonPlus.setOnClickListener(this);
        ButtonMultiply.setOnClickListener(this);
        ButtonRightBracket.setOnClickListener(this);
        ButtonLeftBracket.setOnClickListener(this);
        ButtonSQRT.setOnClickListener(this);
        ButtonEqual.setOnClickListener(this);
        ButtonDivision.setOnClickListener(this);



        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.buttonMinus:

                 str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='-';
                line.push("-");
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;

            case R.id.buttonDelete:
                str = str.replace(str.substring(str.length()-1), "");
                line.pop();
                break;


            case R.id.buttonMultiply:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='*';
                line.push("*");
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.buttonPlus:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='+';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.buttonEqual:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='=';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.buttonDivision:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='/';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.buttonSqrt:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+="SQRT";
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.buttonleftbracket:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+='(';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            case R.id.buttonrightbracket:
                str=  ((EditText)getActivity().findViewById(R.id.editTextTextMultiLine)).getText().toString();
                str+=')';
                ((EditText) getActivity().findViewById(R.id.editTextTextMultiLine)).setText(str);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}