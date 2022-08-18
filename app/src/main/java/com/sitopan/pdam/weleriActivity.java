package com.sitopan.pdam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class weleriActivity extends AppCompatActivity {

    TextView linkWlr, linkCprg, linkGmh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weleri);

        linkWlr = findViewById(R.id.linkmapWlr);
        linkCprg = findViewById(R.id.linkmapCpg);
        linkGmh = findViewById(R.id.linkmapGmh);

        linkWlr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String wpurl = "https://goo.gl/maps/ckRJeEVHULcpEFcU7";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });
        linkCprg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String wpurl = "https://goo.gl/maps/qtshN3NZAK7RT8dy5";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });
        linkGmh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpurl = "https://goo.gl/maps/8A1yMTBxdDqkA9mw8";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });

    }


}