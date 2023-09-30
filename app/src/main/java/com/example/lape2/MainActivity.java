package com.example.lape2;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tv = findViewById(R.id.tv);
    }

    public void en8techangetextclick(View view) {
        this.tv.setText("changed text");
    }
}