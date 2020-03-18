package com.example.anithmanu.universitytour.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import com.example.anithmanu.universitytour.ExploreBuildings;
import com.example.anithmanu.universitytour.FutureActivity;
import com.example.anithmanu.universitytour.GuidedTourActivity;
import com.example.anithmanu.universitytour.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        Button exploreButton;
        Button futureCampus_button;
        Button guidedTour_button;

        exploreButton = (Button) root.findViewById(R.id.explore_button);
        futureCampus_button = (Button)root.findViewById(R.id.futureCampus_button);
        guidedTour_button = (Button)root.findViewById(R.id.guidedTour_button);

        guidedTour_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), GuidedTourActivity.class);
                startActivity(intent);
            }
        });

        futureCampus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), FutureActivity.class);
                startActivity(intent);
            }
        });

        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ExploreBuildings.class);
                startActivity(intent);
            }
        });

        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });
        return root;
    }
}