
package com.example.kikuyu;

        import android.os.Bundle;
        import android.widget.ListView;

        import androidx.appcompat.app.AppCompatActivity;

        import java.util.ArrayList;

public class DaysoftheWeek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();  //update the arraylist to use word objects instead of string

        //colors.add("red");
        words.add(new Word("Monday", "Jumatatû"));
        words.add(new Word("Tuesday", "Wakerî"));
        words.add(new Word("Wednesday", "Wetatû"));
        words.add(new Word("Thursday", "Kana/Aramithi"));
        words.add(new Word("Friday", "Gatano"));
        words.add(new Word("Saturday", "Juma"));
        words.add(new Word("Sunday/Week", "Kiumia"));
        words.add(new Word("Minute", "Ndagîka"));
        words.add(new Word("Hour", "Ithaa"));
        words.add(new Word("One hour", "Ithaa rîmwe"));
        words.add(new Word("Two Hours", "Mathaa meerî"));
        words.add(new Word("Three Hours", "Mathaa matatû"));;
        words.add(new Word("Noon", "Thaa thita cia mûthenya"));
        words.add(new Word("Midnight", "ûtukû gatagatî"));
        words.add(new Word("Now", "Thaa ici/ororîu"));
        words.add(new Word("Later", "thaa îngi"));
        words.add(new Word("Sunrise", "Rîu rîkîratha"));
        words.add(new Word("Sunset", "Rîu rîgîthûa"));
        words.add(new Word("Day", "Mûthenya"));
        words.add(new Word("Days of the week", "Mîthenya ya Kiumia"));



        WordAdapter itemsAdapter =
                new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }
}
