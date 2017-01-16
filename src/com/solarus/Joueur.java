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

    protected int px =15, py =7;
    // oubliger de les metre en protected pour l'héritage

    public Joueur(int nbVie, int score, String pseudo, int px, int py) {
        this.nbVie = nbVie;
        this.score = score;
        this.pseudo = pseudo;
        this.px = px;
        this.py = py;
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

    public void movePacman(){
        Map pacmanMap = new Map();
        Joueur joueur1 = new Joueur(2,0,"Bogoss",14,7);

        while(true){

            if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN) ) {
                StdDraw.clear(StdDraw.BLACK);
                pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
                joueur1.setPy(joueur1.getPy()-1);
                //test Bas
                StdDraw.picture(joueur1.getPx(),joueur1.getPy(), "pacman2.png",0.9,0.9,270);
                StdDraw.show(50);
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_UP)  ) {
                StdDraw.clear(StdDraw.BLACK);
                pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
                joueur1.setPy(joueur1.getPy()+1);
                //test Haut
                StdDraw.picture(joueur1.getPx(),joueur1.getPy(), "pacman2.png",0.9,0.9,90);
                StdDraw.show(50);
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT) ) {
                StdDraw.clear(StdDraw.BLACK);
                pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
                joueur1.setPx(joueur1.getPx()-1);
                //test Gauche
                StdDraw.picture(joueur1.getPx(),joueur1.getPy(), "pacman2.png",0.9,0.9,180);
                StdDraw.show(50);
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
                StdDraw.clear(StdDraw.BLACK);
                pacmanMap.generateurGraphique(pacmanMap.getLabyrinthe());
                joueur1.setPx(joueur1.getPx()+1);
                // test Droite
                StdDraw.picture(joueur1.getPx(),joueur1.getPy(), "pacman2.png",0.9,0.9,0);
                StdDraw.show(50);
            }

            if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER)){
                break;
            }
        }
    }


}
