package com.example.flowers;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FlowersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowers);
        Button rose=findViewById(R.id.btn_rose);
        Button lily=findViewById(R.id.btn_lily);
        Button orchid=findViewById(R.id.btn_orchid);
        Button daisy=findViewById(R.id.btn_daisy);


        rose.setOnClickListener(v->{
            LayoutInflater layoutInflater = getLayoutInflater();
            View layout = layoutInflater.inflate(R.layout.rose, findViewById(R.id.iv_rose));
            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.setView(layout);
            toast.show();
        });

        lily.setOnClickListener(v->{
            LayoutInflater layoutInflater = getLayoutInflater();
            View layout = layoutInflater.inflate(R.layout.lily, findViewById(R.id.iv_lily));
            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.setView(layout);
            toast.show();
        });

        orchid.setOnClickListener(v->{
            LayoutInflater layoutInflater = getLayoutInflater();
            View layout = layoutInflater.inflate(R.layout.orchid, findViewById(R.id.iv_orchid));
            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.setView(layout);
            toast.show();
        });

        daisy.setOnClickListener(v->{
            LayoutInflater layoutInflater = getLayoutInflater();
            View layout = layoutInflater.inflate(R.layout.daisy, findViewById(R.id.iv_daisy));
            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.setView(layout);
            toast.show();
        });

    }
}