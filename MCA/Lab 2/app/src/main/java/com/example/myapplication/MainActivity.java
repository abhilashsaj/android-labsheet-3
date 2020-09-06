package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Main Activity","Created Main Activity");
        setContentView(R.layout.activity_main);
    }
    public void callSecondActivity(View view){
        Log.e("Calling Second Activity","Calling Activity two ");
        Intent i = new Intent(getApplicationContext(), MainActivityTwo.class);
        i.putExtra("Value1", "Android By Javatpoint");
        i.putExtra("Value2", "Simple Tutorial");
        // Set the request code to any code you like, you can identify the
        // callback via this code
        startActivity(i);
    }
}
