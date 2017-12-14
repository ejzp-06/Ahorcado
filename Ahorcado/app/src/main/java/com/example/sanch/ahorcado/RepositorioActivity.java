package com.example.sanch.ahorcado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class RepositorioActivity extends AppCompatActivity {

    Random NumeroAleatorio = new Random();

    String Animales []= new String []{"PERRO","CANGREJO","HORMIGA","BALLENA","RATA","GATO","PERICO","TUGFA","PINGUINO","LEON"};
    String Frutas []= new String[]{"CARAMBOLA","FRAMBUESA","GRANADA","MEMBRILLO","HIGO","ARANDANO","KIWI","FRESA","UVA","GRANADA"};
    String Diccionario[]= new String[]{"INEFABLE","EFIMERO","INCONMESURABLE","ETEREO","SEMPITERNO","PERENNE","MONDO","SOLEDAD","MELIFLUO","EFERVESCENCIA"};
    String Lugares []= new String[]{"CAPADOCIA","ALBARRACIN","GENGENBACH","MYKONOS","LIJIANG","OIA","GRUYERES","MORTSUND","FORNALUTX","CAPILEIRA"};
    String Paises []= new String[] {"FRANCIA","CHINA","ITALIA","TURQIA","ALEMANIA","RUSA","TAILANDIA","ESCOCIA","INGLATERRA","FINLANDIA"}   ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repositorio);
    }

    }
