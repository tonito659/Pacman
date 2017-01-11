package com.solarus;
import edu.princeton.cs.introcs.StdDraw;
import java.awt.event.KeyEvent;

import java.awt.*;

public class Main {





    public static void main(String[] args) {
         double   depardY=7,depardX=15;

        Map pacmanMap = new Map();
        //création d'un objet de type map
        pacmanMap.initalisationEcran();
        pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
        //j'applique a pacmanMap les méthodes présents dans la classe map

        StdDraw.filledCircle(0,0,3);
        StdDraw.setPenColor(Color.yellow);
        StdDraw.filledCircle(depardX, depardY, 0.5);

        pacmanMap.testMur(pacmanMap.getLabyrinthe(),7,15);
       /* while(true){

            if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)) {
                StdDraw.filledCircle(depardX, depardY-=0.1, 0.5);
                StdDraw.clear(StdDraw.YELLOW);
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_UP)) {
                StdDraw.filledCircle(depardX, depardY+=0.1, 0.5);
                StdDraw.clear(StdDraw.YELLOW);
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
                StdDraw.filledCircle(depardX-=0.1, depardY, 0.5);
                StdDraw.clear(StdDraw.YELLOW);
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
                StdDraw.filledCircle(depardX+=0.1, depardY, 0.5);
                StdDraw.clear(StdDraw.YELLOW);
            }

            if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER)){
                break;
            }
            StdDraw.show(1);
        }*/


    }
}
