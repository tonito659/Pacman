package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.event.KeyEvent;


/**
 * Created by Antoine on 17/01/2017.
 *
 * Boucle de déboguage
 * avec beaucoup de verbose, parce qu'on aime ça
 */
public class Debug {

    //Classe de debuging AVEC VERBOSE INSIDE
    //OMGNOMNOM

    public static void main(String[] args) {


        int direction = 0, degre = 0;
        Map mapJeu = new Map();
        Joueur joueur1 = new Joueur(2, 0, "Bogoss", 1, 1);
        Fantome FantomeRouge = new Fantome(StdDraw.RED, 14, 16);
        //instanciation
        System.out.println("Instanciation done");



        mapJeu.initialisationEcran();
        mapJeu.ecranDeJeu(mapJeu.getLabyrinthe());
        // Réalisation des init GUI
        StdDraw.picture(joueur1.getX(), joueur1.getY(), "pacman2.png", 0.9, 0.9, 180);
        //System.out.print("X =" + joueur1.getX() + " Y =" + joueur1.getX());
        StdDraw.enableDoubleBuffering();


        //j'applique a mapJeu les méthodes présents dans la classe map
        StdDraw.setPenColor(Color.yellow);
        int [][] reversemap = mapJeu.getLabyrintheReverse();
        while (true) {

            if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)) {
                direction = 2;
                degre = 270;
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_UP)) {
                direction = 8;
                degre = 90;
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
                direction = 4;
                degre = 180;
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
                direction = 6;
                degre = 0;
            }
            StdDraw.clear(StdDraw.BLACK);
            mapJeu.ecranDeJeu(mapJeu.getLabyrinthe());
            System.out.println("PC x= " + joueur1.getX() + " Y = " + joueur1.getY());
            joueur1.mouvement(direction);
            StdDraw.picture(joueur1.getX(), joueur1.getY(), "pacman2.png", 0.9, 0.9, degre);
            StdDraw.show();
            StdDraw.pause(1000);



            if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER)) {
                break;
            }
        }

    }


}
