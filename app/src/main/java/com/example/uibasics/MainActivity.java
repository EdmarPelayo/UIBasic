package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHelloBtnClicked(View view) {
        TextView txtWelcome = findViewById(R.id.txtWelcome); //here I am creating an instance of the "TextView" class by creating a text view called
                                                             //called txtWelcome and sending it to the ID I made in the XML file,
                                                             // usually not ideal to instantiate it in a method like this because you won't be able to use it
                                                             // in other methods, but here we or just using the textView in this method
        txtWelcome.setText("Hello Again");      //This method changes words on the screen.

    }
}