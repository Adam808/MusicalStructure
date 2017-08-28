package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Playlists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        Button home = (Button) findViewById(R.id.playlistsToHome);

        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent mainActivityIntent = new Intent(Playlists.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });
    }
}
