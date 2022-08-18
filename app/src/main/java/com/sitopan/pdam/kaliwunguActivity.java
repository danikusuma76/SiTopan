package com.sitopan.pdam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class kaliwunguActivity extends AppCompatActivity {

    TextView linkKlw1, linkKlw2, linkBoja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaliwungu);

        linkKlw1 = findViewById(R.id.linkmapKlw);
        linkKlw2 = findViewById(R.id.linkmapKlw2);
        linkBoja = findViewById(R.id.linkmapBoja);

        linkKlw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String wpurl = "https://goo.gl/maps/64eJmrEq9t5uoGEg9";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);

            }
        });
        linkKlw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpurl = "https://goo.gl/maps/pwMKf5tikNYs8rmu8";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);

            }
        });
        linkBoja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ;
                String wpurl = "https://goo.gl/maps/6JBEEeRiC8DLjdSLA";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);

            }
        });
    }

}