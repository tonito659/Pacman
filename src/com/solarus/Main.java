package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //TODO : Créer une classe Ecran qui comporte les diférents écrans qui ne sont pas le plateau de jeu, ie les menus, pause et le reste
        //TODO : Finir le menu démarrage
        //TODO : Faire ecran de défaite
        while(true){

            Sound musicPacman = new Sound();
            IG pacmanGraphique = new IG();

            pacmanGraphique.initialisationEcran();

            pacmanGraphique.ecranDeDemarrage();

            StdDraw.enableDoubleBuffering();
            StdDraw.setPenColor(Color.yellow);


        }


    }

}
