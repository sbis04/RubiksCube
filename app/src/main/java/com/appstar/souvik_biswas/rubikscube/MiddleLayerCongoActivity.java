package com.appstar.souvik_biswas.rubikscube;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MiddleLayerCongoActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.middle_layer_congo);

        Button continueButton = findViewById(R.id.continue_button_3);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent continueIntent = new Intent(MiddleLayerCongoActivity.this,YellowFaceOneActivity.class);
                startActivity(continueIntent);
            }
        });

        final Button retryButton = findViewById(R.id.retry_1);
        retryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent retryIntent = new Intent(MiddleLayerCongoActivity.this,MiddleLayerActivity.class);
                startActivity(retryIntent);
            }
        });
    }
}