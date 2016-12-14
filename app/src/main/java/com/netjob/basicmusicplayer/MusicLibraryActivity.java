package com.netjob.basicmusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MusicLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView tracksListView = (ListView) findViewById(R.id.listview_tracks);

        String[] dummySongs = {"Cool Song", "Metal Stuff", "Back Porch Song", "Classical Gas"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
                                                    R.layout.textview_tracks_list_item,
                                                    R.id.textView_tracks_list_item,
                                                    dummySongs);

        tracksListView.setAdapter(arrayAdapter);
        tracksListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), NowPlayingActivity.class);
                startActivity(intent);
            }
        });
    }




}
