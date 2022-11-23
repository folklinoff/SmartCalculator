package com.example.smartcalculator;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SolutFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SolutFragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Button ButtonFullSolution;
    Button ButtonThemes;
    TextView textView;

    public SolutFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SolutFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SolutFragment newInstance(String param1, String param2) {
        SolutFragment fragment = new SolutFragment();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_solut, container, false);
        ButtonFullSolution = (Button) view.findViewById(R.id.buttonFullSolution);
        ButtonThemes = (Button) view.findViewById(R.id.buttonThemes);
        textView=(TextView) view.findViewById( R.id.textViewForFragmentSolut);

        ButtonFullSolution.setOnClickListener(this);
        ButtonThemes.setOnClickListener(this);

         String strtext = getArguments().getString("edittext");
        textView.setText(strtext);


        return view ;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonThemes:
                Intent intent1 = new Intent(getActivity(), ThemesActivity.class);
                startActivity(intent1);
                break;

            case R.id.buttonFullSolution:
                Intent intent2 = new Intent(getActivity(),  SolutionActivity.class);
                startActivity(intent2);
                break;
            case R.id.buttonSolution:
                String strtext = getArguments().getString("edittext");
                textView.setText(strtext);
                break;
        }
    }
}