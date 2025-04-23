package com.example.nguyen_ba_dao_2155010065;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExampleActivity5 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example5); // file layout mới

        TextView resultText = findViewById(R.id.resultText);

        // Nhận dữ liệu
        String fullName = getIntent().getStringExtra("full_name");
        resultText.setText("Hello, " + fullName);
    }
}
