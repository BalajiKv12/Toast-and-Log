package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Button;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button = findViewById(R.id.toastButton);
        text = findViewById(R.id.textbox);

        Button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Toast.makeText((Context) MainActivity.this,text.getText(),Toast.LENGTH_SHORT).show();
                
                Log.d("MainActivity", "onClick: Sent Toast Message");
                Log.i("MainActivity", "Hello Message Toasted");
                Log.e("MainActivity", "Error Message Toasted");
            }

        });
    }
}