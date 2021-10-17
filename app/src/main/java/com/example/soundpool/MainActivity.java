package com.example.soundpool;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer beniOvmeBanaParaVer = MediaPlayer.create(this, R.raw.beni_ovme_kardesim_bana_para_ver);
        Button playBeniOvmeBanaParaVer = (Button) this.findViewById(R.id.paraVer);
        playBeniOvmeBanaParaVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beniOvmeBanaParaVer.start();
            }
        });

        final MediaPlayer paraKeserizPara = MediaPlayer.create(this, R.raw.para_keseriz_para);
        Button playParaKeserizPara = (Button) this.findViewById(R.id.paraKeserizPara);
        playParaKeserizPara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paraKeserizPara.start();
            }
        });

        final MediaPlayer efendisiDobbyeCorapVerdi = MediaPlayer.create(this, R.raw.efendisi_dobbye_corap_verdi);
        Button playEfendisiDobbyeCorapVerdi = (Button) this.findViewById(R.id.efendisiDobbyeCorapVerdi);
        playEfendisiDobbyeCorapVerdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                efendisiDobbyeCorapVerdi.start();
            }
        });

        final MediaPlayer efendisiDobbyeGiysilerVerdi = MediaPlayer.create(this, R.raw.efendisi_dobbye_giysiler_verdi);
        Button playEfendisiDobbyeGiysilerVerdi = (Button) this.findViewById(R.id.efendisiDobbyeGiysilerVerdi);
        playEfendisiDobbyeGiysilerVerdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                efendisiDobbyeGiysilerVerdi.start();
            }
        });

        final MediaPlayer dobbyArtikOzgur = MediaPlayer.create(this, R.raw.dobby_artik_ozgur);
        Button playDobbyArtikOzgur = (Button) this.findViewById(R.id.dobbyArtikOzgur);
        playDobbyArtikOzgur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dobbyArtikOzgur.start();
            }
        });
    }
}