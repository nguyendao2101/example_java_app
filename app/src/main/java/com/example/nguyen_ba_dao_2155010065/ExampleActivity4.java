package com.example.nguyen_ba_dao_2155010065;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;

public class ExampleActivity4 extends AppCompatActivity {

    FrameLayout contentArea;
    ImageView menuIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example4);

        contentArea = findViewById(R.id.contentArea);
        menuIcon = findViewById(R.id.menuIcon);

        // Xử lý khi click icon menu
        menuIcon.setOnClickListener(view -> showPopupMenu(view));
    }

    private void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenu().add("Red");
        popupMenu.getMenu().add("Blue");
        popupMenu.getMenu().add("Green");

        popupMenu.setOnMenuItemClickListener(item -> {
            String title = item.getTitle().toString();
            switch (title) {
                case "Red":
                    contentArea.setBackgroundColor(Color.RED);
                    break;
                case "Blue":
                    contentArea.setBackgroundColor(Color.BLUE);
                    break;
                case "Green":
                    contentArea.setBackgroundColor(Color.GREEN);
                    break;
            }
            return true;
        });

        popupMenu.show();
    }
}
