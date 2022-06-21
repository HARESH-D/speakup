package com.example.speakup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.speakup.org.uncopyrightedapps.games.memory_wod.activities.MainActivity;

public class gamelayout extends AppCompatActivity {

    AppCompatButton memory_match,memory_speed;
    float v=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_gamelayout);

        memory_match = findViewById(R.id.memory_match);
        memory_speed = findViewById(R.id.memory_speed);

        memory_match .setAlpha(v);
        memory_speed.setAlpha(v);


        memory_match .setTranslationY(800);
        memory_speed.setTranslationY(800);


        memory_match .animate().translationY(0).alpha(1).setDuration(800).setStartDelay(200).start();
        memory_speed.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(400).start();

        memory_match.setOnClickListener(view -> {
            startActivity(new Intent(gamelayout.this, com.example.speakup.org.uncopyrightedapps.games.memory_wod.activities.MainActivity.class));
        });

        memory_speed.setOnClickListener(view -> {
            startActivity(new Intent(gamelayout.this, com.example.speakup.com.app.kids.activity.MainActivity.class));
        });

    }
}