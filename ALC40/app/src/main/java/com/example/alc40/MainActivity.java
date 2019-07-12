package com.example.alc40;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.alc:
                        Intent i = new Intent(getApplication(), AndelaWebsite.class);
                        startActivity(i);
                        break;
                    case R.id.home:
                       getApplication();
                        break;
                    case R.id.profile:
                        Intent profileIntent = new Intent(getApplication(), Profile.class);
                        startActivity(profileIntent);
                        break;
                }
                return true;
            }
        });
    }


}
