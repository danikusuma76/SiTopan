package com.sitopan.pdam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class pasangBaru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasang_baru);
    }
    public void pasang_baru(View view)
    {
        Intent pasang_baru = new Intent(pasangBaru.this,inputPasangBaru.class);
        startActivity(pasang_baru);
    }
    public void buka_segel(View view)
    {
        Intent buka_segel = new Intent(pasangBaru.this,buka_segel.class);
        startActivity(buka_segel);
    }
    public void penggantian(View view)
    {
        Intent penggantian = new Intent(pasangBaru.this,penggantian.class);
        startActivity(penggantian);
    }
    public void balik_nama(View view)
    {
        Intent balik_nama = new Intent(pasangBaru.this,balik_nama.class);
        startActivity(balik_nama);
    }
    public void tera_meter(View view)
    {
        Intent tera_meter = new Intent(pasangBaru.this,tera_meter.class);
        startActivity(tera_meter);
    }
    public void tta(View view)
    {
        Intent tta = new Intent(pasangBaru.this,tta.class);
        startActivity(tta);
    }
}