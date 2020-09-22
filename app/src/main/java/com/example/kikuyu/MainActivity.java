package com.example.kikuyu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        TextView colors = (TextView) findViewById(R.id.colors);
       colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(colorsIntent);
            }
        });


        TextView greetings = (TextView) findViewById(R.id.greetings);
        greetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent greetingsIntent = new Intent(MainActivity.this, GreetingsActivity.class);
                startActivity(greetingsIntent);
            }
        });
        TextView days = (TextView) findViewById(R.id.days_of_the_week);
        days.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent daysIntent = new Intent(MainActivity.this, DaysoftheWeek.class);
                startActivity(daysIntent);
            }
        });

    }









     /* old code for the button click
     public void openNumbersList(View view){
         Intent i = new Intent(this, NumbersActivity.class);
         startActivity(i);

      */


}