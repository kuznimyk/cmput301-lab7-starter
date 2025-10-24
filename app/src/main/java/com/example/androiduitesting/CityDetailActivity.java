package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CityDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_detail);

        // Get the city name from the intent extras
        String cityName = getIntent().getStringExtra("CITY_NAME");

        // Find the TextView and set the city name
        TextView cityNameTextView = findViewById(R.id.textView_cityName);
        cityNameTextView.setText(cityName);

        // Set up the back button to finish the activity
        Button backButton = findViewById(R.id.button_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
