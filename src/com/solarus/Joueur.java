package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.event.KeyEvent;


public class Joueur extends Entity{

    // Concerne les données sur le joueur

    private boolean hasMegaGraine =false;
    private int nbVie = 1;
    private int score = 0;
    private String pseudo = "";


    // Concerne les attributs du pacman

    private int px , py ;
    // oubliger de les metre en protected pour l'héritage

    public Joueur(int nbVie, int score, String pseudo, int px, int py) {
        super(px, py);
        this.nbVie = nbVie;
        this.score = score;
        this.pseudo = pseudo;
        this.px = px;
        this.py = py;
    }

    public int getNbVie() {
        return nbVie;
    }

    public int getScore() {
        return score;
    }

    public String getPseudo() {
        return pseudo;
    }

    public int getPx() {
        return px;
    }

    public int getPy() {
        return py;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public void setPy(int py) {
        this.py = py;
    }
}
