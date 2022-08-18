package com.sitopan.pdam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class sukorejoActivity extends AppCompatActivity {
    TextView linkSkrj, linkPtn, linkPgy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukorejo);

        linkSkrj = findViewById(R.id.linkmapSkj);
        linkPgy = findViewById(R.id.linkmapPgy);

        linkSkrj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpurl = "https://www.google.com/maps/place/Jl.+Sujono+No.122,+RW.1,+Sumber,+Kebumen,+Kec.+Sukorejo,+Kabupaten+Kendal,+Jawa+Tengah+51363/@-7.0774879,110.0443475,233m/data=!3m1!1e3!4m5!3m4!1s0x2e706c01dd15037d:0x75c290860c3fd9a9!8m2!3d-7.0774341!4d110.044325?hl=id";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });

        linkPgy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String wpurl = "https://www.google.com/maps/place/Kantor+PDAM+Pagerruyung/@-7.043455,110.043047,1789m/data=!3m1!1e3!4m5!3m4!1s0x0:0xb27fb2f31a4fbf46!8m2!3d-7.0434643!4d110.0430211?hl=id";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });
    }


}