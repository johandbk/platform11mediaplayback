package com.example.okejon.platform11media;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    ListView listView;

    //araylist menyimpan list vid
    ArrayList<String> listVideo;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listView);

        listVideo = new ArrayList<>();
        listVideo.add("Lagu nangesssss");
        listVideo.add("Seberapa Pantas");

        //adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listVideo);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, VideoLucu.lucu);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*switch (position){
                    case 0:
                        videoView.setVideoURI(Uri.parse("android.resource://" +getPackageName()+ "/" + R.raw.sample1));
                        break;

                    case 1:
                        videoView.setVideoURI(Uri.parse("android.resource://" +getPackageName()+"/"+R.raw.sample2));
                        break;
                }
                //controller playback
                videoView.setMediaController(new MediaController(MainActivity.this));

                videoView.requestFocus();
                videoView.start();
           */
                VideoLucu videoLucu = VideoLucu.lucu[(int) id];
                Uri videoUri = getMedia(videoLucu.getVideoRawId());
                makePlayer(videoUri);
            }
        });
    }

    private Uri getMedia(String nama){
        return Uri.parse("android.resource://"+getPackageName()+"/raw/"+nama);
    }

    private void makePlayer(Uri videoUri){
        //set resource vid
        videoView.setVideoURI(videoUri);

        //menambah controller playback
        videoView.setMediaController(new MediaController(MainActivity.this));

        videoView.requestFocus();
        videoView.start();
    }
}
