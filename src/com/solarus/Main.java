package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

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
        //j'applique a pacmanMap les méthodes présents dans la classe map
        //StdDraw.filledCircle(0,0,3);
        StdDraw.setPenColor(Color.yellow);
        joueur1.movePacman();

    }


}
