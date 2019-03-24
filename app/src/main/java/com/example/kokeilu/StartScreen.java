package com.example.kokeilu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartScreen extends AppCompatActivity {

    private Button ButtonToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        ButtonToMain = (Button) findViewById(R.id.ButtonToMain);
        ButtonToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();
            }
        });

        }

    public void openMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
