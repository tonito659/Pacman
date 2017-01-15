package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) {

         double   depardY=7,depardX=15;

        Map pacmanMap = new Map();
        //création d'un objet de type map
        pacmanMap.initalisationEcran();
        pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
        //j'applique a pacmanMap les méthodes présents dans la classe map

        //StdDraw.filledCircle(0,0,3);
        StdDraw.setPenColor(Color.yellow);

        //pacmanMap.testMur(pacmanMap.getLabyrinthe(),7,15);
        while(true){

            if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)) {
                StdDraw.picture(depardX, depardY-=1, "pacman2.png",0.9,0.9,270);
                StdDraw.show(100);
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_UP)) {
                StdDraw.picture(depardX, depardY+=1, "pacman2.png",0.9,0.9,90);
                StdDraw.show(100);
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
                StdDraw.picture(depardX-=1, depardY, "pacman2.png",0.9,0.9,180);
                StdDraw.show(100);
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
                StdDraw.picture(depardX+=1, depardY, "pacman2.png",0.9,0.9,0);
                StdDraw.show(100);
            }

            if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER)){
                break;
            }
            StdDraw.show(1);
        }


    }
}
