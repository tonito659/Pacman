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
        IG mapGraphique = new IG();
        Pacman pacman1 = new Pacman(2, 0, "Bogoss", 1, 1);
        Fantome FantomeRouge = new Fantome("RED", 14, 16, "ready.png");
        //instanciation
        System.out.println("Instanciation done");



        mapGraphique.initialisationEcran();
        mapGraphique.ecranDeJeu(mapJeu.getLabyrinthe());
        // Réalisation des init GUI
        StdDraw.picture(pacman1.getX(), pacman1.getY(), "pacman2.png", 0.9, 0.9, 180);
        //System.out.print("X =" + pacman1.getX() + " Y =" + pacman1.getX());
        StdDraw.enableDoubleBuffering();


        //j'applique a mapJeu les méthodes présents dans la classe map
        StdDraw.setPenColor(Color.yellow);
        int [][] reversemap = mapJeu.getLabyrinthe();
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
            mapGraphique.ecranDeJeu(mapJeu.getLabyrinthe());
            System.out.println("PC x= " + pacman1.getX() + " Y = " + pacman1.getY());
            pacman1.mouvement(direction);
            StdDraw.picture(pacman1.getX(), pacman1.getY(), "pacman2.png", 0.9, 0.9, degre);
            StdDraw.show();
            StdDraw.pause(1000);



            if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER)) {
                break;
            }
        }

    }


}
