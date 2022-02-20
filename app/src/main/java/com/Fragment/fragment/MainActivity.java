package com.Fragment.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MyInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment_A fragment_a = new Fragment_A();
        getSupportFragmentManager().beginTransaction().add(R.id.container_a, fragment_a).commit();

        Fragment_B fragment_b = new Fragment_B();
        getSupportFragmentManager().beginTransaction().add(R.id.container_b, fragment_b,"TAG_B").commit();
    }

    @Override
    public void setResult(String s) {
        Fragment fragment = getSupportFragmentManager().findFragmentByTag("TAG_B");
        Fragment_B fragment_b = (Fragment_B) fragment;
        fragment_b.setResult(s);
    }
}