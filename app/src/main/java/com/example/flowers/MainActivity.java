package com.example.flowers;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nxt_btn=findViewById(R.id.next_button);
        Button btn_welcome=findViewById(R.id.btn_welcome);
        TextView text=findViewById(R.id.text);

        btn_welcome.setOnClickListener(v->{
            text.setText("Welcome to the app!");

        });

        nxt_btn.setOnClickListener(v->{
            Toast.makeText(this, "Next button is clicked", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this,FlowersActivity.class);
            startActivity(intent);
        });
    }








}