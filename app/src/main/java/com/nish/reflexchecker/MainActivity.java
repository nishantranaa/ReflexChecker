package com.nish.reflexchecker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(this, "MAIN ACTIVITY", Toast.LENGTH_LONG);
        toast.show();


        Button start = findViewById(R.id.start); // the button id is used to create an object called start

        Intent intentGameActivity = new Intent(this, GameActivity.class);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentGameActivity);


            }


        });




    }


}
