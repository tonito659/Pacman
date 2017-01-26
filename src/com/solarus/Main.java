package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        while(true){
            Sound musicPacman = new Sound();
            IG pacmanGraphique = new IG();

            pacmanGraphique.initialisationEcran();
            pacmanGraphique.ecranDeDemarrage();
        }
    }
}
