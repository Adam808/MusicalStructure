package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Store extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        Button home = (Button) findViewById(R.id.storeToHome);

        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent mainActivityIntent = new Intent(Store.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });
    }
}
