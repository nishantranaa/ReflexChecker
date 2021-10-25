package com.nish.reflexchecker;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    private final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Toast toast = Toast.makeText(this, "GAME ACTIVITY", Toast.LENGTH_LONG);
        toast.show();
        //setup the task descriptions
        setupDescription(R.id.task1, R.array.task1_descriptions);
        setupDescription(R.id.task2, R.array.task2_descriptions);

        for (int i = 0; i<5; i++ ){
            addImage();
           //addCheckboxes();
        }

    }


    private void setupDescription(int taskID, int arrayID) {
        TextView task = findViewById(taskID);
        String[] descriptions = getResources().getStringArray(arrayID);
        int i = random.nextInt(descriptions.length);
        task.setText(descriptions[i]);


    }

    private static final int[] drawables = {
      R.drawable.baseline_android_black_48,
      R.drawable.baseline_developer_mode_black_48,
      R.drawable.baseline_laptop_chromebook_black_48
    };

    private void addImage(){
        ViewGroup gameRows = findViewById(R.id.game_rows);
        getLayoutInflater().inflate(R.layout.image_layout, gameRows);
        View lastChild = gameRows.getChildAt(gameRows.getChildCount()-1);
        ImageView image = lastChild.findViewById(R.id.image);
        int index = random.nextInt(drawables.length);
        image.setImageDrawable(getResources().getDrawableForDensity(drawables[index], 0));


    }
    private void addCheckboxes(int arrayID){
       ViewGroup checkBox_1 = findViewById(R.id.game_rows);
       getLayoutInflater().inflate(R.layout.checkboxes_layout, checkBox_1);
       View lastChild = checkBox_1.getChildAt(arrayID);



    }
}