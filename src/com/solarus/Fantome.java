package com.solarus;

import java.awt.*;

public class Fantome extends Entity{

    private boolean isInvicible = true;
    private Color couleur;
    private int px, py;
    private int direction = 3; // 12 = Nord, 3 = Est, 6 = Sud, 9 = Ouest
    double seed = Math.random()*4;

    public Fantome(Color couleur, int abcisse, int ordonnee) {
        //init fantome, on peut les placer sur des endroits random dans la map
        this.couleur = couleur;
        this.px = abcisse;
        this.py = ordonnee;
    }


    public void deplacementfantome(){
        //
        seed = Math.random()*4;

        if (posIsIntersection()){ //randomisation de la direction à une intersect
            if(seed<1){
                direction = 12;
            } else if (seed>=1 && seed <2){
                direction = 3;
            } else if (seed>=2 && seed <3){
                direction = 9;
            } else if (seed>=3){
                direction = 6;
            }
        }
    }

    public boolean posIsIntersection(){
        // On teste si l'emplacement actuel du fantome est une intersection
        boolean intersect= false;
        Map pacmanMap = new Map();
        int [][] intersectMap = pacmanMap.getLabyrinthe();

        if(seed == 3 ||seed == 9){

        }

        if (intersectMap[this.px+1][this.py] != 0
                || intersectMap[this.px-1][this.py] != 0
                || intersectMap[this.px][this.py+1] != 0
                || intersectMap[this.px][this.py-1] != 0 )
            {
            intersect = true;

        }
        return intersect;
    }



}
