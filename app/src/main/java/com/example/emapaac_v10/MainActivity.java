package com.example.emapaac_v10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, activity_inicio.class));
                finish();
            }
        }, 2000);
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.bt_link2:
                startActivity(new Intent(MainActivity.this, actiity_cobro.class));
                finish();
                Toast.makeText(MainActivity.this, "inventario", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_link:
                startActivity(new Intent(MainActivity.this, activity_mapa.class));
                finish();
                Toast.makeText(MainActivity.this, "facturacion", Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }
};


