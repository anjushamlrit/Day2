package com.example.mlrit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Spinner spn;
    String[] names={"a","b","c","d"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn=(Spinner)findViewById(R.id.spinner);
         ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,names);
        spn.setAdapter(aa);

    }
}
