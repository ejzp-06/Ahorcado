package com.example.sanch.ahorcado;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class PedirdatosActivity extends AppCompatActivity {
    int SPLASH_TIME_OUT = 1;

    Boolean animalestmp = false;
    Boolean lugarestmp = false;
    Boolean Diccionariotmp = false;
    Boolean Frutastmp = false;
    Boolean paisestmp = false;
    MediaPlayer mediaPlayer2;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedirdatos);

//--

//---------Sondio de botones--------------//
        mediaPlayer2 = MediaPlayer.create(PedirdatosActivity.this, R.raw.buttonclick);


        Button Continuarbtn = (Button) findViewById(R.id.Continuarbtn);
        final EditText nombreEDT = (EditText) findViewById(R.id.nombreEDT);
        RadioButton AnimalesRB = (RadioButton) findViewById(R.id.AnimalesRB);
        RadioButton LugaresRB = (RadioButton) findViewById(R.id.LugaresRB);
        final RadioButton DiccionarioRB = (RadioButton) findViewById(R.id.DiccionarioRB);
        RadioButton FrutasRB = (RadioButton) findViewById(R.id.FrutasRB);
        RadioButton PaisesRB = (RadioButton) findViewById(R.id.PaisesRB);
        RadioGroup RadioGroup1 = (RadioGroup) findViewById(R.id.RadioGroup1);


        int dificultad = getIntent().getExtras().getInt("Dificultad");
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getApplicationContext(), "numero: "+dificultad, duration);
        toast.show();

        RadioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {//Toma el Radiogroup y el id del radiobutton seleccionado
                switch (checkedId) {
                    case R.id.AnimalesRB:
                        mediaPlayer2.start();
                        animalestmp = true;
                        lugarestmp = false;
                        Diccionariotmp = false;
                        Frutastmp = false;
                        paisestmp = false;
                        break;
                    case R.id.LugaresRB:
                        mediaPlayer2.start();
                        animalestmp = false;
                        lugarestmp = true;
                        Diccionariotmp = false;
                        Frutastmp = false;
                        paisestmp = false;
                        break;
                    case R.id.DiccionarioRB:
                        mediaPlayer2.start();
                        Diccionariotmp = true;
                        Frutastmp = false;
                        paisestmp = false;
                        animalestmp = false;
                        lugarestmp = false;
                        break;
                    case R.id.FrutasRB:
                        mediaPlayer2.start();
                        Frutastmp = true;
                        paisestmp = false;
                        animalestmp = false;
                        lugarestmp = false;
                        Diccionariotmp = false;
                        break;
                    case R.id.PaisesRB:
                        mediaPlayer2.start();
                        paisestmp = true;
                        animalestmp = false;
                        lugarestmp = false;
                        Diccionariotmp = false;
                        Frutastmp = false;
                        break;

                }
            }
        });


        Continuarbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) { //Lo que pasa al clickear el Boton continuar



                if (nombreEDT.getText().length() > 0 && animalestmp == true) {// Si la variable temporal  de uno  de los casos del switch es true entocnes pasa esto:
                    mediaPlayer2.start();
                    intent = new Intent(getApplicationContext(), IngameActivity.class);
                    intent.putExtra("TIPOAnimales", animalestmp);
                    int dificultdad = getIntent().getExtras().getInt("Dificultad");
                    intent.putExtra("Dificultad",dificultdad);
                    startActivity(intent);

                } else if (nombreEDT.getText().length() > 0 && paisestmp == true) {// Si la variable temporal  de uno  de los casos del switch es true entocnes pasa esto:
                    mediaPlayer2.start();
                    intent = new Intent(getApplicationContext(), IngameActivity.class);
                    intent.putExtra("TIPOPaises", paisestmp);
                    int dificultdad = getIntent().getExtras().getInt("Dificultad");
                    intent.putExtra("Dificultad",dificultdad);
                    startActivity(intent);

                } else if (nombreEDT.getText().length() > 0 && Diccionariotmp == true) {// Si la variable temporal  de uno  de los casos del switch es true entocnes pasa esto:
                    mediaPlayer2.start();
                    intent = new Intent(getApplicationContext(), IngameActivity.class);
                    intent.putExtra("TIPODiccionario", Diccionariotmp);
                    int dificultdad = getIntent().getExtras().getInt("Dificultad");
                    intent.putExtra("Dificultad",dificultdad);
                    startActivity(intent);

                } else if (nombreEDT.getText().length() > 0 && Frutastmp == true) {// Si la variable temporal  de uno  de los casos del switch es true entocnes pasa esto:
                    mediaPlayer2.start();
                    intent = new Intent(getApplicationContext(), IngameActivity.class);
                    intent.putExtra("TIPOFrutas", Frutastmp);
                    int dificultdad = getIntent().getExtras().getInt("Dificultad");
                    intent.putExtra("Dificultad",dificultdad);
                    startActivity(intent);

                } else if (nombreEDT.getText().length() > 0 && lugarestmp == true) {// Si la variable temporal  de uno  de los casos del switch es true entocnes pasa esto:
                    mediaPlayer2.start();
                    intent = new Intent(getApplicationContext(), IngameActivity.class);
                    intent.putExtra("TIPOLugares", lugarestmp);
                    int dificultdad = getIntent().getExtras().getInt("Dificultad");
                    intent.putExtra("Dificultad",dificultdad);
                    startActivity(intent);

                } else {
                    mediaPlayer2.start();
                    Context context = getApplicationContext();
                    CharSequence text = "Debes escribir tu nombre de usuario y escoger una categoria para poder continuar";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }

        });


    }
}
