package com.example.sw5ecompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.example.sw5ecompanion.models.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomStatActivity extends AppCompatActivity {

    private static int counter;
    private ArrayList<String> stats;
    private ArrayList<String> strList;
    private ArrayList<String> dexList;
    private ArrayList<String> conList;
    private ArrayList<String> intList;
    private ArrayList<String> wisList;
    private ArrayList<String> chaList;
    private Spinner strength;
    private Spinner dexterity;
    private Spinner constitution;
    private Spinner intelligence;
    private Spinner wisdom;
    private Spinner charisma;
    ArrayAdapter<String> strAdapter;
    ArrayAdapter<String> dexAdapter;
    ArrayAdapter<String> conAdapter;
    ArrayAdapter<String> intAdapter;
    ArrayAdapter<String> wisAdapter;
    ArrayAdapter<String> chaAdapter;
    private Character character;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random_stat);

        counter = 3;

        if(savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                character = null;
            } else {
                character = (Character) extras.getSerializable("character");
            }
        } else {
            character = (Character) savedInstanceState.getSerializable("character");
        }

        strength = (Spinner) findViewById(R.id.strength);
        dexterity = (Spinner) findViewById(R.id.dexterity);
        constitution = (Spinner) findViewById(R.id.constitution);
        intelligence = (Spinner) findViewById(R.id.intelligence);
        wisdom = (Spinner) findViewById(R.id.wisdom);
        charisma = (Spinner) findViewById(R.id.charisma);
        final Button reroll = (Button) findViewById(R.id.reroll);

        rollStats();

        strength.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(!strength.getSelectedItem().toString().equals("0") && !strength.getSelectedItem().toString().equals(Integer.toString(character.getStrength()))) {

                    for(int i = 0; i < stats.size(); i++) {

                        if(strength.getSelectedItem().toString().equals(stats.get(i))) {

                            position = i;
                            break;
                        }
                    }

                    if(character.getStrength() == 0) {

                        stats.remove(position);
                    } else {

                        stats.set(position, Integer.toString(character.getStrength()));
                    }

                    character.setStrength(Integer.parseInt(strength.getSelectedItem().toString()));
                    clearStats();
                    updateStats();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        dexterity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(character.getDexterity() == 0 && !dexterity.getSelectedItem().toString().equals("0") && !dexterity.getSelectedItem().toString().equals(Integer.toString(character.getDexterity()))) {

                    for(int i = 0; i < stats.size(); i++) {

                        if(dexterity.getSelectedItem().toString().equals(stats.get(i))) {

                            position = i;
                            break;
                        }
                    }
                    if(character.getDexterity() == 0) {

                        stats.remove(position);
                    } else {

                        stats.set(position, Integer.toString(character.getDexterity()));
                    }

                    character.setDexterity(Integer.parseInt(dexterity.getSelectedItem().toString()));
                    clearStats();
                    updateStats();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        constitution.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(!constitution.getSelectedItem().toString().equals("0") && !constitution.getSelectedItem().toString().equals(Integer.toString(character.getConstitution()))) {

                    for(int i = 0; i < stats.size(); i++) {

                        if(constitution.getSelectedItem().toString().equals(stats.get(i))) {

                            position = i;
                            break;
                        }
                    }
                    if(character.getConstitution() == 0) {

                        stats.remove(position);
                    } else {

                        stats.set(position, Integer.toString(character.getConstitution()));
                    }

                    character.setConstitution(Integer.parseInt(constitution.getSelectedItem().toString()));
                    clearStats();
                    updateStats();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        intelligence.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(!intelligence.getSelectedItem().toString().equals("0") && !intelligence.getSelectedItem().toString().equals(Integer.toString(character.getIntelligence()))) {

                    for(int i = 0; i < stats.size(); i++) {

                        if(intelligence.getSelectedItem().toString().equals(stats.get(i))) {

                            position = i;
                            break;
                        }
                    }
                    if(character.getIntelligence() == 0) {

                        stats.remove(position);
                    } else {

                        stats.set(position, Integer.toString(character.getIntelligence()));
                    }

                    character.setIntelligence(Integer.parseInt(intelligence.getSelectedItem().toString()));
                    clearStats();
                    updateStats();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        wisdom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(!wisdom.getSelectedItem().toString().equals("0") && !wisdom.getSelectedItem().toString().equals(Integer.toString(character.getWisdom()))) {

                    for(int i = 0; i < stats.size(); i++) {

                        if(wisdom.getSelectedItem().toString().equals(stats.get(i))) {

                            position = i;
                            break;
                        }
                    }
                    if(character.getWisdom() == 0) {

                        stats.remove(position);
                    } else {

                        stats.set(position, Integer.toString(character.getWisdom()));
                    }

                    character.setWisdom(Integer.parseInt(wisdom.getSelectedItem().toString()));
                    clearStats();
                    updateStats();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        charisma.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(!charisma.getSelectedItem().toString().equals("0") && !charisma.getSelectedItem().toString().equals(Integer.toString(character.getCharisma()))) {

                    for(int i = 0; i < stats.size(); i++) {

                        if(charisma.getSelectedItem().toString().equals(stats.get(i))) {

                            position = i;
                            break;
                        }
                    }
                    if(character.getCharisma() == 0) {

                        stats.remove(position);
                    } else {

                        stats.set(position, Integer.toString(character.getCharisma()));
                    }

                    character.setCharisma(Integer.parseInt(charisma.getSelectedItem().toString()));
                    clearStats();
                    updateStats();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        reroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter <= 1) {
                    reroll.setEnabled(false);
                } else {
                    rollStats();
                }
            }
        });
    }

    public void rollStats() {

        stats = new ArrayList<String>();
        Random rand = new Random();

        character.setStrength(0);
        character.setDexterity(0);
        character.setConstitution(0);
        character.setIntelligence(0);
        character.setWisdom(0);
        character.setCharisma(0);

        for(int i = 1; i <= 6; i++) {

            int stat = 0;
            int[] rolls = new int[4];

            for(int j = 0; j < 4; j++) {

                rolls[j] = rand.nextInt(6) + 1;
            }

            for(int j = 0; j < 4; j++) {

                for(int k = 0; k < 4 - j - 1; k++ ) {

                    if(rolls[k] < rolls[j]) {

                        int temp = rolls[j];
                        rolls[k] = rolls[j];
                        rolls[j] = temp;
                    }
                }
            }

            for(int j = 0; j < 3; j++) {

                stat += rolls[j];
            }

            stats.add(Integer.toString(stat));
        }
        counter--;

        intList = new ArrayList<String>();
        wisList = new ArrayList<String>();
        strList = new ArrayList<String>();
        dexList = new ArrayList<String>();
        conList = new ArrayList<String>();
        chaList = new ArrayList<String>();

        updateStats();
    }

    public void clearStats() {

        strList.clear();
        dexList.clear();
        conList.clear();
        intList.clear();
        wisList.clear();
        chaList.clear();
    }

    public void updateStats() {

        strList.add(Integer.toString(character.getStrength()));
        dexList.add(Integer.toString(character.getDexterity()));
        conList.add(Integer.toString(character.getConstitution()));
        intList.add(Integer.toString(character.getIntelligence()));
        wisList.add(Integer.toString(character.getWisdom()));
        chaList.add(Integer.toString(character.getCharisma()));

        strList.addAll(stats);
        dexList.addAll(stats);
        conList.addAll(stats);
        intList.addAll(stats);
        wisList.addAll(stats);
        chaList.addAll(stats);

        strAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, strList);
        strAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        strength.setAdapter(strAdapter);
        strAdapter.notifyDataSetChanged();

        dexAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dexList);
        strAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dexterity.setAdapter(dexAdapter);
        dexAdapter.notifyDataSetChanged();

        conAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, conList);
        conAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        constitution.setAdapter(conAdapter);
        conAdapter.notifyDataSetChanged();

        intAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, intList);
        intAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        intelligence.setAdapter(intAdapter);
        intAdapter.notifyDataSetChanged();

        wisAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, wisList);
        wisAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        wisdom.setAdapter(wisAdapter);
        wisAdapter.notifyDataSetChanged();

        chaAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, chaList);
        chaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        charisma.setAdapter(chaAdapter);
        chaAdapter.notifyDataSetChanged();
    }
}
