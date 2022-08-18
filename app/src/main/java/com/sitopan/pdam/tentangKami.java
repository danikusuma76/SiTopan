package com.sitopan.pdam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class tentangKami extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_kami);
    }
    public void kantorLayanan(View view) {
        Intent kantorLayanan = new Intent(tentangKami.this,kantorLayanan.class);
        startActivity(kantorLayanan);
}
}
