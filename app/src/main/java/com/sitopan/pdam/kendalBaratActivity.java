package com.sitopan.pdam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class kendalBaratActivity extends AppCompatActivity {

    TextView linkKB,linkPtb, linkPgd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kendal_barat);

        linkKB = findViewById(R.id.linkmapKB);
        linkPtb = findViewById(R.id.linkmapPtb);
        linkPgd = findViewById(R.id.linkmapPgd);

        linkKB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String wpurl = "https://goo.gl/maps/tmL7d7NR4Ea6URrx8";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });
        linkPtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String wpurl = "https://goo.gl/maps/9kvuz4DGhC6K91mM8";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });
        linkPgd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String wpurl = "https://goo.gl/maps/XyKddM5a9NNzCaHL6";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });
    }


}