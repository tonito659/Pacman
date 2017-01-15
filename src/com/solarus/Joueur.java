package com.solarus;

import com.sun.org.apache.xpath.internal.SourceTree;
import edu.princeton.cs.introcs.StdDraw;

import java.awt.event.KeyEvent;


public class Joueur extends Entity{

    // Concerne les données sur le joueur

    private boolean hasMegaGraine =false;
    private int nbVie = 1;
    private int score = 0;
    private String pseudo = "";


    // Concerne les attributs du pacman

    protected int PositionXJoueur=15, PositionYJoueur=7;
    // oubliger de les metre en protected pour l'héritage

    public Joueur(int nbVie, int score, String pseudo, int positionXJoueur, int positionYJoueur) {
        this.nbVie = nbVie;
        this.score = score;
        this.pseudo = pseudo;
        this.PositionXJoueur = positionXJoueur;
        this.PositionYJoueur = positionYJoueur;
    }

    public int getPositionXJoueur() {
        return PositionXJoueur;
    }

    public int getPositionYJoueur() {
        return PositionYJoueur;
    }

    public void setPositionXJoueur(int positionXJoueur) {
        PositionXJoueur = positionXJoueur;
    }

    public void setPositionYJoueur(int positionYJoueur) {
        PositionYJoueur = positionYJoueur;
    }

    public void moovePacman(){
        Map pacmanMap = new Map();
        Joueur joueur1 = new Joueur(2,0,"Bogoss",14,7);

        while(true){

            if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN) ) {
                StdDraw.clear(StdDraw.BLACK);
                pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
                joueur1.setPositionYJoueur(joueur1.getPositionYJoueur()-1);
                //test Bas
                StdDraw.picture(joueur1.getPositionXJoueur(),joueur1.getPositionYJoueur(), "pacman2.png",0.9,0.9,270);
                StdDraw.show(50);
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_UP)  ) {
                StdDraw.clear(StdDraw.BLACK);
                pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
                joueur1.setPositionYJoueur(joueur1.getPositionYJoueur()+1);
                //test Haut
                StdDraw.picture(joueur1.getPositionXJoueur(),joueur1.getPositionYJoueur(), "pacman2.png",0.9,0.9,90);
                StdDraw.show(50);
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT) ) {
                StdDraw.clear(StdDraw.BLACK);
                pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
                joueur1.setPositionXJoueur(joueur1.getPositionXJoueur()-1);
                //test Gauche
                StdDraw.picture(joueur1.getPositionXJoueur(),joueur1.getPositionYJoueur(), "pacman2.png",0.9,0.9,180);
                StdDraw.show(50);
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
                StdDraw.clear(StdDraw.BLACK);
                pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
                joueur1.setPositionXJoueur(joueur1.getPositionXJoueur()+1);
                // test Droite
                StdDraw.picture(joueur1.getPositionXJoueur(),joueur1.getPositionYJoueur(), "pacman2.png",0.9,0.9,0);
                StdDraw.show(50);
            }

            if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER)){
                break;
            }
        }
    }


}
