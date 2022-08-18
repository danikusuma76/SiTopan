package com.sitopan.pdam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class kantorLayanan extends AppCompatActivity {
    TextView linkPst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kantor_layanan);

        linkPst = findViewById(R.id.linkmapPst);

        linkPst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpurl = "https://goo.gl/maps/EVUYUMGZ7qaRDoSF6";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });
    }



    public void kendalBarat(View view) {
        Intent kendalBarat = new Intent(kantorLayanan.this, kendalBaratActivity.class);
        startActivity(kendalBarat);

    }
    public void kendalTimur(View view) {
        Intent kendalTimur = new Intent(kantorLayanan.this, kendalTimurActivity.class);
        startActivity(kendalTimur);

    }
    public void kaliwungu(View view) {
        Intent kaliwungu = new Intent(kantorLayanan.this, kaliwunguActivity.class);
        startActivity(kaliwungu);

    }
    public void weleri(View view) {
        Intent weleri = new Intent(kantorLayanan.this, weleriActivity.class);
        startActivity(weleri);

    }
    public void sukorejo(View view) {
        Intent sukorejo = new Intent(kantorLayanan.this, sukorejoActivity.class);
        startActivity(sukorejo);

    }

}