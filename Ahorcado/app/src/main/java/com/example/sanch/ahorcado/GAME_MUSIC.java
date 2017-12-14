package com.example.sanch.ahorcado;

import java.util.Random;

/**
 * Created by sanch on 12/7/2017.
 */

final class GAME_MUSIC {
    private Random random = new Random();

    int setMenuMusic(){
        int numeroAleatorio = random.nextInt(9);
      if(numeroAleatorio ==1) {
          return R.raw.menumusic;
       }
        if(numeroAleatorio ==2) {
            return R.raw.menumusic2;
        }
        if(numeroAleatorio ==3) {
            return R.raw.menumusic3;
        }
        if(numeroAleatorio ==4) {
            return R.raw.menumusic4;
        }
        if(numeroAleatorio ==5) {
            return R.raw.menumusic5;
        }
        if(numeroAleatorio ==6) {
            return R.raw.menumusic6;
        }
        if(numeroAleatorio ==7) {
            return R.raw.menumusic7;
        }
        if(numeroAleatorio ==8) {
            return R.raw.menumusic8;
        }
        if(numeroAleatorio ==9) {
            return R.raw.menumusic9;
        }
    else
        return R.raw.menumusic;


    }


}
