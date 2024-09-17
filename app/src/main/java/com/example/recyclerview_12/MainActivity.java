package com.example.recyclerview_12;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Info> infoList = new ArrayList<Info>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        setInitialData();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new InfoAdapter(getApplicationContext(), infoList));
    }

    private void setInitialData()
    {
        infoList.add(new Info("Испания", "Столица Испании - Мадрид.", R.drawable.spain));
        infoList.add(new Info("Япония", "Столица Японии - Токио.", R.drawable.japan));
        infoList.add(new Info("Германия", "Столица Германии - Берлин.", R.drawable.germany));
        infoList.add(new Info("Россия", "Столица России - Москва.", R.drawable.russia));
        infoList.add(new Info("Китай", "Столица Китая - Пекин.", R.drawable.china));
        infoList.add(new Info("Австралия", "Столица Австралии - Сидней.", R.drawable.australia));
    }
}