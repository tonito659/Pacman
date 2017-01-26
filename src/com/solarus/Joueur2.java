package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Antoine on 23/01/2017.
 */
public class Joueur2 {

    public static void jeu() {
            //TODO : Créer une classe Ecran qui comporte les diférents écrans qui ne sont pas le plateau de jeu, ie les menus, pause et le reste
            //TODO : Finir le menu démarrage
            //TODO : Faire ecran de défaite
            Regles reglesDuJeu = new Regles();
            IG pacmanGraphique = new IG();
            Map pacmanMap = new Map();
            Joueur joueur1 = new Joueur(3, 0, "Bogoss", 14, 7);
            Joueur joueur2 = new Joueur(3, 0, "BelleFille", 15, 7);
            Joueur [] tabljoueurs = {joueur1, joueur2};

            Fantome FantomeRouge = new Fantome("RED", 13, 18, "ready.png");
            Fantome FantomeRose = new Fantome("PINK", 14, 18, "pinkie.jpg");
            Fantome FantomeBleu = new Fantome("BLUE", 15, 18,"bleue.png");
            Fantome FantomeOrange = new Fantome("ORANGE", 16, 18,"yellowie.png");
            Fantome [] tablfantomes = {FantomeBleu,FantomeRouge,FantomeRose,FantomeOrange};

            //instanciation


            StdDraw.clear(StdDraw.BLACK);
            pacmanGraphique.ecranDeJeu(pacmanMap.getLabyrinthe());
            StdDraw.show();

            //System.out.print("X =" + joueur1.getX() + " Y =" + joueur1.getX());
            StdDraw.enableDoubleBuffering();
            //j'applique a pacmanMap les méthodes présents dans la classe map
            StdDraw.setPenColor(Color.yellow);

            int direction = 0, degre = 0;
            int direction2 = 0, degre2 = 0;
            while (true) {
                if(reglesDuJeu.endDuGame(joueur1)==1){
                    break;
                }

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
                if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER)) {
                    break;
                }


                //////////////////////////////////////////////
                //INPUTS J2
                //////////////////////////////////////////////
                if (StdDraw.isKeyPressed(KeyEvent.VK_Z)) {
                    direction2 = 8;
                    degre2 = 90;
                }
                if (StdDraw.isKeyPressed(KeyEvent.VK_Q)) {
                    direction2 = 4;
                    degre2 = 180;
                }
                if (StdDraw.isKeyPressed(KeyEvent.VK_D)) {
                    direction2 = 6;
                    degre2 = 0;
                }
                if (StdDraw.isKeyPressed(KeyEvent.VK_S)) {
                    direction2 = 2;
                    degre2 = 270;
                }
                if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER)) {
                    break;
                }


                StdDraw.clear(StdDraw.BLACK);
                pacmanGraphique.ecranDeJeu(pacmanMap.getLabyrinthe());


                // REGLES

                for( Joueur j: tabljoueurs) {
                    reglesDuJeu.checkInvicibilite(j);
                    reglesDuJeu.modifImageFantome(j, tablfantomes);
                    //déplacement du joueur et des fantomes, check des TP
                }
                joueur1.mouvement(direction);
                joueur2.mouvement(direction2);
                for (Joueur j: tabljoueurs) {
                    j.transfertBord();
                    j.mangeGraine(pacmanMap);
                    //CHECK POUR VOIR SI TON PACMAN IL CREVE UN PEU COMME UNE SOUS MERDE
                    reglesDuJeu.contact(j, tablfantomes);
                }

                //DEPLACEMENT FANTOMES
                for (Fantome f : tablfantomes){
                    f.deplacement();
                    f.transfertBord();
                }


                for( Joueur j: tabljoueurs) {
                    //CHECK POUR VOIR SI TON PACMAN IL CREVE UN PEU COMME UNE SOUS MERDE
                    reglesDuJeu.contact(joueur1, tablfantomes);
                }

                pacmanGraphique.affiche2joueurs(tabljoueurs);


                //DESSINAGE DES ENTITES
                StdDraw.picture(joueur1.getX(), joueur1.getY(), "pacman2.jpg", 0.9, 0.9, degre);
                StdDraw.picture(joueur2.getX(), joueur2.getY(), "pacman2.jpg", 0.9, 0.9, degre2);

                for(Fantome f : tablfantomes ){
                    StdDraw.picture(f.getX(), f.getY(), f.getImage(), 0.9, 0.9, f.getDegre());
                }



                StdDraw.show();
                StdDraw.pause(100);
            }
            StdDraw.clear(StdDraw.BLACK);
            pacmanGraphique.ecranDeDemarrage();
        }

}
