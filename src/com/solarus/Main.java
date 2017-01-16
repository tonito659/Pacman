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



        pacmanMap.initalisationEcran();
        pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
        StdDraw.picture(joueur1.getPx(), joueur1.getPy(), "pacman2.png",0.9,0.9,180);
        System.out.print("X ="+joueur1.getPx()+" Y ="+joueur1.getPy());
        StdDraw.enableDoubleBuffering();
        //buffering sert a stocké la map en mémoire por pouvoir faire des changements sans aucun problème
        //j'applique a pacmanMap les méthodes présents dans la classe map
        StdDraw.setPenColor(Color.yellow);

        while(true){

            if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN) ) {
                StdDraw.clear(StdDraw.BLACK);
                pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
                joueur1.setPy(joueur1.getPy()-1);
                //test Bas
                StdDraw.picture(joueur1.getPx(),joueur1.getPy(), "pacman2.png",0.9,0.9,270);
                StdDraw.show(50);
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_UP)  ) {
                StdDraw.clear(StdDraw.BLACK);
                pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
                joueur1.setPy(joueur1.getPy()+1);
                //test Haut
                StdDraw.picture(joueur1.getPx(),joueur1.getPy(), "pacman2.png",0.9,0.9,90);
                StdDraw.show(50);
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT) ) {
                StdDraw.clear(StdDraw.BLACK);
                pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
                joueur1.setPx(joueur1.getPx()-1);
                //test Gauche
                StdDraw.picture(joueur1.getPx(),joueur1.getPy(), "pacman2.png",0.9,0.9,180);
                StdDraw.show(50);
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
                StdDraw.clear(StdDraw.BLACK);
                pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
                joueur1.setPx(joueur1.getPx()+1);
                // test Droite
                StdDraw.picture(joueur1.getPx(),joueur1.getPy(), "pacman2.png",0.9,0.9,0);
                StdDraw.show(50);
            }

            if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER)){
                break;
            }
        }

    }


}
