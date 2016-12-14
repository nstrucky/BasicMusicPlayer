package com.netjob.basicmusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PodcastLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast_library);

        ListView podcastsListView = (ListView) findViewById(R.id.listview_podcasts);

        String[] dummyEpisodes = {"RadioLab - ep. 1",
                                  "Freakonomics - ep. 23",
                                  "NPR Politics ep. 275",
                                  "Nerp de Derp ep. 4"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
                R.layout.textview_tracks_list_item,
                R.id.textView_tracks_list_item,
                dummyEpisodes);

        podcastsListView.setAdapter(arrayAdapter);
        podcastsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), NowPlayingActivity.class);
                startActivity(intent);
            }
        });
    }

}
