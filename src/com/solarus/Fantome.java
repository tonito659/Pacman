package com.solarus;

import java.awt.*;

public class Fantome extends Entity{

    private boolean isInvicible = true;
    private Color couleur;
    private int px, py;
    private int offset;

    public Fantome(Color couleur, int abcisse, int ordonnee) {
        //init fantome, on peut les placer sur des endroits random dans la map
        this.couleur = couleur;
        this.px = abcisse;
        this.py = ordonnee;
    }


    public void deplacement(){
        //
        double seed = Math.random();

        if (true){ //placeholder

        }
    }

    public boolean isIntersection(){
        // On teste si l'emplacement actuel du fantome est une intersection
        boolean intersect= false;
        int [][] intersectMap = Map.getLabyrinthe()

        if (intersectMap[this.px+1][this.py] =! 0
                || intersectMap[this.px][this.py] =! 0
                || intersectMap[this.px][this.py] =! 0
                || intersectMap[this.px][this.py] =! 0 )
            {
            intersect = true;

        }
        return intersect;
    }
    public static void deplacementOrange(){

    }

    public static void deplacementRose(){

    }


}
