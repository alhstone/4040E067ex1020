package com.example.a4040e067.a4040e067ex1020;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void docker(View view){
        Intent intent = new Intent(this,LINE01.class);
        startActivity(intent);
    }

    public void aboutme(View view){
        Intent intent = new Intent(this,LINE02.class);
        startActivity(intent);
    }

}

