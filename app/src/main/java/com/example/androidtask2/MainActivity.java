package com.example.androidtask2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView CoursesRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        CoursesRecyclerView = findViewById(R.id.tabs_recyclerView);

        LinearLayoutManager layoutManger = new LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false);

        CoursesRecyclerView.setLayoutManager(layoutManger);

        RecyclerView.Adapter adaptor = new CourseTabsAdaptor();
        CoursesRecyclerView.setAdapter(adaptor);

    }
}