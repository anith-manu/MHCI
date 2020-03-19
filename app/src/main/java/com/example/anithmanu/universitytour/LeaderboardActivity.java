package com.example.anithmanu.universitytour;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.anithmanu.universitytour.ui.home.HomeFragment;
import com.example.anithmanu.universitytour.ui.home.HomeViewModel;

public class LeaderboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        Button homeButton;
        homeButton = (Button)findViewById(R.id.end_home_button);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ModesActivity.class);
                startActivity(intent);
            }
        });
    }
}
