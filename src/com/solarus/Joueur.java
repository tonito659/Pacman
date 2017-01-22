package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.event.KeyEvent;


public class Joueur extends Entity{
    // Concerne les données sur le joueur

    private boolean hasMegaGraine =false;
    private int nbVie ;
    private int score = 0;
    private String pseudo = "";
    private boolean isInvicible = false;

    // Concerne les attributs du pacman


    public boolean isInvicible() {
        return isInvicible;
    }

    public void setInvicible(boolean invicible) {
        isInvicible = invicible;
    }

    public Joueur(int nbVie, int score, String pseudo, int px, int py) {
        super(px, py);
        this.nbVie = nbVie;
        this.score = score;

        this.pseudo = pseudo;
    }

    public void setNbVie(int nbVie) {
        this.nbVie = nbVie;
    }

    public int getNbVie() {
        return nbVie;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void mangeGraine(Map mapTestGraine){
        int [][] test = mapTestGraine.getLabyrinthe();
        if(test[this.getY()][this.getX()]==2){
            mapTestGraine.setValeurLabyrintheYX(this.getY(),this.getX(),1);
            this.setScore(this.getScore()+10);
        }
        if(test[this.getY()][this.getX()]==3){
            mapTestGraine.setValeurLabyrintheYX(this.getY(),this.getX(),1);
            this.setScore(this.getScore()+100);
            this.isInvicible = true;
        }
        System.out.print("Score"+ this.getScore());
    }



}




