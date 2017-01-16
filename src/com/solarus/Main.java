package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) {
        //
        Map pacmanMap = new Map();
        Joueur joueur1 = new Joueur(2,0,"Bogoss",14,7);
        Fantome FantomeRouge = new Fantome(StdDraw.RED,14,16);
        Fantome FantomeRose =  new Fantome(StdDraw.PINK,15,16);
        Fantome FantomeBleu = new Fantome(StdDraw.BLUE,14,15);
        Fantome FantomeOrange = new Fantome(StdDraw.ORANGE,15,15);
        //instanciation



        pacmanMap.initialisationEcran();
        pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());


        StdDraw.picture(joueur1.getX(), joueur1.getY(), "pacman2.png",0.9,0.9,180);
        System.out.print("X ="+joueur1.getX()+" Y ="+joueur1.getX());
        StdDraw.enableDoubleBuffering();
        //j'applique a pacmanMap les méthodes présents dans la classe map
        StdDraw.setPenColor(Color.yellow);

        int direction = 6;
        while(true){

            if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN) ) {
                direction = 2;
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_UP)  ) {
                direction = 8;
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT) ) {
                direction = 4;
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
                direction = 6;
            }
            StdDraw.clear(StdDraw.BLACK);
            pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
            joueur1.mouvement(direction);
            StdDraw.picture(joueur1.getX(),joueur1.getY(), "pacman2.png",0.9,0.9,0);
            StdDraw.show(50);

            System.out.println();
            if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER)){
                break;
            }
        }

    }


}
