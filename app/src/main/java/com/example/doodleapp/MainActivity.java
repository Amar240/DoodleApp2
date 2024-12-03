package com.example.doodleapp;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private DoodleView doodleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doodleView = findViewById(R.id.doodleView);

        Button clearButton = findViewById(R.id.clearButton);
        clearButton.setOnClickListener(view -> doodleView.clearCanvas());

        Button brushSizeButton = findViewById(R.id.brushSizeButton);
        brushSizeButton.setOnClickListener(view -> doodleView.setBrushSize(20));

        Button colorPickerButton = findViewById(R.id.colorPickerButton);
        colorPickerButton.setOnClickListener(view -> doodleView.setBrushColor(Color.RED));

        // Color Buttons
        Button colorRedButton = findViewById(R.id.colorRedButton);
        colorRedButton.setOnClickListener(view -> doodleView.setBrushColor(Color.RED));

        Button colorBlueButton = findViewById(R.id.colorBlueButton);
        colorBlueButton.setOnClickListener(view -> doodleView.setBrushColor(Color.BLUE));

        Button colorGreenButton = findViewById(R.id.colorGreenButton);
        colorGreenButton.setOnClickListener(view -> doodleView.setBrushColor(Color.GREEN));

        Button colorYellowButton = findViewById(R.id.colorYellowButton);
        colorYellowButton.setOnClickListener(view -> doodleView.setBrushColor(Color.YELLOW));
    }
}
