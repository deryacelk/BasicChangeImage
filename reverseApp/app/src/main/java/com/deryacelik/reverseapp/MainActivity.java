package com.deryacelik.reverseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = findViewById(R.id. textView);
        TextView textView2 = findViewById(R.id.textView2);

        textView1.setText("hello");
        textView2.setText("hello2");
    }
}