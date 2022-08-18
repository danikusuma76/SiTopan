package com.sitopan.pdam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class tta extends AppCompatActivity {
    CardView cardView, cardView1,cardView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tta);

        cardView=findViewById(R.id.CallCenterKlik1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String wpurl = "https://wa.me/+628122578484?text=Halo,Pemesanan Truk Tangki Air PDAM Kendal?";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);

            }
        });
        cardView1=findViewById(R.id.CallCenterKlik2);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String wpurl = "https://wa.me/+6282133767611?text=Halo,Pemesanan Truk Tangki Air PDAM Kendal? ";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(wpurl));
                startActivity(intent);
            }
        });
        cardView2=findViewById(R.id.telpon);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telpon = new Intent(Intent.ACTION_DIAL);
                telpon.setData(Uri.parse("tel:02943689942"));
                startActivity(telpon);
            }
        });

    }
}