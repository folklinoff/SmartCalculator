package com.example.smartcalculator.Solution;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.smartcalculator.R;


public class FragmentSigns extends Fragment implements View.OnClickListener {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

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
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentSigns.
     */

    public static FragmentSigns newInstance(String param1, String param2) {
        FragmentSigns fragment = new FragmentSigns();
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
            mParam1 = getArguments().getString(ARG_PARAM1);//это текстовый лайаут фрагмента если надо будет изменять?
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,//связка с лайаутом
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_signs, container, false);

        ButtonMinus= (Button) view.findViewById(R.id.buttonMinus);
        ButtonPlus= (Button) view.findViewById(R.id.buttonPlus);
        ButtonMultiply= (Button) view.findViewById(R.id.buttonMultiply);
        ButtonDivision= (Button) view.findViewById(R.id.buttonDivision);
        ButtonEqual= (Button) view.findViewById(R.id.buttonEqual);
        ButtonSQRT= (Button) view.findViewById(R.id.buttonSqrt);
        ButtonLeftBracket= (Button) view.findViewById(R.id.buttonleftbracket);
        ButtonRightBracket= (Button) view.findViewById(R.id.buttonrightbracket);

        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}