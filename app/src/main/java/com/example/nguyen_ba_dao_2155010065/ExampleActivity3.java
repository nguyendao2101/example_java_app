package com.example.nguyen_ba_dao_2155010065;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ExampleActivity3 extends AppCompatActivity {

    EditText yourInput;
    Button clickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example3);

        yourInput = findViewById(R.id.yourInput);
        clickMe = findViewById(R.id.clickMe);

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = yourInput.getText().toString().trim();

                Intent intent = new Intent(ExampleActivity3.this, ExampleActivity5.class);
                intent.putExtra("full_name", inputText);
                startActivity(intent);
            }
        });
    }
}
