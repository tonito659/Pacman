package com.solarus;

import com.solarus.Joueur;
import edu.princeton.cs.introcs.StdDraw;
import java.awt.*;
import java.awt.event.KeyEvent;

public class IG {

    public void initialisationEcran(){
        StdDraw.setCanvasSize(650,650);
        StdDraw.setXscale(-1, 28 );
        StdDraw.setYscale(-6, 31 );
        StdDraw.clear(StdDraw.BLACK);
    }

    public void ecranDeDemarrage(){
        Font font = new Font("DialogInput", Font.CENTER_BASELINE , 30);
        StdDraw.setFont(font);
        StdDraw.enableDoubleBuffering();

        while(true){

            StdDraw.picture(13.5, 24, "PAC-MAN.jpg", 24,8 );
            StdDraw.picture(13.5, 13, "pacmanDemarrage.jpg", 17,7 );
            StdDraw.setPenColor(Color.RED);
            StdDraw.text(13.5, 0, "CONTROLS");
            StdDraw.setPenColor(Color.WHITE);
            StdDraw.text(13.5, 6, "PLAYER 1");
            StdDraw.text(13.5, 3, "PLAYER 2");
            StdDraw.show();
            StdDraw.pause(100);
            if(StdDraw.isKeyPressed(KeyEvent.VK_ENTER)){
                break;
            }

            StdDraw.clear(StdDraw.BLACK);
            StdDraw.picture(13.5, 24, "PAC-MAN.jpg", 24,8 );
            StdDraw.picture(13.5, 13, "pacmanDemarrage.jpg", 17,7 );
            StdDraw.setPenColor(Color.RED);
            StdDraw.text(13.5, 0, "CONTROLS");
            StdDraw.text(13.5, 6, "PLAYER 1");
            StdDraw.text(13.5, 3, "PLAYER 2");
            StdDraw.show();
            StdDraw.pause(100);
            if(StdDraw.isKeyPressed(KeyEvent.VK_ENTER)){
                break;
            }
        }
        StdDraw.disableDoubleBuffering();
    }

    public void ecranDeJeu(int[][] Map){
        for (int ordonnee=30; ordonnee>=0; --ordonnee){
            for(int abcisse=27; abcisse>=0; --abcisse)  {
                if (Map[ordonnee][abcisse] == 0) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledRectangle(abcisse, ordonnee, 0.51, 0.51);
                }
                else if(Map[ordonnee][abcisse] == 2) {
                    StdDraw.setPenColor(StdDraw.ORANGE);
                    StdDraw.filledCircle(abcisse,ordonnee,0.1);
                }
                else if(Map[ordonnee][abcisse] == 3) {
                    StdDraw.setPenColor(StdDraw.ORANGE);
                    StdDraw.filledCircle(abcisse, ordonnee, 0.3);
                }
                else if(Map[ordonnee][abcisse]==4){
                    StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.line(11,18,15.5,18);
                }

                //System.out.println("X = " + abcisse + " Y: " + ordonnee);

                //System.out.print(arrayMap[ordonnee][abcisse]);
            }
            //System.out.println("");

        }
        //System.out.println("Tableau généré");
    StdDraw.show();
    }

    public void ecranDeFin(){
        Font font = new Font("DialogInput", Font.CENTER_BASELINE , 30);
        Font font2 = new Font("DialogInput", Font.CENTER_BASELINE , 40);
        StdDraw.enableDoubleBuffering();

        while (true){
            if(StdDraw.mouseX()>7 && StdDraw.mouseX()<18&&StdDraw.mouseY()>=1.5&&StdDraw.mouseY()<=4.5){
                StdDraw.picture(13.5, 20, "James-Gosling.jpg", 20,20 );
                StdDraw.setPenColor(Color.RED);
                StdDraw.setFont(font);
                StdDraw.text(13.5, 6, "TU EST PAS TRÈS FORT");
                StdDraw.setFont(font2);
                StdDraw.text(13.5, 3, "VASI RECOMMENCE GROS");
                StdDraw.show();
                StdDraw.pause(50);
                if(StdDraw.mousePressed()==true){
                    break;
                }
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "James-Gosling.jpg", 20,20 );
                StdDraw.setPenColor(Color.RED);
                StdDraw.setFont(font);
                StdDraw.text(13.5, 6, "TU EST PAS TRÈS FORT");
                StdDraw.setFont(font2);
                StdDraw.setPenColor(Color.white);
                StdDraw.text(13.5, 3, "VASI RECOMMENCE GROS");
                StdDraw.show();
                StdDraw.pause(50);
                if(StdDraw.mousePressed()==true){
                    break;
                }
            }

            else{

                StdDraw.picture(13.5, 20, "James-Gosling.jpg", 20,20 );
                StdDraw.setFont(font);
                StdDraw.setPenColor(Color.RED);
                StdDraw.text(13.5, 6, "TU EST PAS TRÈS FORT");
                StdDraw.text(13.5, 3, "VASI RECOMMENCE GROS");
                StdDraw.show();
                StdDraw.pause(50);

                StdDraw.clear(StdDraw.BLACK);
                StdDraw.setFont(font);
                StdDraw.picture(13.5, 20, "James-Gosling.jpg", 20,20 );
                StdDraw.text(13.5, 6, "TU EST PAS TRÈS FORT");
                StdDraw.setPenColor(Color.white);
                StdDraw.text(13.5, 3, "VASI RECOMMENCE GROS");
                StdDraw.show();
                StdDraw.pause(50);
                StdDraw.clear(StdDraw.BLACK);
            }
        }

    }


    public void ecranDeWin(){

    }

    public void afficheVie(Joueur joueur){
        int compteurPositionVie=2;
        for(int i=0;i<joueur.getNbVie();i++){
            System.out.print("i = "+i);
            StdDraw.picture( 22 + i*compteurPositionVie,-3.1,"pacman-lives.png",2,2);
        }
    }

    public void afficheScore(Joueur joueur){
        StdDraw.picture(3, -3.1, "Ender_SCORE.jpg", 5,5 );
        StdDraw.setPenColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 30);
        StdDraw.setFont(font);
        StdDraw.text(7,-3.5, " :\t" +joueur.getScore());
    }

    public void affiche2joueurs(Joueur [] tabljoueurs){
        int compteurPositionVie=2;
        for(int i=0;i<tabljoueurs[0].getNbVie();i++){
            StdDraw.picture( 22 + i*compteurPositionVie,-3.1,"pacman-lives.png",1,1);
        }
        for(int i=0;i<tabljoueurs[1].getNbVie();i++){
            StdDraw.picture( 22 + i*compteurPositionVie,-4.5,"pacman-lives.png",1,1);
        }
        StdDraw.setPenColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 30);
        StdDraw.setFont(font);
        StdDraw.text(7,-3.5, "Score J1 :\t" +tabljoueurs[0].getScore());
        StdDraw.text(7,-5, "Score J2 :\t" +tabljoueurs[1].getScore());

    }
}