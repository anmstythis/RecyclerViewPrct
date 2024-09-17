package com.example.recyclerview_12;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        String countryData = getIntent().getStringExtra("country_data");
        String capitalData = getIntent().getStringExtra("capital_data");

        TextView countryTV = findViewById(R.id.country);
        TextView capitalTV = findViewById(R.id.capital_name);

        if (countryData != null && capitalData != null) {
            countryTV.setText(countryData);
            capitalTV.setText(capitalData);
        }
    };
}