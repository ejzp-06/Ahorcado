package com.example.sanch.ahorcado;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class IngameActivity extends RepositorioActivity {
    boolean perdio = false;
    boolean gano = false;
    int posicion_palabra;
    boolean pack_fotos_dificiles = false;
    boolean pack_fotos_faciles = false;
    boolean pack_fotos_medio = false;
    int oportunidades = 15;
    TextView DisplayWord;
    Random random = new Random();
    int numeroAleatorio = random.nextInt(10);//Genera el numero random
    ImageView Hangman;
    Button button;
    Button button3;
    Button button4;
    Button button5;
    Button button7;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    Button button18;
    Button button19;
    Button button20;
    Button button21;
    Button button22;
    Button button23;
    Button button24;
    Button button25;
    Button button26;
    Button button28;
    Button button29;
    Button button30;
    String palabraoculta;
    String guion = "";
    String replace1;
    boolean verificar;
    char[] guiones;
    int tipodeDificultad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingame);
        button = (Button) findViewById(R.id.button);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button7 = (Button) findViewById(R.id.button7);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        button23 = (Button) findViewById(R.id.button23);
        button24 = (Button) findViewById(R.id.button24);
        button25 = (Button) findViewById(R.id.button25);
        button26 = (Button) findViewById(R.id.button26);
        button28 = (Button) findViewById(R.id.button28);
        button29 = (Button) findViewById(R.id.button29);
        button30 = (Button) findViewById(R.id.button30);

        button.setOnClickListener(myOnlyhandler);
        button3.setOnClickListener(myOnlyhandler);
        button4.setOnClickListener(myOnlyhandler);
        button5.setOnClickListener(myOnlyhandler);
        button7.setOnClickListener(myOnlyhandler);
        button9.setOnClickListener(myOnlyhandler);
        button10.setOnClickListener(myOnlyhandler);
        button11.setOnClickListener(myOnlyhandler);
        button12.setOnClickListener(myOnlyhandler);
        button13.setOnClickListener(myOnlyhandler);
        button14.setOnClickListener(myOnlyhandler);
        button15.setOnClickListener(myOnlyhandler);
        button16.setOnClickListener(myOnlyhandler);
        button17.setOnClickListener(myOnlyhandler);
        button18.setOnClickListener(myOnlyhandler);
        button19.setOnClickListener(myOnlyhandler);
        button20.setOnClickListener(myOnlyhandler);
        button21.setOnClickListener(myOnlyhandler);
        button22.setOnClickListener(myOnlyhandler);
        button23.setOnClickListener(myOnlyhandler);
        button24.setOnClickListener(myOnlyhandler);
        button25.setOnClickListener(myOnlyhandler);
        button26.setOnClickListener(myOnlyhandler);
        button28.setOnClickListener(myOnlyhandler);
        button29.setOnClickListener(myOnlyhandler);
        button30.setOnClickListener(myOnlyhandler);

        DisplayWord = (TextView) findViewById(R.id.DisplayWord);//El text View que muestra la palabra
        Hangman = (ImageView) findViewById(R.id.Hangman);
        Boolean tipoAnimales = getIntent().getExtras().getBoolean("TIPOAnimales");//Esta variable toma lo que el intent de PedirdatosActivity tomo
        Boolean tipoLugares = getIntent().getExtras().getBoolean("TIPOLugares");//Esta variable toma lo que el intent de PedirdatosActivity tomo
        Boolean tipoDiccionario = getIntent().getExtras().getBoolean("TIPODiccionario");//Esta variable toma lo que el intent de PedirdatosActivity tomo
        Boolean tipoFrutas = getIntent().getExtras().getBoolean("TIPOFrutas");//Esta variable toma lo que el intent de PedirdatosActivity tomo
        Boolean tipoPaises = getIntent().getExtras().getBoolean("TIPOPaises");//Esta variable toma lo que el intent de PedirdatosActivity tomo

        int dificultad = getIntent().getExtras().getInt("Dificultad");
        oportunidades = dificultad;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(getApplicationContext(), "numero: "+dificultad, duration);
        toast.show();

        if (tipoAnimales == true) {//Si esta condicion se cumple entonces toma la una palabra random del arreglo asignado y luego pone la palabra en el textView
            palabraoculta = Animales[numeroAleatorio];
            guiones = new char[palabraoculta.length()];
            ponerguion();
        } else if (tipoDiccionario == true) {//Si esta condicion se cumple entonces toma la una palabra random del arreglo asignado y luego pone la palabra en el textView
            palabraoculta = Diccionario[numeroAleatorio];
            guiones = new char[palabraoculta.length()];
            ponerguion();
        } else if (tipoFrutas == true) {//Si esta condicion se cumple entonces toma la una palabra random del arreglo asignado y luego pone la palabra en el textView
            palabraoculta = Frutas[numeroAleatorio];
            guiones = new char[palabraoculta.length()];
            ponerguion();
        } else if (tipoPaises == true) {//Si esta condicion se cumple entonces toma la una palabra random del arreglo asignado y luego pone la palabra en el textView
            palabraoculta = Paises[numeroAleatorio];
            guiones = new char[palabraoculta.length()];
            ponerguion();
        } else if (tipoLugares == true) {//Si esta condicion se cumple entonces toma la una palabra random del arreglo asignado y luego pone la palabra en el textView
            palabraoculta = Lugares[numeroAleatorio];
            guiones = new char[palabraoculta.length()];
            ponerguion();
        }


    }

    View.OnClickListener myOnlyhandler = new View.OnClickListener() {
        public void onClick(View v) {

//----------------SWITCH DE BOTONES--------------//
            switch (v.getId()) {

                case R.id.button3:


                    verificar = oculta(button3);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button3.setClickable(false);
                        button3.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button3.setClickable(false);
                        gethangman(oportunidades);
                        button3.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }


                    break;
                case R.id.button5:

                    verificar = oculta(button5);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button5.setClickable(false);
                        button5.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button5.setClickable(false);
                        gethangman(oportunidades);
                        button5.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button17:

                    verificar = oculta(button17);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button17.setClickable(false);
                        button17.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button17.setClickable(false);
                        gethangman(oportunidades);
                        button17.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button15:

                    verificar = oculta(button15);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button15.setClickable(false);
                        button15.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button15.setClickable(false);
                        gethangman(oportunidades);
                        button15.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button16:

                    verificar = oculta(button16);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button16.setClickable(false);
                        button16.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button16.setClickable(false);
                        gethangman(oportunidades);
                        button16.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button19:

                    verificar = oculta(button19);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button19.setClickable(false);
                        button19.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button19.setClickable(false);
                        gethangman(oportunidades);
                        button19.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button11:

                    verificar = oculta(button11);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button11.setClickable(false);
                        button11.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button11.setClickable(false);
                        gethangman(oportunidades);
                        button11.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button12:

                    verificar = oculta(button12);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button12.setClickable(false);
                        button12.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button12.setClickable(false);
                        gethangman(oportunidades);
                        button12.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button13:

                    verificar = oculta(button13);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button13.setClickable(false);
                        button13.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button13.setClickable(false);
                        gethangman(oportunidades);
                        button13.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button14:

                    verificar = oculta(button14);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button14.setClickable(false);
                        button14.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button14.setClickable(false);
                        gethangman(oportunidades);
                        button14.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button10:

                    verificar = oculta(button10);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button10.setClickable(false);
                        button10.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button10.setClickable(false);
                        gethangman(oportunidades);
                        button10.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button9:

                    verificar = oculta(button9);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button9.setClickable(false);
                        button9.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button9.setClickable(false);
                        gethangman(oportunidades);
                        button9.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button7:

                    verificar = oculta(button7);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button7.setClickable(false);
                        button7.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button7.setClickable(false);
                        gethangman(oportunidades);
                        button7.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button:

                    verificar = oculta(button);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button.setClickable(false);
                        button.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button.setClickable(false);
                        gethangman(oportunidades);
                        button.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button4:

                    verificar = oculta(button4);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button4.setClickable(false);
                        button4.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button4.setClickable(false);
                        gethangman(oportunidades);
                        button4.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button22:

                    verificar = oculta(button22);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button22.setClickable(false);
                        button22.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button22.setClickable(false);
                        gethangman(oportunidades);
                        button22.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button20:

                    verificar = oculta(button20);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button20.setClickable(false);
                        button20.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button20.setClickable(false);
                        gethangman(oportunidades);
                        button20.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button24:

                    verificar = oculta(button24);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button24.setClickable(false);
                        button24.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button24.setClickable(false);
                        gethangman(oportunidades);
                        button24.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button25:

                    verificar = oculta(button25);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button25.setClickable(false);
                        button25.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button25.setClickable(false);
                        gethangman(oportunidades);
                        button25.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button28:

                    verificar = oculta(button28);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button28.setClickable(false);
                        button28.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button28.setClickable(false);
                        gethangman(oportunidades);
                        button28.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button29:

                    verificar = oculta(button29);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button29.setClickable(false);
                        button29.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button29.setClickable(false);
                        gethangman(oportunidades);
                        button29.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button30:

                    verificar = oculta(button30);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button30.setClickable(false);
                        button30.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button30.setClickable(false);
                        gethangman(oportunidades);
                        button30.setBackgroundColor(Color.RED);
                        verificarGanador();
                       /* AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                        alertDialog.setTitle("Alert");
                        alertDialog.setMessage("Alert message to be shown");
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                        alertDialog.show();
                        */
                    }

                    break;
                case R.id.button21:

                    verificar = oculta(button21);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button21.setClickable(false);
                        button21.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button21.setClickable(false);
                        gethangman(oportunidades);
                        button21.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button23:

                    verificar = oculta(button23);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button23.setClickable(false);
                        button23.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button23.setClickable(false);
                        gethangman(oportunidades);
                        button23.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button18:

                    verificar = oculta(button18);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button18.setClickable(false);
                        button18.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button18.setClickable(false);
                        gethangman(oportunidades);
                        button18.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;
                case R.id.button26:

                    verificar = oculta(button26);

                    if (oportunidades > 0 && verificar == true) {
                        verificar = false;
                        button26.setClickable(false);
                        button26.setBackgroundColor(Color.GREEN);
                        verificarGanador();
                    } else {
                        oportunidades -= 1;
                        button26.setClickable(false);
                        gethangman(oportunidades);
                        button26.setBackgroundColor(Color.RED);
                        verificarGanador();
                    }

                    break;

            }


        }
    };


    public void setOportunidades(int tipodeDificultad) {
        if (tipodeDificultad == 15) {
            oportunidades = 15;
            pack_fotos_medio = true;
            pack_fotos_faciles = false;
            pack_fotos_dificiles = false;
        } else if (tipodeDificultad == 20) {
            oportunidades = 20;
            pack_fotos_faciles = true;
            pack_fotos_medio = false;
            pack_fotos_dificiles = false;
        } else {
            oportunidades = 10;
            pack_fotos_dificiles = true;
            pack_fotos_medio = false;
            pack_fotos_faciles = false;
        }
    }

    //---------------------FUNCIONES POR APARTE----------------------///

    public void gethangman(int oportunidades) {

        if (oportunidades == 15)
            Hangman.setImageResource(R.drawable.hangman6);
        oportunidades = 15;
        if (oportunidades == 0) ;

    }

    public void ponerguion() {
        for (int i = 0; i < palabraoculta.length(); i++) {
            guiones[i] = '_';
        }
        DisplayWord.setText(String.valueOf(guiones));
    }

    public Boolean oculta(Button button) {
        Boolean verificar = false;

        for (int i = 0; i < palabraoculta.length(); i++) {
            for (int j = 0; j < button.getText().length(); j++) {
                if (palabraoculta.charAt(i) == button.getText().charAt(j)) {
                    posicion_palabra = i;
                    char charc = button.getText().charAt(j);
                    guiones[posicion_palabra] = charc;
                    Toast toast = Toast.makeText(getApplicationContext(), "Le pegaste a un caracter!", Toast.LENGTH_SHORT);
                    toast.show();
                    DisplayWord.setText(String.valueOf(guiones));
                    verificar = true;
                }

            }
        }
        int vidas = oportunidades - 1;
        if (verificar == false) {
            Toast toast2 = Toast.makeText(getApplicationContext(), "Incorrecto. " + "Tienes " + (vidas) + " vidas", Toast.LENGTH_SHORT);
            toast2.show();
        }
        return verificar;
    }

    public void verificarGanador() {

        if (oportunidades == 0) {
            button.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button7.setClickable(false);
            button9.setClickable(false);
            button10.setClickable(false);
            button11.setClickable(false);
            button12.setClickable(false);
            button13.setClickable(false);
            button14.setClickable(false);
            button15.setClickable(false);
            button16.setClickable(false);
            button17.setClickable(false);
            button18.setClickable(false);
            button19.setClickable(false);
            button20.setClickable(false);
            button21.setClickable(false);
            button22.setClickable(false);
            button23.setClickable(false);
            button24.setClickable(false);
            button25.setClickable(false);
            button26.setClickable(false);
            button28.setClickable(false);
            button29.setClickable(false);
            button30.setClickable(false);
            perdio = true;
            Toast toast1 = Toast.makeText(getApplicationContext(), "Perdio", Toast.LENGTH_SHORT);
            toast1.show();
        }
        String v1 = String.valueOf(DisplayWord.getText());


        if (v1.equals(palabraoculta)) {
            button.setClickable(false);
            button3.setClickable(false);
            button4.setClickable(false);
            button5.setClickable(false);
            button7.setClickable(false);
            button9.setClickable(false);
            button10.setClickable(false);
            button11.setClickable(false);
            button12.setClickable(false);
            button13.setClickable(false);
            button14.setClickable(false);
            button15.setClickable(false);
            button16.setClickable(false);
            button17.setClickable(false);
            button18.setClickable(false);
            button19.setClickable(false);
            button20.setClickable(false);
            button21.setClickable(false);
            button22.setClickable(false);
            button23.setClickable(false);
            button24.setClickable(false);
            button25.setClickable(false);
            button26.setClickable(false);
            button28.setClickable(false);
            button29.setClickable(false);
            button30.setClickable(false);
            gano = true;
            Toast toast2 = Toast.makeText(getApplicationContext(), "Gano", Toast.LENGTH_SHORT);
            toast2.show();
        }

    }


}