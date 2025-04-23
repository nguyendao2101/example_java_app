package com.example.nguyen_ba_dao_2155010065;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button example1;
    Button example2;
    Button example3;
    Button example3_1;
    Button example4;
    Button example5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Đặt việc khởi tạo trong onCreate
        example1 = findViewById(R.id.example1);
        example2 = findViewById(R.id.example2);
        example3 = findViewById(R.id.example3);
        example3_1 = findViewById(R.id.example3_1);
        example4 = findViewById(R.id.example4);
        example5 = findViewById(R.id.example5);

        // Ví dụ: thêm sự kiện click
        example1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý khi nút được bấm
                Intent intent = new Intent(MainActivity.this, ExampleActivity1.class);
                startActivity(intent);
            }
        });

        example2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý khi nút được bấm
                Intent intent = new Intent(MainActivity.this, ExampleActivity2.class);
                startActivity(intent);
            }
        });
        example3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý khi nút được bấm
                Intent intent = new Intent(MainActivity.this, ExampleActivity3.class);
                startActivity(intent);
            }
        });

        example3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý khi nút được bấm
                Intent intent = new Intent(MainActivity.this, ExampleActivity6.class);
                startActivity(intent);
            }
        });
        example4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý khi nút được bấm
                Intent intent = new Intent(MainActivity.this, ExampleActivity4.class);
                startActivity(intent);
            }
        });
        example5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý khi nút được bấm
                Intent intent = new Intent(MainActivity.this, ExampleActivity7.class);
                startActivity(intent);
            }
        });
    }
}
