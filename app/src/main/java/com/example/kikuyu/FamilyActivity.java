package com.example.kikuyu;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();  //update the arraylist to use word objects instead of string


        words.add(new Word("Father", "Baba", R.drawable.family_father));
        words.add(new Word("Male Parent", "Ithe wa", R.drawable.family_father));
        words.add(new Word("Husband", "Mûthuri wa", R.drawable.family_father));
        words.add(new Word("Mother", "Mami/Maitû", R.drawable.family_mother));
        words.add(new Word("Your Mother", "Maitûgwo", R.drawable.family_mother));
        words.add(new Word("Female Parent", "Nyina wa", R.drawable.family_mother));
        words.add(new Word("Wife", "Mûtumia wa", R.drawable.family_mother));
        words.add(new Word("Daughter", "Mwarî", R.drawable.family_daughter));
        words.add(new Word("Sister", "Mwarî wa Maitû", R.drawable.family_daughter));
        words.add(new Word("Your Sister", "Mwarî wa Maitûgwo", R.drawable.family_daughter));
        words.add(new Word("Brother", "Mûûrû wa Maitû", R.drawable.family_son));
        words.add(new Word("Your Brother", "Mûûrû wa Maitûgwo", R.drawable.family_son));
        words.add(new Word("Son", "Mûûrû", R.drawable.family_son));
        words.add(new Word("Aunt", "Tata", R.drawable.family_mother));
        words.add(new Word("Uncle", "Mama", R.drawable.family_father));
       // words.add(new Word("Nephew/Niece", "Ciana cia mûûrû/ Mwari wa maitû"));
       // words.add(new Word("Cousins", "Watata/wamama"));
        words.add(new Word("Grandpa", "Guka", R.drawable.family_grandfather));
        words.add(new Word("Grandma", "Cûcû", R.drawable.family_grandmother));
       // words.add(new Word("Grandchildren", "Tûcû"));
       // words.add(new Word("Great-grand children", "Gacûkûrû"));
        words.add(new Word("First Born", "Irigithathi", R.drawable.family_older_brother));
        words.add(new Word("Last Born", "Kihînga nda", R.drawable.family_younger_brother));
        words.add(new Word("Male", "Mûndûrûme", R.drawable.family_older_brother));
        words.add(new Word("Female", "Mûndû wa nja", R.drawable.family_older_sister));
        words.add(new Word("Baby", "Kana", R.drawable.family_younger_sister));
       /* words.add(new Word("Girl", "Kairetu"));
        words.add(new Word("Boy", "Kahîî"));
        words.add(new Word("Twins", "Mahatha"));
        words.add(new Word("Lady", "Mûiretu"));
        words.add(new Word("Gentleman", "Mwanake"));
        words.add(new Word("Girlfriend/Boyfriend", "Mwendwa"));
        words.add(new Word("Bride", "Mûhiki"));
        words.add(new Word("Groom", "Mûhikania"));
        words.add(new Word("Extended Family Living together", "Mucii"));
        words.add(new Word("Inlaws", "Athoni"));
        words.add(new Word("Middle-aged Man+", "Mûthuri"));
        words.add(new Word("Middle-aged Woman+", "Mûtumia"));
        words.add(new Word("Tribe", "Rũrîrî"));
        words.add(new Word("Clan", "Mûhîrîga"));
        words.add(new Word("Family", "Nyûmba")); */

        WordAdapter itemsAdapter =
                new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
