package com.example.jkl_fitness;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView btnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnv = findViewById(R.id.bottomNav);

        //처음화면
        getSupportFragmentManager().beginTransaction().add(R.id.main_frame, new HomeFragment()).commit(); //FrameLayout에 fragment.xml 띄우

        btnv.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id) {
                    case R.id.home :
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,new HomeFragment()).commit();
                        break;
                    case R.id. cal:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,new CalFragment()).commit();
                        break;
                    case R.id. human:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,new HumanFragment()).commit();
                        break;
                    case R.id. notice:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,new NoticeFragment()).commit();
                        break;
                }
                return true;
            }
        });

    }

}