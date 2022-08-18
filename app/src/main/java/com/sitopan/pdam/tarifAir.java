package com.sitopan.pdam;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class tarifAir extends AppCompatActivity {

    LinearLayout txtGa1,txtGa2,txtGa3,txtGa4;
    TextView tag1,tag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarif_air);
        txtGa1= findViewById(R.id.GA1);
        txtGa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String wpurl = "https://wa.me/+6282135543336?text=TAG NOSAMBUNG";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });

        txtGa2 =findViewById(R.id.GA2);
        txtGa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String wpurl = "https://wa.me/+6282135543338?text=TAG NOSAMBUNG";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });
        txtGa2 =findViewById(R.id.GA3);
        txtGa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String wpurl = "https://wa.me/+6282135543337?text=TAG NOSAMBUNG";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });
        txtGa2 =findViewById(R.id.GA4);
        txtGa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String wpurl = "https://wa.me/+6282135543339?text=TAG NOSAMBUNG";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });

        tag1 = (TextView) findViewById(R.id.tag);
        tag1.setSelected(true);
        String text = "TAG (spasi) NOSAMBUNG";
        SpannableString ss = new SpannableString(text);
        ForegroundColorSpan fcsWhite = new ForegroundColorSpan(Color.WHITE);
        ss.setSpan(fcsWhite,4,11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tag1.setText(ss);

        tag2 = (TextView) findViewById(R.id.tag2);
        tag2.setSelected(true);
        String text2 = "TAG (spasi) 123456789181";
        SpannableString ss2 = new SpannableString(text2);
        ForegroundColorSpan fcswhitek = new ForegroundColorSpan(Color.WHITE);
        ss2.setSpan(fcswhitek,4,11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tag2.setText(ss2);
    }
}