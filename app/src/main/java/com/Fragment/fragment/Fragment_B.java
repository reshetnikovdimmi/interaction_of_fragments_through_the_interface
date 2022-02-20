package com.Fragment.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment_B extends Fragment implements MyInterface {
   TextView textView2;
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_b,
                container, false);

        textView2 = v.findViewById(R.id.textView2);



        return  v;
    }

    @Override
    public void setResult(String s) {
textView2.setText(s);
    }
}

