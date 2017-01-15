package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) {

        Map pacmanMap = new Map();
        Joueur joueur1 = new Joueur(2,0,"Bogoss",14,7);
        Fantome FantomeRouge = new Fantome(StdDraw.RED,14,16);
        Fantome FantomeRose =  new Fantome(StdDraw.PINK,15,16);
        Fantome FantomeBleu = new Fantome(StdDraw.BLUE,14,15);
        Fantome FantomeOrange = new Fantome(StdDraw.ORANGE,15,15);
        //instanciation

        pacmanMap.initalisationEcran();
        pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
        StdDraw.picture(joueur1.getPositionXJoueur(), joueur1.getPositionYJoueur(), "pacman2.png",0.9,0.9,180);
        System.out.print("X ="+joueur1.getPositionXJoueur()+" Y ="+joueur1.getPositionYJoueur());
        StdDraw.enableDoubleBuffering();
        //j'applique a pacmanMap les méthodes présents dans la classe map
        //StdDraw.filledCircle(0,0,3);
        StdDraw.setPenColor(Color.yellow);
        joueur1.moovePacman();

    }


}
