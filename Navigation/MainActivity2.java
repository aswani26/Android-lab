package com.example.navigation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    TextView t1, t2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);

        Bundle extra = getIntent().getExtras();
        String text = extra.getString("name");
        String text1 = extra.getString("age");
        t1.setText(text);
        t2.setText(text1);
    }
}
