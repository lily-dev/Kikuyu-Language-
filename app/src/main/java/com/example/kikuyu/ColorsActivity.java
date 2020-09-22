package com.example.kikuyu;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> colors = new ArrayList<Word>();  //update the arraylist to use word objects instead of string

        //colors.add("red");
        colors.add(new Word("Red", "Mũtune", R.drawable.color_red));
        colors.add(new Word("Orange/Yellow", "Ngoikoni", R.drawable.color_mustard_yellow));
        colors.add(new Word("Green", "Nyeni", R.drawable.color_green));
        colors.add(new Word("Brown", "Gîîtîri", R.drawable.color_brown));
        colors.add(new Word("Black", "Mũirũ", R.drawable.color_black));
        colors.add(new Word("White", "Mwerũ", R.drawable.color_white));
        colors.add(new Word("Grey", "Kĩmũhũ", R.drawable.color_gray));
        //colors.add(new Word("Blue", "Mbirũirũ", R.drawable.color_blue));;
       // colors.add(new Word("Purple", "Gakarakũ", R.drawable.color_purple));

        WordAdapter itemsAdapter =
                new WordAdapter(this, colors);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}




        //using linearlayout datatype to use child views
        //finding layout called rootview and storing it in rootview layout
        //LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        /*creating textviews using constructor

        TextView colorsView = new TextView(this);
        colorsView.setText(colors.get(0));
        rootView.addView(colorsView);*/

       /* using a for looop to loop thru the list
       for (int index = 0; index < colors.size(); index++){
            //create a new TextView
            TextView colorsView = new TextView(this);
            //set text to be word at current index
            colorsView.setText(colors.get(index));
            //Add this TextView as another child to the root view of this layout
            rootView.addView(colorsView); }*/


       //for (int index = 0; index < 3; index++) {
        //Log.v("NumbersActivity", "Index:" + index + " Value:" + words.get(index));
        //}


        /*String[] colors = new String[10];
        colors[0] = "red";
        Log.v("ColorsActivity", "Word at index 0:" + colors[0]);
       */





