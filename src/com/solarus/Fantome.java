package com.solarus;

import java.awt.*;

public class Fantome extends Entity{

    private boolean isInvicible = true;
    private Color couleur;
    private int pxFantome, pyFantome;
    private int direction = 4; // 12 = Nord, 3 = Est, 6 = Sud, 9 = Ouest
    private int degre = 0;

    public int getDegre(){
        return degre;
    }

    public Fantome(Color couleur, int abcisse, int ordonnee) {
        super(abcisse,ordonnee);
        //init fantome, on peut les placer sur des endroits random dans la map
        this.couleur = couleur;
        this.pxFantome = abcisse;
        this.pyFantome = ordonnee;
    }


    public void deplacement(){
        //
        boolean[] directions = this.directionpossibles();
        System.out.println("Fantome X = "+ this.px+ "\t Y = "+ this.py);

        if (this.emplacementEstUneIntersection(directions)) { //randomisation de la direction à une intersect
            boolean mvt = false;
            while (!mvt) {
                double random = Math.random() * 4;
                if (random < 1 && directions[0]) {
                    direction = 8;//NORD
                    degre = 90;
                    mvt = true;
                } else if (random >= 1 && random < 2 && directions[1]) {
                    direction = 6;//EST
                    degre = 0;
                    mvt = true;
                } else if (random >= 2 && random < 3 && directions[2]) {
                    direction = 2;//SUD
                    degre = 270;
                    mvt = true;
                } else if (random >= 3 && directions[3]) {
                    direction = 4;//OUEST
                    degre = 180;
                    mvt = true;
                }
            }
        }
        this.mouvement(direction);

    }

    private boolean[] directionpossibles() {
        //retourne dans un tableau NESU si des directions sont dispo
        Map pacmanMap = new Map();
        boolean [] directions = {true, true, true, true};
        int [][] temp = pacmanMap.getLabyrinthe();
        if(temp[this.pyFantome+1][this.pxFantome]==0){ //nord
            directions[0] = false;
        }
        if(temp[this.pyFantome][this.pxFantome+1]==0){ //est
            directions[1] = false;
        }
        if(temp[this.pyFantome-1][this.pxFantome]==0){ //sud
            directions[2] = false;
        }
        if(temp[this.pyFantome][this.pxFantome-1]==0){ //ouest
            directions[3] = false;
        }

        return directions;
    }

    private boolean emplacementEstUneIntersection(boolean [] tableau){
        // On teste si emplacement est une intersection
        // retourne un tableau de booléens type NESU
        boolean intersect = false;
        if((direction == 8 ||direction == 2) && (tableau[1] || tableau[3])){
            intersect = true;
        } else
        if((direction == 4 ||direction == 6) && (tableau[0] || tableau[2])){
            intersect = true;
        }
        return intersect;
    }



}
