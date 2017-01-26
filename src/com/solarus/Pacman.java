package com.solarus;

public class Pacman extends Entity{
    // Concerne les données sur le joueur
    private int nbVie ;
    private int score = 0;
    private boolean isInvicible = false;
    private long invincibleBegin;
    private int compteur=0;

    public Pacman(int nbVie, int score, int positionXPacman, int positionYPacman) {
        super(positionXPacman, positionYPacman);
        this.nbVie = nbVie;
        this.score = score;
    }

    public boolean getIsInvicible() {
        return isInvicible;
    }

    public long getInvincibleBegin() {
        return invincibleBegin;
    }

    public int getNbVie() {
        return nbVie;
    }

    public int getScore() {
        return score;
    }

    public int getCompteur() {
        return compteur;
    }

    public void setInvicible(boolean invincible) {
        isInvicible = invincible;
    }

    public void supprimeVie() {
        this.nbVie = this.nbVie -1;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

    public void addScore(int score) {
        this.score = this.score + score;
    }

    public void mangeGraine(Map mapTestGraine){
        int [][] test = mapTestGraine.getLabyrinthe();
        if(test[this.getPositionY()][this.getPositionX()]==2){
            mapTestGraine.setValeurLabyrintheYX(this.getPositionY(),this.getPositionX(),1);
            this.addScore(10);
            this.setCompteur(this.compteur+1);
        }
        if(test[this.getPositionY()][this.getPositionX()]==3){
            mapTestGraine.setValeurLabyrintheYX(this.getPositionY(),this.getPositionX(),1);
            this.addScore(100);
            this.setCompteur(this.compteur+1);
            this.isInvicible = true;
            this.invincibleBegin = System.currentTimeMillis();
        }
        System.out.println("Score "+ this.getScore());
    }

}




