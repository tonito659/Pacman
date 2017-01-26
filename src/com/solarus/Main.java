package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) {
        //TODO : Créer une classe Ecran qui comporte les diférents écrans qui ne sont pas le plateau de jeu, ie les menus, pause et le reste
        //TODO : Finir le menu démarrage
        //TODO : Faire ecran de défaite
        while(true){
            Regles reglesDuJeu = new Regles();
            Sound musicPacman = new Sound();
            IG pacmanGraphique = new IG();
            Map pacmanMap = new Map();
            Joueur joueur1 = new Joueur(3, 0, "Bogoss", 14, 7);
            Fantome FantomeRouge = new Fantome("RED", 13, 18, "ready.png");
            Fantome FantomeRose = new Fantome("PINK", 14, 18, "pinkie.jpg");
            Fantome FantomeBleu = new Fantome("BLUE", 15, 18,"bleue.png");
            Fantome FantomeOrange = new Fantome("ORANGE", 16, 18,"yellowie.png");
            Fantome [] tablfantomes = {FantomeBleu,FantomeRouge,FantomeRose,FantomeOrange};
            int [] [] temp = pacmanMap.getLabyrinthe();
            //instanciation , déclaration


            pacmanGraphique.initialisationEcran();
            //pacmanGraphique.ecranDeFin();
            //musicPacman.playSound("pacman_beginning.wav");
            pacmanGraphique.ecranDeDemarrage();
            //pacmanGraphique.ecranDeJeu(pacmanMap.getLabyrinthe());

            //System.out.print("X =" + joueur1.getX() + " Y =" + joueur1.getX());

            StdDraw.enableDoubleBuffering();
            StdDraw.setPenColor(Color.yellow);

            int direction = 0, degre = 0;
            while (true) {
                if(reglesDuJeu.endDuGame(joueur1)==1){
                    pacmanGraphique.ecranDeFin();
                    break;
                }
                if(reglesDuJeu.endDuGame(joueur1)==9000){
                    pacmanGraphique.ecranDeWin();
                    break;
                }
                if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN) && temp[ (joueur1.getY()-1)][ joueur1.getX()]!=0) {
                    direction = 2;
                    degre = 270;
                }
                if (StdDraw.isKeyPressed(KeyEvent.VK_UP) && temp[ (joueur1.getY()+1)][ joueur1.getX()]!=0) {
                    direction = 8;
                    degre = 90;
                }
                if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT) && temp[ joueur1.getY()][ joueur1.getX()-1]!=0) {
                    direction = 4;
                    degre = 180;
                }
                if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT) && temp[ joueur1.getY()][ joueur1.getX()+1]!=0) {
                    direction = 6;
                    degre = 0;
                }
                StdDraw.clear(StdDraw.BLACK);
                pacmanGraphique.ecranDeJeu(pacmanMap.getLabyrinthe());


                // REGLES
                reglesDuJeu.checkInvicibilite(joueur1);
                reglesDuJeu.modifImageFantome(joueur1, tablfantomes);

                //déplacement du joueur et des fantomes, check des TP
                joueur1.mouvement(direction);
                joueur1.transfertBord();
                joueur1.mangeGraine(pacmanMap);

                //CHECK POUR VOIR SI TON PACMAN IL CREVE UN PEU COMME UNE SOUS MERDE
                reglesDuJeu.contact(joueur1, tablfantomes);


                //DEPLACEMENT FANTOMES
                for (Fantome f : tablfantomes){
                    f.deplacement();
                    f.transfertBord();
                }

                //CHECK POUR VOIR SI TON PACMAN IL CREVE UN PEU COMME UNE SOUS MERDE
                reglesDuJeu.contact(joueur1, tablfantomes);

                pacmanGraphique.afficheVie(joueur1);
                pacmanGraphique.afficheScore(joueur1);


                //DESSINAGE DES ENTITES
                StdDraw.picture(joueur1.getX(), joueur1.getY(), "pacman2.jpg", 0.9, 0.9, degre);
                for(Fantome f : tablfantomes ){
                    StdDraw.picture(f.getX(), f.getY(), f.getImage(), 0.9, 0.9, f.getDegre());
                }

                StdDraw.show();
                StdDraw.pause(100);
            }
        }


    }

}
