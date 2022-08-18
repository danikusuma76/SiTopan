package com.sitopan.pdam;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.viewpagerindicator.CirclePageIndicator;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    TextView rtx;
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;

    private String[] urls = new String[] {"https://pdam1.netlify.app/images/slider4.jpeg",
            "https://pdamslide.netlify.app/images/slider2.jpeg",
            "https://pdamslide.netlify.app/images/slider3.jpeg",


            "https://pdamslide.netlify.app/images/slider5.png"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        rtx = (TextView) findViewById(R.id.rtx);
        rtx.setSelected(true);
        String text = "Info kebocoroan Perumda Air Minum Tirto Panguripan KLIK DI SINI!!!";
        SpannableString ss = new SpannableString(text);
        ForegroundColorSpan fcsRed = new ForegroundColorSpan(Color.RED);
        ss.setSpan(fcsRed,51,66, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        rtx.setText(ss);

        
        rtx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String wpurl = "https://pdamkendal.com/berita/kategori/perbaikan-ganguan";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });


    }



    private void init(){
        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new SlidingImage_Adapter(MainActivity.this,urls));

        CirclePageIndicator indicator = (CirclePageIndicator)
                findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        indicator.setRadius(5 * density);

        NUM_PAGES = urls.length;

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);

        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });
    }
    public void tentangKami(View view) {
        Intent tentangKami = new Intent(MainActivity.this,tentangKami.class);
        startActivity(tentangKami);

    }
    public void kantorLayanan(View view) {
        Intent kantorLayanan = new Intent(MainActivity.this,kantorLayanan.class);
        startActivity(kantorLayanan);

    }
    public void pasangBaru(View view) {
        Intent pasangBaru = new Intent(MainActivity.this,pasangBaru.class);
        startActivity(pasangBaru);

    }
    public void TarifAir(View view) {
        Intent tarifAir = new Intent(MainActivity.this,tarifAir.class);
        startActivity(tarifAir);

    }


    public void cektagihan(View view) {

        Intent cekTagihan = new Intent(MainActivity.this,webView.class);
        startActivity(cekTagihan);

    }
    public void pengaduan(View view) {
        Intent pengaduan = new Intent(MainActivity.this,pengaduan.class);
        startActivity(pengaduan);

    }
    public void mitraBayar(View view) {
        Intent mitraBayar = new Intent(MainActivity.this,mitraBayar.class);
        startActivity(mitraBayar);

    }


}