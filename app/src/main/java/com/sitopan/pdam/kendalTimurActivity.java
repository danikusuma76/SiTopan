package com.sitopan.pdam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class kendalTimurActivity extends AppCompatActivity {

    TextView linkKT;
    TextView linkBrsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kendal_timur);

        linkKT = findViewById(R.id.linkmapKT);
        linkBrsg = findViewById(R.id.linkmapBrsg);

        linkKT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String wpurl = "https://goo.gl/maps/57DQjDmWa91tfWbu6";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }

        });
        linkBrsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String wpurl = "https://goo.gl/maps/EwJL4hZoqKR9nbVT9";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });
    }

}