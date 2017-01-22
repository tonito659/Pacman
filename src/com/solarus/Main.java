package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) {
        //TODO : Créer une classe Ecran qui comporte les diférents écrans qui ne sont pas le plateau de jeu, ie les menus, pause et le reste
        //TODO : Finir le menu démarrage , finir l'ecran de jeu en affichant les vies et les faire disparaitre quand on en perd
        //TODO : Régler le problème pour êmpéche que pacman et fantome rentre au millieu
        //TODO : Faire ecran de défaite + condition de défaite
        //TODO : Faire que les fantomes bouge dans le sens de déplacement
        //TODO : Lorsque le pacman est invincible faire revenir les fantomes au point de dépard

        Map pacmanMap = new Map();
        Joueur joueur1 = new Joueur(3, 0, "Bogoss", 14, 7);
        Fantome FantomeRouge = new Fantome("RED", 14, 16, "ready.png");
        Fantome FantomeRose = new Fantome("PINK", 15, 16, "pinkie.jpg");
        Fantome FantomeBleu = new Fantome("BLUE", 14, 15,"bleue.png");
        Fantome FantomeOrange = new Fantome("ORANGE", 15, 15,"yellowie.png");
        Fantome [] tablfantomes = {FantomeBleu,FantomeRouge,FantomeRose,FantomeOrange};
        //instanciation


        pacmanMap.initialisationEcran();
        pacmanMap.ecranDeDemarrage();

        StdDraw.picture(joueur1.getX(), joueur1.getY(), "pacman2.jpg", 0.9, 0.9, 180);
        StdDraw.picture(FantomeBleu.getX(), FantomeBleu.getY(), "bleue.png", 0.9, 0.9, 180);
        StdDraw.picture(FantomeRose.getX(), FantomeRose.getY(), "pinkie.jpg", 0.9, 0.9, 180);
        StdDraw.picture(FantomeOrange.getX(), FantomeOrange.getY(), "yellowie.png", 0.9, 0.9, 180);
        StdDraw.picture(FantomeRouge.getX(), FantomeRouge.getY(), "ready.png", 0.9, 0.9, 180);


        //System.out.print("X =" + joueur1.getX() + " Y =" + joueur1.getX());
        StdDraw.enableDoubleBuffering();
        //j'applique a pacmanMap les méthodes présents dans la classe map
        StdDraw.setPenColor(Color.yellow);

        int direction = 0, degre = 0;
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
            pacmanMap.ecranDeJeu(pacmanMap.getLabyrinthe());

            // REGLES
            Regles.checkInvicibilite(joueur1);
            Regles.modifImageFantome(joueur1, tablfantomes);




            //déplacement du joueur et des fantomes, check des TP
            joueur1.mouvement(direction);
            joueur1.transfertBord();
            joueur1.mangeGraine(pacmanMap);

            //CHECK POUR VOIR SI TON PACMAN IL CREVE UN PEU COMME UNE SOUS MERDE



            //DEPLACEMENT FANTOMES
            for (Fantome f : tablfantomes){
                f.deplacement();
                f.transfertBord();
            }




            StdDraw.picture(3, -3.1, "Ender_SCORE.jpg", 5,5 );
            StdDraw.setPenColor(Color.WHITE);
            Font font = new Font("Arial", Font.BOLD, 30);
            StdDraw.setFont(font);
            StdDraw.text(7,-3.5, " :\t" +joueur1.getScore());
            StdDraw.text(17,-3.5, "Lives : " +joueur1.getNbVie());
            //affichage Score , problème lors de l'augmentation du score





            StdDraw.picture(joueur1.getX(), joueur1.getY(), "pacman2.jpg", 0.9, 0.9, degre);
            for(Fantome f : tablfantomes ){
                StdDraw.picture(f.getX(), f.getY(), f.getImage(), 0.9, 0.9, f.getDegre());
            }

            StdDraw.show();
            StdDraw.pause(100);

            //System.out.println(joueur1.getNbVie());



            if (StdDraw.isKeyPressed(KeyEvent.VK_ENTER)) {
                break;
            }
        }
        StdDraw.clear(StdDraw.BLACK);
        pacmanMap.ecranDeDemarrage();

    }

}
