package com.example.fooodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UlamRecipe extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulam_recipe);

        Button button1 = findViewById(R.id.adobo);
        Button button2 = findViewById(R.id.sinigang);
        Button button3 = findViewById(R.id.giniling);
        Button button4 = findViewById(R.id.tinola);
        Button button5 = findViewById(R.id.paksiw);
        Button button12 = findViewById(R.id.next);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button12.setOnClickListener(this);

        {
            }
        }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.adobo:
                Intent intent1 = new Intent(UlamRecipe.this, ADOBO.class);
                startActivity(intent1);
                break;
            case R.id.sinigang:
                Intent intent2 = new Intent(UlamRecipe.this, SINIGANG.class);
                startActivity(intent2);
                break;
            case R.id.giniling:
                Intent intent3 = new Intent(UlamRecipe.this, GINILING.class);
                startActivity(intent3);
                break;
            case R.id.tinola:
                Intent intent4 = new Intent(UlamRecipe.this, TINOLA.class);
                startActivity(intent4);
                break;
            case R.id.paksiw:
                Intent intent5 = new Intent(UlamRecipe.this, PAKSIW.class);
                startActivity(intent5);
                break;
            case R.id.next:
                Intent intent6 = new Intent(UlamRecipe.this, UlamRecipe2.class);
                startActivity(intent6);
                break;

            default :
                break;

    }
        }
    }



