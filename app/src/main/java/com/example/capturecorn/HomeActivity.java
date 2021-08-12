package com.example.capturecorn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    public ImageButton btnSymptom, btnRemedy, btnPredict;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnSymptom = (ImageButton) findViewById(R.id.btnSymptom);
        btnSymptom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSymptom ();

            }
        });

        btnRemedy = findViewById(R.id.btnRemedy);
        btnRemedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRemedy ();
            }
        });

        btnPredict = findViewById(R.id.btnPredict);
        btnPredict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPredict ();
            }
        });
    }
    public void openSymptom (){
        Intent symtom_intent = new Intent(HomeActivity.this, SymptomActivity.class);
        startActivity(symtom_intent);
    }

    public void openRemedy (){
        Intent remedy_intent = new Intent(HomeActivity.this, RemedyActivity.class);
        startActivity(remedy_intent);
    }

    public void openPredict (){
        Intent predict_intent = new Intent(HomeActivity.this, PredictActivity.class);
        startActivity(predict_intent);
    }
}