package com.example.anithmanu.universitytour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModesMenu extends AppCompatActivity {
    Button exploreButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modes_menu);

        exploreButton = (Button)findViewById(R.id.explore_button);

        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ExploreBuildings.class);
                startActivity(intent);
            }
        });
    }
}
