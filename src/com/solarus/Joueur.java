package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.event.KeyEvent;


public class Joueur extends Entity{
    // Concerne les données sur le joueur

    private boolean hasMegaGraine =false;
    private int nbVie ;
    private int score = 0;
    private String pseudo = "";


    // Concerne les attributs du pacman

    private int pxJoueur , pyJoueur ;
    // oubliger de les metre en protected pour l'héritage

    public Joueur(int nbVie, int score, String pseudo, int px, int py) {
        super(px, py);
        this.nbVie = nbVie;
        this.score = score;
        this.pseudo = pseudo;
        this.pxJoueur = px;
        this.pyJoueur = py;
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

    public int getpxJoueur() {
        return pxJoueur;
    }

    public int getpyJoueur() {
        return pyJoueur;
    }

    public void setPx(int pxJoueur) {
        this.pxJoueur = pxJoueur;
    }

    public void setPy(int pyJoueur) {
        this.py = pyJoueur;
    }

    public void testGraine(Joueur joueur1 ,Map mapTestGraine ){
        int [][] test =mapTestGraine.getLabyrinthe();
        if(test[joueur1.getpyJoueur()][joueur1.getpxJoueur()]==2){
            System.out.println("Y joueur :"+joueur1.getpyJoueur()+" X joueur :"+joueur1.getpxJoueur());
            mapTestGraine.setValeurLabyrintheYX(joueur1.getpyJoueur(),joueur1.getpxJoueur(),1);
            System.out.println("au coordonne joueur1.getpyJoueur() et joueur1.getpxJoueur() il y a un :"+test[joueur1.getpyJoueur()][joueur1.getpxJoueur()]);

            joueur1.setScore(joueur1.getScore()+10);
            System.out.println("Score"+ joueur1.getScore());
        }
    }
}




