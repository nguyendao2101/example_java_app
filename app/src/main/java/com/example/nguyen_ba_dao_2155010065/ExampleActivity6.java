package com.example.nguyen_ba_dao_2155010065;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExampleActivity6 extends AppCompatActivity {

    TextView text1;
    Button clickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example6);

        text1 = findViewById(R.id.text1);
        clickMe = findViewById(R.id.clickMe);

        // Thiết lập sự kiện click cho nút
        clickMe.setOnClickListener(v -> {
            // Thay đổi nội dung của TextView từ "text1" thành "text2"
            text1.setText("You long click button");
        });
    }
}
