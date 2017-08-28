package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button now_playing = (Button) findViewById(R.id.now_playing);

        now_playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        Button store = (Button) findViewById(R.id.store);

        store.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View v) {
                Intent storeIntent = new Intent(MainActivity.this, Store.class);
                startActivity(storeIntent);
            }
        });

        Button playlists = (Button) findViewById(R.id.playlists);

        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View v) {
                Intent playlistsIntent = new Intent(MainActivity.this, Playlists.class);
                startActivity(playlistsIntent);
            }
        });

    }

}
