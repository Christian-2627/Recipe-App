package com.example.fooodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PAKSIW extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paksiw);
        button = (Button) findViewById(R.id.paksiw1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { START();
            }
        });
    }

    public void START() {
        Intent intent = new Intent (this,UlamRecipe.class);
        startActivity(intent);


    }
}