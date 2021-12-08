package com.example.mynewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton =(Button) findViewById(R.id.myButton);
        myButton.setOnClickListener(

                new View.OnClickListener(){

                    public void onclick(View v){

                        TextView myText= (TextView) findViewById(R.id.myText);
                        myText.setText("Mai mc hu");
                    }

                }

        );
    }
}