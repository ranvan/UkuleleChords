package com.example.andriod.ukulelechords;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewMajor;
    ImageView imageViewMinor;

    Button buttonChordC;
    Button buttonChordD;
    Button buttonChordE;
    Button buttonChordF;
    Button buttonChordG;
    Button buttonChordA;
    Button buttonChordB;
    Button buttonChordDb;
    Button buttonChordEb;
    Button buttonChordGb;
    Button buttonChordAb;
    Button buttonChordBb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewMajor = (ImageView) findViewById(R.id.image_view_major);
        imageViewMinor = (ImageView) findViewById(R.id.image_view_minor);

        buttonChordC = (Button) findViewById(R.id.button_chord_c);
        buttonChordD = (Button) findViewById(R.id.button_chord_d);
        buttonChordE = (Button) findViewById(R.id.button_chord_e);
        buttonChordF = (Button) findViewById(R.id.button_chord_f);
        buttonChordG = (Button) findViewById(R.id.button_chord_g);
        buttonChordA = (Button) findViewById(R.id.button_chord_a);
        buttonChordB = (Button) findViewById(R.id.button_chord_b);
        buttonChordDb = (Button) findViewById(R.id.button_chord_db);
        buttonChordEb = (Button) findViewById(R.id.button_chord_eb);
        buttonChordGb = (Button) findViewById(R.id.button_chord_gb);
        buttonChordAb = (Button) findViewById(R.id.button_chord_ab);
        buttonChordBb = (Button) findViewById(R.id.button_chord_bb);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_chord_c:
                        imageViewMajor.setImageResource(R.drawable.chord_c);
                        imageViewMinor.setImageResource(R.drawable.chord_cm);
                        break;
                    case R.id.button_chord_d:
                        imageViewMajor.setImageResource(R.drawable.chord_d);
                        imageViewMinor.setImageResource(R.drawable.chord_dm);
                        break;
                    case R.id.button_chord_e:
                        imageViewMajor.setImageResource(R.drawable.chord_e);
                        imageViewMinor.setImageResource(R.drawable.chord_em);
                        break;
                    case R.id.button_chord_f:
                        imageViewMajor.setImageResource(R.drawable.chord_f);
                        imageViewMinor.setImageResource(R.drawable.chord_fm);
                        break;
                    case R.id.button_chord_g:
                        imageViewMajor.setImageResource(R.drawable.chord_g);
                        imageViewMinor.setImageResource(R.drawable.chord_gm);
                        break;
                    case R.id.button_chord_a:
                        imageViewMajor.setImageResource(R.drawable.chord_a);
                        imageViewMinor.setImageResource(R.drawable.chord_am);
                        break;
                    case R.id.button_chord_b:
                        imageViewMajor.setImageResource(R.drawable.chord_b);
                        imageViewMinor.setImageResource(R.drawable.chord_bm);
                        break;
                    case R.id.button_chord_db:
                        imageViewMajor.setImageResource(R.drawable.chord_db);
                        imageViewMinor.setImageResource(R.drawable.chord_dbm);
                        break;
                    case R.id.button_chord_eb:
                        imageViewMajor.setImageResource(R.drawable.chord_eb);
                        imageViewMinor.setImageResource(R.drawable.chord_ebm);
                        break;
                    case R.id.button_chord_gb:
                        imageViewMajor.setImageResource(R.drawable.chord_gb);
                        imageViewMinor.setImageResource(R.drawable.chord_gbm);
                        break;
                    case R.id.button_chord_ab:
                        imageViewMajor.setImageResource(R.drawable.chord_ab);
                        imageViewMinor.setImageResource(R.drawable.chord_abm);
                        break;
                    case R.id.button_chord_bb:
                        imageViewMajor.setImageResource(R.drawable.chord_bb);
                        imageViewMinor.setImageResource(R.drawable.chord_bbm);
                        break;
                }
            }
        };

        buttonChordC.setOnClickListener(onClickListener);
        buttonChordD.setOnClickListener(onClickListener);
        buttonChordE.setOnClickListener(onClickListener);
        buttonChordF.setOnClickListener(onClickListener);
        buttonChordG.setOnClickListener(onClickListener);
        buttonChordA.setOnClickListener(onClickListener);
        buttonChordB.setOnClickListener(onClickListener);
        buttonChordDb.setOnClickListener(onClickListener);
        buttonChordEb.setOnClickListener(onClickListener);
        buttonChordGb.setOnClickListener(onClickListener);
        buttonChordAb.setOnClickListener(onClickListener);
        buttonChordBb.setOnClickListener(onClickListener);

    }
}
