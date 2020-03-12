package com.example.anithmanu.universitytour;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExploreBuildings extends AppCompatActivity {
    Button gilbert;
    Button boyd;
    Button alwyn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_buildings);
        gilbert = (Button)findViewById(R.id.gilbert);
        alwyn = (Button)findViewById(R.id.alwyn);
        boyd = (Button)findViewById(R.id.boydOrr);

        gilbert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //"geo:47.6,-122.3"
                String uri = "geo:0,0?q=55.871947,-4.288226(Gilbert Scott Building)";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(uri));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        alwyn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = "geo:0,0?q= 55.873862, -4.291973(Sir ALwyn Building)";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(uri));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        boyd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = "geo: 55.873561,-4.292536?z=40 & q=(Boyd Orr Building)";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(uri));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}
