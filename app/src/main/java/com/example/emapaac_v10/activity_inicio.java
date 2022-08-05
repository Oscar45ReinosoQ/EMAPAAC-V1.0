package com.example.emapaac_v10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class activity_inicio extends AppCompatActivity {
    private Button bt_link2,bt_link4,bt_link3,bt_link1;
    private String url;
    private String url2;
    private String url3;
    private String url4;
    private WebView WebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);




        bt_link1 = findViewById(R.id.bt_link1);
        String url="http://portal.emapaac.gob.ec:84/portalweb/emapaac-valores-pagar.php";
        bt_link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri =  Uri.parse(url);
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        bt_link2 = findViewById(R.id.bt_link2);
        String url2="https://emapaac.gob.ec/emapaac-denuncias.php";
        bt_link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri =  Uri.parse(url2);
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        bt_link3 = findViewById(R.id.bt_link3);
        String url3="https://www.google.com/maps/d/u/0/viewer?mid=1h1LDT7f5kEpmyfL1PD3bhTIGmXxZ162f&ll=0.04744004864851916%2C-78.14281144796985&z=14";
        bt_link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri =  Uri.parse(url3);
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        bt_link4 = findViewById(R.id.bt_link4);
        String url4="https://inhz1.facilito.com.ec:2192/Ubicanos/Index.aspx";
        bt_link4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri =  Uri.parse(url4);
                Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

    }
public void mapa(View view){
        Intent i = new Intent(this, activity_mapa.class);
        startActivity(i);

    }
    public void cobro(View view){
        Intent i = new Intent(this, actiity_cobro.class);
        startActivity(i);

    }


}

