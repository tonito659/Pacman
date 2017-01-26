package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.event.KeyEvent;

/**
 * Created by Antoine on 26/01/2017.
 */
public class Joueur1 {

    public static void jeu1Joueur() {
        Regles reglesDuJeu = new Regles();
        IG pacmanGraphique = new IG();

        Map pacmanMap = new Map();
        Pacman pacman1 = new Pacman(3, 14, 7);
        Fantome FantomeRouge = new Fantome("RED", 13, 18, "ready.png");
        Fantome FantomeRose = new Fantome("PINK", 14, 18, "pinkie.jpg");
        Fantome FantomeBleu = new Fantome("BLUE", 15, 18, "bleue.png");
        Fantome FantomeOrange = new Fantome("ORANGE", 16, 18, "yellowie.png");
        Fantome[] tablfantomes = {FantomeBleu, FantomeRouge, FantomeRose, FantomeOrange};
        int[][] temp = pacmanMap.getLabyrinthe();
        boolean again = false;
        int direction = 0, degre = 0;
        StdDraw.enableDoubleBuffering();
        while (true) {
            if (reglesDuJeu.endDuGame(pacman1) == 1) {
                again = pacmanGraphique.ecranDeFin(pacman1);
            }
            if (reglesDuJeu.endDuGame(pacman1) == 9000) {
                again = pacmanGraphique.ecranDeWin(pacman1);
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN) && temp[(pacman1.getPositionY() - 1)][pacman1.getPositionX()] != 0) {
                direction = 2;
                degre = 270;
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_UP) && temp[(pacman1.getPositionY() + 1)][pacman1.getPositionX()] != 0) {
                direction = 8;
                degre = 90;
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT) && temp[pacman1.getPositionY()][pacman1.getPositionX() - 1] != 0) {
                direction = 4;
                degre = 180;
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT) && temp[pacman1.getPositionY()][pacman1.getPositionX() + 1] != 0) {
                direction = 6;
                degre = 0;
            }
            StdDraw.clear(StdDraw.BLACK);
            pacmanGraphique.ecranDeJeu(pacmanMap.getLabyrinthe());


            // REGLES
            reglesDuJeu.checkInvicibilite(pacman1);
            reglesDuJeu.modifImageFantome(pacman1, tablfantomes);

            //déplacement du joueur et des fantomes, check des TP
            pacman1.mouvement(direction);
            pacman1.transfertBord();
            pacman1.mangeGraine(pacmanMap);

            //CHECK si pacman est mort
            reglesDuJeu.contact(pacman1, tablfantomes);


            //DEPLACEMENT FANTOMES
            for (Fantome f : tablfantomes) {
                f.deplacement();
                f.transfertBord();
            }

            //CHECK si pacman est mort
            reglesDuJeu.contact(pacman1, tablfantomes);

            pacmanGraphique.afficheVie(pacman1);
            pacmanGraphique.afficheScore(pacman1);


            //DESSINAGE DES ENTITES
            StdDraw.picture(pacman1.getPositionX(), pacman1.getPositionY(), "pacman2.jpg", 0.9, 0.9, degre);
            for (Fantome f : tablfantomes) {
                StdDraw.picture(f.getPositionX(), f.getPositionY(), f.getImage(), 0.9, 0.9, f.getDegre());
            }

            StdDraw.show();
            StdDraw.pause(100);
            if (again)break;

        }
    }
}

