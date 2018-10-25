package com.appstar.souvik_biswas.rubikscube;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MiddleLayerActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.middle_layer);

        Button continueButton = findViewById(R.id.continue_button_2);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent continueIntent = new Intent(MiddleLayerActivity.this,MiddleLayerCongoActivity.class);
                startActivity(continueIntent);
            }
        });
    }
}