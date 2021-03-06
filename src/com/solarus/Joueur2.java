package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Antoine on 23/01/2017.
 */
public class Joueur2 {

    public static void jeu2Joueur() {
        Regles reglesDuJeu = new Regles();
        IG pacmanGraphique = new IG();
        Map pacmanMap = new Map();
        Pacman pacman1 = new Pacman(3, 14, 7);
        Pacman pacman2 = new Pacman(3, 15, 7);
        Pacman[] tabljoueurs = {pacman1, pacman2};

            Fantome FantomeRouge = new Fantome("RED", 13, 18, "ready.png");
            Fantome FantomeRose = new Fantome("PINK", 14, 18, "pinkie.jpg");
            Fantome FantomeBleu = new Fantome("BLUE", 15, 18,"bleue.png");
            Fantome FantomeOrange = new Fantome("ORANGE", 16, 18,"yellowie.png");
            Fantome [] tablfantomes = {FantomeBleu,FantomeRouge,FantomeRose,FantomeOrange};
            int[][] temp = pacmanMap.getLabyrinthe();//instanciation

            //System.out.print("X =" + pacman1.getX() + " Y =" + pacman1.getX());
            StdDraw.enableDoubleBuffering();
            //j'applique a pacmanMap les méthodes présents dans la classe map
            StdDraw.setPenColor(Color.yellow);

            int direction = 0, degre = 0;
            int direction2 = 0, degre2 = 0;
        boolean again = false;
        while (true) {
                if(reglesDuJeu.endDuGame(pacman1,pacman2)==1){
                   again = pacmanGraphique.ecranDeFin2Joueur(pacman1,pacman2);
                }
                if(reglesDuJeu.endDuGame(pacman1,pacman2)==9000){
                   again = pacmanGraphique.ecranDeWin2Joueur(pacman1,pacman2);
                }


                //INPUTS J1
                //////////////////////////////////////////////

                if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)&& temp[(pacman1.getPositionY() - 1)][pacman1.getPositionX()] != 0 && temp[(pacman1.getPositionY() - 1)][pacman1.getPositionX()] != 4) {
                    direction = 2;
                    degre = 270;
                }
                if (StdDraw.isKeyPressed(KeyEvent.VK_UP)&& temp[(pacman1.getPositionY() + 1)][pacman1.getPositionX()] != 0 && temp[(pacman1.getPositionY() + 1)][pacman1.getPositionX()] != 4) {
                    direction = 8;
                    degre = 90;
                }
                if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)&& temp[(pacman1.getPositionY())][pacman1.getPositionX()-1] != 0 && temp[pacman1.getPositionY()][pacman1.getPositionX()-1] != 4) {
                    direction = 4;
                    degre = 180;
                }
                if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)&& temp[(pacman1.getPositionY())][pacman1.getPositionX()+1] != 0 && temp[pacman1.getPositionY()][pacman1.getPositionX()+1] != 4) {
                    direction = 6;
                    degre = 0;
                }


                //////////////////////////////////////////////
                //INPUTS J2
                //////////////////////////////////////////////
                if (StdDraw.isKeyPressed(KeyEvent.VK_Z)&& temp[(pacman2.getPositionY() + 1)][pacman2.getPositionX()] != 0 && temp[(pacman1.getPositionY() + 1)][pacman2.getPositionX()] != 4) {
                    direction2 = 8;
                    degre2 = 90;
                }
                if (StdDraw.isKeyPressed(KeyEvent.VK_Q)&& temp[(pacman2.getPositionY() )][pacman2.getPositionX()-1] != 0 && temp[pacman2.getPositionY()][pacman2.getPositionX()-1] != 4) {
                    direction2 = 4;
                    degre2 = 180;
                }
                if (StdDraw.isKeyPressed(KeyEvent.VK_D)&& temp[pacman2.getPositionY()][pacman2.getPositionX()+1] != 0 && temp[pacman2.getPositionY()][pacman2.getPositionX()+1] != 4) {
                    direction2 = 6;
                    degre2 = 0;
                }
                if (StdDraw.isKeyPressed(KeyEvent.VK_S)&& temp[(pacman2.getPositionY() - 1)][pacman2.getPositionX()] != 0 && temp[(pacman2.getPositionY() - 1)][pacman2.getPositionX()] != 4) {
                    direction2 = 2;
                    degre2 = 270;
                }



            StdDraw.clear(StdDraw.BLACK);
            pacmanGraphique.ecranDeJeu(pacmanMap.getLabyrinthe());


            // REGLES
            for (Pacman j : tabljoueurs) {
                reglesDuJeu.checkInvicibilite(j);

                //déplacement du joueur et des fantomes, check des TP
            }
            reglesDuJeu.modifImageFantome(pacman1, pacman2, tablfantomes);
            pacman1.mouvement(direction);
            pacman2.mouvement(direction2);
            for (Pacman j : tabljoueurs) {
                j.transfertBord();
                j.mangeGraine(pacmanMap);
                //CHECK POUR VOIR SI TON PACMAN IL CREVE UN PEU COMME UNE SOUS MERDE
                reglesDuJeu.contact(j, tablfantomes);
            }

            //DEPLACEMENT FANTOMES
            for (Fantome f : tablfantomes) {
                f.deplacement();
                f.transfertBord();
            }


            for (Pacman j : tabljoueurs) {
                //CHECK si le pacman est mort
                reglesDuJeu.contact(j, tablfantomes);
            }

            pacmanGraphique.affiche2joueurs(tabljoueurs);


            //DESSINAGE DES ENTITES
            StdDraw.picture(pacman1.getPositionX(), pacman1.getPositionY(), "pacman2.jpg", 0.9, 0.9, degre);
            StdDraw.picture(pacman2.getPositionX(), pacman2.getPositionY(), "pacman2.jpg", 0.9, 0.9, degre2);

            for (Fantome f : tablfantomes) {
                StdDraw.picture(f.getPositionX(), f.getPositionY(), f.getImage(), 0.9, 0.9, f.getDegre());
            }

            if(again)break;
            StdDraw.show();
            StdDraw.pause(100);
        }
        StdDraw.clear(StdDraw.BLACK);
        //pacmanGraphique.ecranDeDemarrage();
    }
}
