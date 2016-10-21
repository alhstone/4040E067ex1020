package com.example.a4040e067.a4040e067ex1020;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

public class LINE01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line01);
        VideoView videoView = (VideoView) this.findViewById(R.id.videoView);
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);


        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.one));
        videoView.start();
    }

    public void back(View view){
        finish();
    }

}
