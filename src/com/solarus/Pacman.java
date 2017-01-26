package com.solarus;

public class Pacman extends Entity{
    // Concerne les données sur le joueur
    private int nbVie ;
    private int score = 0;
    private String pseudo = "";
    private boolean isInvicible = false;
    private long invincibleBegin;
    private int compteur=0;


    public boolean isInvicible() {
        return isInvicible;
    }

    public void setInvicible(boolean invincible) {
        isInvicible = invincible;
    }

    public long getInvincibleBegin() {
        return invincibleBegin;
    }

    public Pacman(int nbVie, int score, String pseudo, int px, int py) {
        super(px, py);
        this.nbVie = nbVie;
        this.score = score;
        this.pseudo = pseudo;
    }

    public void subNbVie() {
        this.nbVie = this.nbVie -1;
    }

    public int getNbVie() {
        return nbVie;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int score) {
        this.score = this.score + score;
    }


    public int getScore() {
        return score;
    }

    public String getPseudo() {
        return pseudo;
    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

    public void mangeGraine(Map mapTestGraine){
        int [][] test = mapTestGraine.getLabyrinthe();
        if(test[this.getY()][this.getX()]==2){
            mapTestGraine.setValeurLabyrintheYX(this.getY(),this.getX(),1);
            this.setScore(this.getScore()+10);
            this.setCompteur(this.compteur+1);
        }
        if(test[this.getY()][this.getX()]==3){
            mapTestGraine.setValeurLabyrintheYX(this.getY(),this.getX(),1);
            this.setScore(this.getScore()+100);
            this.setCompteur(this.compteur+1);
            this.isInvicible = true;
            this.invincibleBegin = System.currentTimeMillis();
        }
        System.out.println("Score "+ this.getScore());
    }



}




