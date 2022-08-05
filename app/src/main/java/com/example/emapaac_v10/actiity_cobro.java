package com.example.emapaac_v10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class actiity_cobro extends AppCompatActivity {
    private Button descrga;
    private String url4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobro);


        descrga = findViewById(R.id.descrga);
        String url4="https://play.google.com/store/apps/details?id=com.iroute.facilitomovilapp&hl=es";
        descrga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri =  Uri.parse(url4);
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        VideoView videoView = findViewById(R.id.video_view);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.p1;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }

}