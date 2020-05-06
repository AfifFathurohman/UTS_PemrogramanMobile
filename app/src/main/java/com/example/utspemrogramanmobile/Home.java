package com.example.utspemrogramanmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {
    private ImageView jadwal, daftar, pembayaran, obat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        jadwal = (ImageView) findViewById(R.id.jadwal);
        daftar = (ImageView) findViewById(R.id.daftar);
        pembayaran = (ImageView) findViewById(R.id.pembayaran);
        obat = (ImageView) findViewById(R.id.obat);


        jadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, JadwalDokter.class);
                startActivity(intent);

            }
        });


        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Pendaftaran.class);
                startActivity(intent);

            }
        });

        pembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Pembayaran.class);
                startActivity(intent);

            }
        });

        obat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Obat.class);
                startActivity(intent);

            }
        });
    }
}
