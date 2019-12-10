package com.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pawan.fragments.R;

import java.util.zip.Inflater;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {

    private Button btnArea;
    private EditText etRadius;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_second,container,false);
        etRadius=view.findViewById(R.id.etRadius);
        btnArea=view.findViewById(R.id.btnArea);

        btnArea.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float radius=Float.parseFloat(etRadius.getText().toString());
        float area=3.14f*radius*radius;

        Toast.makeText(getActivity(),"Area of circle:"+area,Toast.LENGTH_SHORT).show();


    }
}
