package com.Fragment.fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment_A extends Fragment {

    Button button1, button2, butSend;
    EditText editText;

@Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
    View v = inflater.inflate(R.layout.fragment_a,
            container, false);
    button1=v.findViewById(R.id.button1);
    button2=v.findViewById(R.id.button2);
    butSend=v.findViewById(R.id.butSend);
    editText=v.findViewById(R.id.EditText);

    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
MainActivity activity = (MainActivity) getActivity();
activity.setResult("button1");
        }
    });
    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            MainActivity activity = (MainActivity) getActivity();
            activity.setResult("button2");
        }
    });
    butSend.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            MainActivity activity = (MainActivity) getActivity();
            activity.setResult(editText.getText().toString());
        }
    });

 return  v;
}

}