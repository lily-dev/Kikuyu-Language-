package com.example.kikuyu;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;





    public class GreetingsActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.word_list);

            ArrayList<Word> words = new ArrayList<Word>();  //update the arraylist to use word objects instead of string


            words.add(new Word("Tribe", "Rũrîrî"));
            words.add(new Word("Clan", "Mûhîrîga"));
            words.add(new Word("Family", "Nyûmba"));
            words.add(new Word("Father", "Baba"));
            words.add(new Word("Male Parent", "Ithe wa"));
            words.add(new Word("Husband", "Mûthuri wa"));
            words.add(new Word("Mother", "Mami/Maitû"));
            words.add(new Word("Your Mother", "Maitûgwo"));
            words.add(new Word("Female Parent", "Nyina wa"));
            words.add(new Word("Wife", "Mûtumia wa"));
            words.add(new Word("Daughter", "Mwarî"));
            words.add(new Word("Sister", "Mwarî wa Maitû"));
            words.add(new Word("Your Sister", "Mwarî wa Maitûgwo"));
            words.add(new Word("Brother", "Mûûrû wa Maitû"));
            words.add(new Word("Your Brother", "Mûûrû wa Maitûgwo"));
            words.add(new Word("Son", "Mûûrû"));
            words.add(new Word("Aunt", "Tata"));
            words.add(new Word("Uncle", "Mama"));
            words.add(new Word("Nephew/Niece", "Ciana cia mûûrû/ Mwari wa maitû"));
            words.add(new Word("Cousins", "Watata/wamama"));
            words.add(new Word("Grandpa", "Guka"));
            words.add(new Word("Grandma", "Cûcû"));
            words.add(new Word("Grandchildren", "Tûcû"));
            words.add(new Word("Great-grand children", "Gacûkûrû"));
            words.add(new Word("First Born", "Irigithathi"));
            words.add(new Word("Last Born", "Kihînga nda"));
            words.add(new Word("Inlaws", "Athoni"));
            words.add(new Word("Middle-aged Man+", "Mûthuri"));
            words.add(new Word("Middle-aged Woman+", "Mûtumia"));
            words.add(new Word("Male", "Mûndûrûme"));
            words.add(new Word("Female", "Mûndû wa nja"));
            words.add(new Word("Child", "Mwana"));
            words.add(new Word("Baby", "Kana"));
            words.add(new Word("Girl", "Kairetu"));
            words.add(new Word("Boy", "Kahîî"));
            words.add(new Word("Twins", "Mahatha"));
            words.add(new Word("Lady", "Mûiretu"));
            words.add(new Word("Gentleman", "Mwanake"));
            words.add(new Word("Girlfriend/Boyfriend", "Mwendwa"));
            words.add(new Word("Bride", "Mûhiki"));
            words.add(new Word("Groom", "Mûhikania"));




            words.add(new Word("Extended Family Living together", "Mucii"));


            WordAdapter itemsAdapter =
                    new WordAdapter(this, words);

            ListView listView = (ListView) findViewById(R.id.list);
            listView.setAdapter(itemsAdapter);
        }
    }


