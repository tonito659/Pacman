package com.solarus;

import java.awt.*;

public class Fantome extends Entity{


        //TODO : creer une methode qui va changer la photo du fantome entre celle normale et celle invincible

    private Color couleur;
    private int direction = 4; // 12 = Nord, 3 = Est, 6 = Sud, 9 = Ouest
    private int degre = 0;
    private String image;

    public int getDegre(){
        return degre;
    }

    public String getImage() {return image;}

    public void setImage(String image) {
        this.image = image;
    }

    public Fantome(Color couleur, int abcisse, int ordonnee, String image) {
        super(abcisse, ordonnee);
        //init fantome, on peut les placer sur des endroits random dans la map
        this.couleur = couleur;
        this.image = image;
    }

    public void deplacement(){
        //
        boolean[] directionpossibles = this.directionpossibles();
        System.out.println("Fantome X = "+ this.getX()+ "\t Y = " + this.getY());

        if (this.emplacementEstUneIntersection(directionpossibles)) { //randomisation de la direction à une intersect
            System.out.println(this.emplacementEstUneIntersection(directionpossibles));
            boolean mvt = false;
            while (!mvt) {
            //TODO : ajouter une condition de non-retour
                double random = Math.random() * 4;
                if (random < 1 && directionpossibles[0] && direction != 2) {
                    direction = 8;//NORD
                    degre = 0;
                    mvt = true;
                } else if (random >= 1 && random < 2 && directionpossibles[1]&& direction != 4) {
                    direction = 6;//EST
                    degre = 0;
                    mvt = true;
                } else if (random >= 2 && random < 3 && directionpossibles[2]&& direction != 8) {
                    direction = 2;//SUD
                    degre = 0;
                    mvt = true;
                } else if (random >= 3 && directionpossibles[3]&& direction != 6) {
                    direction = 4;//OUEST
                    degre = 0;
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
        if(temp[this.getY() +1][this.getX()]==0){ //nord
            directions[0] = false;
        }
        if(temp[this.getY()][this.getX()+1]==0){ //est
            directions[1] = false;
        }
        if(temp[this.getY() -1][this.getX()]==0){ //sud
            directions[2] = false;
        }
        if(temp[this.getY()][this.getX()-1]==0){ //ouest
            directions[3] = false;
        }
        // DEBUG
        // System.out.println(directions[0]+" "+directions[1]+" "+directions[2]+" "+directions[3]+" ");
        return directions;
    }

    private boolean emplacementEstUneIntersection(boolean [] tableau){
        // On teste si emplacement est une intersection
        // retourne un tableau de booléens type NESU
        boolean intersect = false;
        if((this.direction == 8 ||this.direction == 2) && (tableau[1] || tableau[3])){
            intersect = true;
        } else
        if((direction == 4 ||direction == 6) && (tableau[0] || tableau[2])){
            intersect = true;
        }
        return intersect;
    }

}
