package com.solarus;

public class Fantome extends Entity{

    private String couleur;
    private int direction = 4; // 12 = Nord, 3 = Est, 6 = Sud, 9 = Ouest
    private int degre = 0;
    private String image;

    public Fantome(String couleur, int positionXFantome, int positionYFantome, String image) {
        super(positionXFantome, positionYFantome);
        this.couleur = couleur;
        this.image = image;
    }

    public int getDegre(){
        return degre;
    }

    public String getImage() {return image;}

    public void setImage(String image) {this.image = image;}

    public String getCouleur() {
        return couleur;
    }

    public void deplacement(){
        //
        boolean[] directionpossibles = this.directionpossibles();
        //System.out.println("Fantome X = "+ this.getPositionX()+ "\t Y = " + this.getPositionY());

        if (this.emplacementEstUneIntersection(directionpossibles)) { //randomisation de la direction à une intersect
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
        boolean [] tabDirections = {true, true, true, true};
        int [][] temp = pacmanMap.getLabyrinthe();
        if(temp[this.getPositionY() +1][this.getPositionX()]==0){ //nord
            tabDirections[0] = false;
        }
        if(temp[this.getPositionY()][this.getPositionX()+1]==0){ //est
            tabDirections[1] = false;
        }
        if(temp[this.getPositionY() -1][this.getPositionX()]==0){ //sud
            tabDirections[2] = false;
        }
        if(temp[this.getPositionY()][this.getPositionX()-1]==0){ //ouest
            tabDirections[3] = false;
        }
        return tabDirections;
    }

    private boolean emplacementEstUneIntersection(boolean [] tabDirections){
        // On teste si emplacement est une intersection
        // retourne un tableau de booléens type NESU
        boolean intersect = false;
        if((this.direction == 8 ||this.direction == 2) && (tabDirections[1] || tabDirections[3])){
            intersect = true;
        } else
        if((direction == 4 ||direction == 6) && (tabDirections[0] || tabDirections[2])){
            intersect = true;
        }
        return intersect;
    }
}
