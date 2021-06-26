package com.example.fooodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UlamRecipe2 extends AppCompatActivity implements View.OnClickListener {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulam_recipe2);

        Button button6 = findViewById(R.id.sisig);
        Button button7 = findViewById(R.id.kaldereta);
        Button button8 = findViewById(R.id.bexpress);
        Button button9 = findViewById(R.id.pinakbet);
        Button button10 = findViewById(R.id.dinugoan);
        Button button11 = findViewById(R.id.prev);


        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);


        {


        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sisig:
                Intent intent1 = new Intent(UlamRecipe2.this, SISIG.class);
                startActivity(intent1);
                break;
            case R.id.kaldereta:
                Intent intent2 = new Intent(UlamRecipe2.this, KALDERETA.class);
                startActivity(intent2);
                break;
            case R.id.bexpress:
                Intent intent3 = new Intent(UlamRecipe2.this, BEXPRESS.class);
                startActivity(intent3);
                break;

            case R.id.pinakbet:
                Intent intent4 = new Intent(UlamRecipe2.this, PINAKBET.class);
                startActivity(intent4);
                break;
            case R.id.dinugoan:
                Intent intent5 = new Intent(UlamRecipe2.this, DINUGOAN.class);
                startActivity(intent5);
                break;

            case R.id.prev:
                Intent intent6 = new Intent(UlamRecipe2.this, UlamRecipe.class);
                startActivity(intent6);
                break;

            default:
                break;

        }
    }
}

