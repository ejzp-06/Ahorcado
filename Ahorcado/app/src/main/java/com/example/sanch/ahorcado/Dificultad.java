package com.example.sanch.ahorcado;

import android.content.Intent;
import android.hardware.SensorAdditionalInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Dificultad extends AppCompatActivity {

    public int dificultad=0;
    Button aceptar;
    RadioButton facil, media, dificil;
    RadioGroup rbtng;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dificultad);


        aceptar=(Button)findViewById(R.id.btnAceptar);

        rbtng=(RadioGroup) findViewById(R.id.rbtng);
        rbtng.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {//Toma el Radiogroup y el id del radiobutton seleccionado
                switch (checkedId) {
                    case R.id.rbtnFacil:
                        dificultad = 20;
                        break;
                    case R.id.rbtnMedia:
                        dificultad = 15;
                        break;
                    case R.id.rbtnDificl:
                        dificultad = 10;
                        break;
                }
            }
        });


        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent init = new Intent(getApplicationContext(), MainActivity.class);
                init.putExtra("Dificultad", dificultad);
                startActivity(init);
            }
        });


    }
}