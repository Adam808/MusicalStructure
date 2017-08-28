package com.example.android.musicalstructure;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        Button home = (Button) findViewById(R.id.nowToHome);

        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent mainActivityIntent = new Intent(NowPlaying.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });
    }
}
