package com.example.sw5ecompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing);

        Button loadButton = createLoadButton(savedInstanceState);
        Button createButton = createCreateButton(savedInstanceState);
    }

    public Button createLoadButton(Bundle savedInstanceState) {

        final MediaPlayer blaster = MediaPlayer.create(this, R.raw.bcfire01);
        Button loadButton = (Button) this.findViewById(R.id.load_button);
        loadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blaster.start();
            }
        });

        return loadButton;
    }

    public Button createCreateButton(Bundle savedInstanceState) {

        final MediaPlayer saberOn = MediaPlayer.create(this, R.raw.saberon);
        Button createButton = (Button) this.findViewById(R.id.create_button);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saberOn.start();
                startCreation(v);
            }
        });

        return createButton;
    }

    public void startCreation(View v) {

        Intent intent = new Intent(this, BasicCreateActivity.class);
        startActivity(intent);
    }
}
