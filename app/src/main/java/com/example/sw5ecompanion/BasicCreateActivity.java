package com.example.sw5ecompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.example.sw5ecompanion.models.Character;

import java.util.Arrays;
import java.util.List;

public class BasicCreateActivity extends AppCompatActivity {

    private Character mCharacter;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_create);

        mCharacter = new Character();

        final MediaPlayer spin = MediaPlayer.create(this, R.raw.spin2);

        final EditText nameText = (EditText) findViewById(R.id.char_name);
        final Spinner species = (Spinner) findViewById((R.id.species_select));
        final Spinner charClass = (Spinner) findViewById(R.id.class_select);
        final Spinner background = (Spinner) findViewById(R.id.background_select);
        final Spinner feat = (Spinner) findViewById(R.id.feat);
        Button manual = (Button) findViewById(R.id.manual);
        Button point = (Button) findViewById(R.id.point);
        Button random = (Button) findViewById(R.id.random);


        nameText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Useless
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCharacter.setName(nameText.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Useless
            }
        });

        species.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mCharacter.setSpecies(species.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mCharacter.setSpecies(species.getSelectedItem().toString());
            }
        });

        charClass.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mCharacter.setCharClass(charClass.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mCharacter.setCharClass(charClass.getSelectedItem().toString());
                }
        });

        background.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mCharacter.setBackground(background.getSelectedItem().toString());
                setFeat(feat);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mCharacter.setBackground(background.getSelectedItem().toString());
                setFeat(feat);
            }
        });

        feat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mCharacter.setBackgroundFeat(feat.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mCharacter.setBackgroundFeat(feat.getSelectedItem().toString());
            }
        });

        manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spin.start();
                startManual(savedInstanceState);
            }
        });

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spin.start();
                startRandom(savedInstanceState);
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spin.start();
                startPoint(savedInstanceState);
            }
        });
    }

    public void setFeat(Spinner feat) {

        List<String> list;

        switch (mCharacter.getBackground()) {

            case "Agent" : {

                list = Arrays.asList(getResources().getStringArray(R.array.agent));
                break;
            }
            case "Bounty Hunter" : {
                list = Arrays.asList(getResources().getStringArray(R.array.bounty_hunter));
                break;
            }
            case "Criminal" : {
                list = Arrays.asList(getResources().getStringArray(R.array.criminal));
                break;
            }
            case "Entertainer" : {
                list = Arrays.asList(getResources().getStringArray(R.array.entertainer));
                break;
            }
            case "Gambler" : {
                list = Arrays.asList(getResources().getStringArray(R.array.gambler));
                break;
            }
            case "Jedi" : {
                list = Arrays.asList(getResources().getStringArray(R.array.jedi));
                break;
            }
            case "Mandalorian" : {
                list = Arrays.asList(getResources().getStringArray(R.array.mandalorian));
                break;
            }
            case "Mercenary" : {
                list = Arrays.asList(getResources().getStringArray(R.array.mercenary));
                break;
            }
            case "Noble" : {
                list = Arrays.asList(getResources().getStringArray(R.array.noble));
                break;
            }
            case "Scientist" : {
                list = Arrays.asList(getResources().getStringArray(R.array.scientist));
                break;
            }
            case "Scoundrel" : {
                list = Arrays.asList(getResources().getStringArray(R.array.scoundrel));
                break;
            }
            case "Sith" : {
                list = Arrays.asList(getResources().getStringArray(R.array.sith));
                break;
            }
            case "Smuggler" : {
                list = Arrays.asList(getResources().getStringArray(R.array.smuggler));
                break;
            }
            case "Soldier" : {
                list = Arrays.asList(getResources().getStringArray(R.array.soldier));
                break;
            }
            case "Spacer" : {
                list = Arrays.asList(getResources().getStringArray(R.array.spacer));
                break;
            }
            default : {
                list = Arrays.asList(new String[0]);
                break;
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        feat.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    public void startManual(Bundle savedInstanceState) {

        Intent intent = new Intent(this, ManualStatActivity.class);
        intent.putExtra("character", mCharacter);
        startActivity(intent);
    }

    public void startRandom(Bundle savedInstanceState) {

        Intent intent = new Intent(this, RandomStatActivity.class);
        intent.putExtra("character", mCharacter);
        startActivity(intent);
    }

    public void startPoint(Bundle savedInstanceState) {

        Intent intent = new Intent(this, PointActivity.class);
        intent.putExtra("character", mCharacter);
        startActivity(intent);
    }
}
