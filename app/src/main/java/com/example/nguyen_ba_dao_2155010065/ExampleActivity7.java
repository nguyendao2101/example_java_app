package com.example.nguyen_ba_dao_2155010065;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExampleActivity7 extends AppCompatActivity {

    private TextView textLatitude, textLongitude;

    Button clickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example7);

        textLatitude = findViewById(R.id.textLatitude);
        textLongitude = findViewById(R.id.textLongitude);
        clickMe = findViewById(R.id.clickMe);

        // Lắng nghe sự kiện chạm vào layout
//        ScrollView scrollView = findViewById(R.id.scrollView);

        clickMe.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                float x = event.getX();
                float y = event.getY();

                textLatitude.setText("Latitude (Y): " + y);
                textLongitude.setText("Longitude (X): " + x);

                return true; // Bắt touch
            }
        });

    }
}
