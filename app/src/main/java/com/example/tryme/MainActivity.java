package com.example.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View myView;
    private Button myButton;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing array to store colors
        colors = new int[]{Color.RED, Color.BLACK, Color.DKGRAY, Color.GRAY, Color.CYAN,
                Color.WHITE, Color.GREEN, Color.BLUE, Color.YELLOW, Color.CYAN, Color.MAGENTA,};
        final int length = colors.length;

        myView = findViewById(R.id.tryMeView);

        myView.setBackgroundColor(Color.DKGRAY);

        myButton = findViewById(R.id.tryMeButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Instantiating the Random class
                Random random = new Random();

                // Declaring variable to store each new choice based on the size of array
                int myValue = random.nextInt(length);

                // Changing the background
                myView.setBackgroundColor(colors[myValue]);

                // Just to see
                Log.d("Random", String.valueOf(myValue));
            }
        });

    }
}
