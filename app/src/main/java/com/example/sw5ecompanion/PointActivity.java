package com.example.sw5ecompanion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.sw5ecompanion.models.Character;

public class PointActivity extends AppCompatActivity {

    private int points;
    private Spinner strength;
    private Spinner dexterity;
    private Spinner constitution;
    private Spinner intelligence;
    private Spinner wisdom;
    private Spinner charisma;
    private TextView point;
    private Button gear;
    private Character character;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_stat);

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

        points = 27;

        strength = (Spinner) findViewById(R.id.strength);
        dexterity = (Spinner) findViewById(R.id.dexterity);
        constitution = (Spinner) findViewById(R.id.constitution);
        intelligence = (Spinner) findViewById(R.id.intelligence);
        wisdom = (Spinner) findViewById(R.id.wisdom);
        charisma = (Spinner) findViewById(R.id.charisma);
        point = (TextView) findViewById(R.id.point);
        gear = (Button) findViewById(R.id.gear);

        point.setText("Points Remaining: " + points);

        character.setStrength(8);
        character.setDexterity(8);
        character.setConstitution(8);
        character.setIntelligence(8);
        character.setWisdom(8);
        character.setCharisma(8);

        strength.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                updatePoints(character.getStrength(), Integer.parseInt(strength.getSelectedItem().toString()), "Strength");
                character.setStrength(Integer.parseInt(strength.getSelectedItem().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        dexterity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                updatePoints(character.getDexterity(), Integer.parseInt(dexterity.getSelectedItem().toString()), "Dexterity");
                character.setDexterity(Integer.parseInt(dexterity.getSelectedItem().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        constitution.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                updatePoints(character.getConstitution(), Integer.parseInt(constitution.getSelectedItem().toString()), "Constitution");
                character.setConstitution(Integer.parseInt(constitution.getSelectedItem().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        intelligence.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                updatePoints(character.getIntelligence(), Integer.parseInt(intelligence.getSelectedItem().toString()), "Intelligence");
                character.setIntelligence(Integer.parseInt(intelligence.getSelectedItem().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        wisdom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                updatePoints(character.getWisdom(), Integer.parseInt(wisdom.getSelectedItem().toString()), "Wisdom");
                character.setWisdom(Integer.parseInt(wisdom.getSelectedItem().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        charisma.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                updatePoints(character.getCharisma(), Integer.parseInt(charisma.getSelectedItem().toString()), "Charisma");
                character.setCharisma(Integer.parseInt(charisma.getSelectedItem().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void updatePoints(int before, int after, String stat) {


        if(before < after) {

            switch(before) {

                case 8 : {

                    switch(after) {

                        case 15 : {
                            points -= 2;
                        }
                        case 14 : {

                            points -= 2;
                        }
                        case 13 : {

                            points -= 1;
                        }
                        case 12 : {

                            points -= 1;
                        }
                        case 11 : {

                            points -=1;
                        }
                        case 10 : {

                            points -=1;
                        }
                        case 9 : {

                            points -=1;
                        }
                    }
                    break;
                }
                case 9 : {

                    switch(after) {

                        case 15 : {
                            points -= 2;
                        }
                        case 14 : {

                            points -= 2;
                        }
                        case 13 : {

                            points -= 1;
                        }
                        case 12 : {

                            points -= 1;
                        }
                        case 11 : {

                            points -=1;
                        }
                        case 10 : {

                            points -=1;
                        }
                    }
                    break;
                }
                case 10 : {

                    switch(after) {

                        case 15 : {
                            points -= 2;
                        }
                        case 14 : {

                            points -= 2;
                        }
                        case 13 : {

                            points -= 1;
                        }
                        case 12 : {

                            points -= 1;
                        }
                        case 11 : {

                            points -=1;
                        }
                    }
                    break;
                }
                case 11 : {

                    switch(after) {

                        case 15 : {
                            points -= 2;
                        }
                        case 14 : {

                            points -= 2;
                        }
                        case 13 : {

                            points -= 1;
                        }
                        case 12 : {

                            points -= 1;
                        }
                    }
                    break;
                }
                case 12 : {

                    switch(after) {

                        case 15 : {
                            points -= 2;
                        }
                        case 14 : {

                            points -= 2;
                        }
                        case 13 : {

                            points -= 1;
                        }
                    }
                    break;
                }
                case 13 : {

                    switch(after) {

                        case 15 : {
                            points -= 2;
                        }
                        case 14 : {

                            points -= 2;
                        }
                    }
                    break;
                }
                case 14 : {

                    points -= 2;
                    break;
                }
            }
        } else {

            switch(after) {

                case 8 : {

                    switch(before) {

                        case 15 : {
                            points += 2;
                        }
                        case 14 : {

                            points += 2;
                        }
                        case 13 : {

                            points += 1;
                        }
                        case 12 : {

                            points += 1;
                        }
                        case 11 : {

                            points +=1;
                        }
                        case 10 : {

                            points +=1;
                        }
                        case 9 : {

                            points +=1;
                        }
                    }
                    break;
                }
                case 9 : {

                    switch(before) {

                        case 15 : {
                            points += 2;
                        }
                        case 14 : {

                            points += 2;
                        }
                        case 13 : {

                            points += 1;
                        }
                        case 12 : {

                            points += 1;
                        }
                        case 11 : {

                            points +=1;
                        }
                        case 10 : {

                            points +=1;
                        }
                    }
                    break;
                }
                case 10 : {

                    switch(before) {

                        case 15 : {
                            points += 2;
                        }
                        case 14 : {

                            points += 2;
                        }
                        case 13 : {

                            points += 1;
                        }
                        case 12 : {

                            points += 1;
                        }
                        case 11 : {

                            points +=1;
                        }
                    }
                    break;
                }
                case 11 : {

                    switch(before) {

                        case 15 : {
                            points += 2;
                        }
                        case 14 : {

                            points += 2;
                        }
                        case 13 : {

                            points += 1;
                        }
                        case 12 : {

                            points += 1;
                        }
                    }
                    break;
                }
                case 12 : {

                    switch(before) {

                        case 15 : {
                            points += 2;
                        }
                        case 14 : {

                            points += 2;
                        }
                        case 13 : {

                            points += 1;
                        }
                    }
                    break;
                }
                case 13 : {

                    switch(before) {

                        case 15 : {
                            points += 2;
                        }
                        case 14 : {

                            points += 2;
                        }
                    }
                    break;
                }
                case 14 : {

                    points += 2;
                    break;
                }
            }
        }
        point.setText("Remaining Points: " + points);
        if(points < 0) {

            gear.setEnabled(false);
        } else {

            gear.setEnabled(true);
        }
    }
}
