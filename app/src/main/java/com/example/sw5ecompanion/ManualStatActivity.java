package com.example.sw5ecompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sw5ecompanion.models.Character;
import com.example.sw5ecompanion.utils.InputFilterMinMax;

public class ManualStatActivity extends AppCompatActivity {

    private Character mCharacter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manual_stat);

        if(savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                mCharacter = null;
            } else {
                mCharacter = (Character) extras.getSerializable("character");
            }
        } else {
            mCharacter = (Character) savedInstanceState.getSerializable("character");
        }

        final MediaPlayer off = MediaPlayer.create(this, R.raw.saberoff);

        final EditText strength = (EditText) findViewById(R.id.strength);
        final EditText dexterity = (EditText) findViewById(R.id.dexterity);
        final EditText constitution = (EditText) findViewById(R.id.constitution);
        final EditText intelligence = (EditText) findViewById(R.id.intelligence);
        final EditText wisdom = (EditText) findViewById(R.id.wisdom);
        final EditText charisma = (EditText) findViewById(R.id.charisma);
        Button create = (Button) findViewById(R.id.create);

        strength.setFilters(new InputFilter[]{new InputFilterMinMax(1, 18)});
        dexterity.setFilters(new InputFilter[]{new InputFilterMinMax(1, 18)});
        constitution.setFilters(new InputFilter[]{new InputFilterMinMax(1, 18)});
        intelligence.setFilters(new InputFilter[]{new InputFilterMinMax(1, 18)});
        wisdom.setFilters(new InputFilter[]{new InputFilterMinMax(1, 18)});
        charisma.setFilters(new InputFilter[]{new InputFilterMinMax(1, 18)});

        strength.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Beyond useless
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCharacter.setStrength(Integer.parseInt(strength.getText().toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Still useless
            }
        });

        dexterity.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Beyond useless
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCharacter.setDexterity(Integer.parseInt(dexterity.getText().toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Still useless
            }
        });

        constitution.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Beyond useless
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCharacter.setConstitution(Integer.parseInt(constitution.getText().toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Still useless
            }
        });

        intelligence.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Beyond useless
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCharacter.setIntelligence(Integer.parseInt(intelligence.getText().toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Still useless
            }
        });

        wisdom.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Beyond useless
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCharacter.setWisdom(Integer.parseInt(wisdom.getText().toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Still useless
            }
        });

        charisma.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Beyond useless
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCharacter.setCharisma(Integer.parseInt(charisma.getText().toString()));
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Still useless
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                off.start();
            }
        });
    }
}
