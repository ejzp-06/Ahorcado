package com.example.sanch.ahorcado;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static boolean shouldPlay =false;
    Button jugarbtn;
    Button repositoriobtn;
    Button dificultadbtn;
    Button reportebtn;
    Button salirbtn;
    Typeface custom_font;
    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer2;
    GAME_MUSIC game_music=new GAME_MUSIC();
    int dificultad;
//----Musica----//
public void onStop() {
    super.onStop();
    if (!shouldPlay) { //si es true, no para y si es false, si para
        mediaPlayer.pause();
        mediaPlayer = null;
    }
}
    @Override
    public void onBackPressed() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shouldPlay = true;
        onBackPressed();


        try {

            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "numero: " + dificultad, duration);
            toast.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

//-----------Fullscreen(fallido)-----------//
/*requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
*///esto es para ponerlo en fullscreen pero me da error

//-----------FONT----------//
        custom_font = Typeface.createFromAsset(getAssets(), "fonts/LEVIBRUSH.TTF");

//-----MUSICA---------------------//
        mediaPlayer = MediaPlayer.create(MainActivity.this, game_music.setMenuMusic());
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
        onStop();

//---------Sondio de botones--------------//
        mediaPlayer2=MediaPlayer.create(MainActivity.this, R.raw.buttonclick);

//----Botones-------//


        jugarbtn = (Button) findViewById(R.id.jugarbtn);
        jugarbtn.setTypeface(custom_font);
        jugarbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mediaPlayer2.start();
                Intent init = new Intent(getApplicationContext(), PedirdatosActivity.class);
                dificultad = getIntent().getExtras().getInt("Dificultad");
                init.putExtra("Dificultad",dificultad);
                shouldPlay = true;
                startActivity(init);


            }

        });
        repositoriobtn = (Button) findViewById(R.id.repositoriobtn);

        repositoriobtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mediaPlayer2.start();
                Intent init = new Intent(getApplicationContext(), RepositorioActivity.class);
                shouldPlay = true;
                startActivity(init);


            }

        });

        dificultadbtn = (Button) findViewById(R.id.dificultadbtn);


        dificultadbtn.setTypeface(custom_font);
        dificultadbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mediaPlayer2.start();
                Intent init = new Intent(getApplicationContext(), Dificultad.class);
                shouldPlay = true;
                startActivity(init);


            }

        });

        reportebtn = (Button) findViewById(R.id.reportebtn);
        reportebtn.setTypeface(custom_font);
        reportebtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
    mediaPlayer2.start();
                Intent init = new Intent(getApplicationContext(), ReporteActivity.class);
                shouldPlay = true;
                startActivity(init);


            }

        });

        salirbtn = (Button) findViewById(R.id.salirbtn);
        salirbtn.setTypeface(custom_font);
        salirbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mediaPlayer2.start();
                finish();
                System.exit(0);


            }

        });


    }


}
