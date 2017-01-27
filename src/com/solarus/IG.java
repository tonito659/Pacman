package com.solarus;

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
        Font font2 = new Font("DialogInput", Font.CENTER_BASELINE , 40);
        StdDraw.enableDoubleBuffering();

        while(true){
            if(StdDraw.mouseX()>=10&& StdDraw.mouseX()<=17&&StdDraw.mouseY()>5&&StdDraw.mouseY()<6.5){
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 24, "PAC-MAN.jpg", 24,8 );
                StdDraw.picture(13.5, 13, "pacmanDemarrage.jpg", 17,7 );
                StdDraw.setPenColor(Color.RED);
                StdDraw.setFont(font);
                StdDraw.text(13.5, 0, "CONTROLS");
                StdDraw.text(13.5, 3, "PLAYER 2");
                StdDraw.setFont(font2);
                StdDraw.text(13.5, 6, "PLAYER 1");
                StdDraw.show();
                StdDraw.pause(80);
                if(StdDraw.mousePressed()){
                    Joueur1.jeu1Joueur();
                }

                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 24, "PAC-MAN.jpg", 24,8 );
                StdDraw.picture(13.5, 13, "pacmanDemarrage.jpg", 17,7 );
                StdDraw.setPenColor(Color.RED);
                StdDraw.setFont(font);
                StdDraw.text(13.5, 0, "CONTROLS");
                StdDraw.setPenColor(Color.white);
                StdDraw.text(13.5, 3, "PLAYER 2");
                StdDraw.setFont(font2);
                StdDraw.text(13.5, 6, "PLAYER 1");
                StdDraw.show();
                StdDraw.pause(80);
                if(StdDraw.mousePressed()){
                    Joueur1.jeu1Joueur();
                }
            }

            else if(StdDraw.mouseX()>=10&& StdDraw.mouseX()<=17&&StdDraw.mouseY()>2&&StdDraw.mouseY()<=3.5){
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 24, "PAC-MAN.jpg", 24,8 );
                StdDraw.picture(13.5, 13, "pacmanDemarrage.jpg", 17,7 );
                StdDraw.setPenColor(Color.RED);
                StdDraw.setFont(font);
                StdDraw.text(13.5, 0, "CONTROLS");
                StdDraw.text(13.5, 6, "PLAYER 1");
                StdDraw.setFont(font2);
                StdDraw.text(13.5, 3, "PLAYER 2");
                StdDraw.show();
                StdDraw.pause(80);
                if(StdDraw.mousePressed()){
                    Joueur2.jeu2Joueur();
                }

                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 24, "PAC-MAN.jpg", 24,8 );
                StdDraw.picture(13.5, 13, "pacmanDemarrage.jpg", 17,7 );
                StdDraw.setFont(font);
                StdDraw.text(13.5, 0, "CONTROLS");
                StdDraw.setPenColor(Color.white);
                StdDraw.text(13.5, 6, "PLAYER 1");
                StdDraw.setFont(font2);
                StdDraw.text(13.5, 3, "PLAYER 2");
                StdDraw.show();
                StdDraw.pause(80);
                if(StdDraw.mousePressed()){
                    Joueur2.jeu2Joueur();
                }
            }

            else if(StdDraw.mouseX()>=10&& StdDraw.mouseX()<=17&&StdDraw.mouseY()>-1&&StdDraw.mouseY()<=0.70){
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 24, "PAC-MAN.jpg", 24,8 );
                StdDraw.picture(13.5, 13, "pacmanDemarrage.jpg", 17,7 );
                StdDraw.setPenColor(Color.RED);
                StdDraw.setFont(font);
                StdDraw.text(13.5, 3, "PLAYER 2");
                StdDraw.text(13.5, 6, "PLAYER 1");
                StdDraw.setFont(font2);
                StdDraw.text(13.5, 0, "CONTROLS");
                StdDraw.show();
                StdDraw.pause(80);
                if(StdDraw.mousePressed()){
                    this.toucheControleDesJoueur();
                }

                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 24, "PAC-MAN.jpg", 24,8 );
                StdDraw.picture(13.5, 13, "pacmanDemarrage.jpg", 17,7 );
                StdDraw.setPenColor(Color.white);
                StdDraw.setFont(font);
                StdDraw.text(13.5, 6, "PLAYER 1");
                StdDraw.text(13.5, 3, "PLAYER 2");
                StdDraw.setPenColor(Color.RED);
                StdDraw.setFont(font2);
                StdDraw.text(13.5, 0, "CONTROLS");
                StdDraw.show();
                StdDraw.pause(80);
                if(StdDraw.mousePressed()){
                    this.toucheControleDesJoueur();
                }
            }

            else{
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.setFont(font);
                StdDraw.picture(13.5, 24, "PAC-MAN.jpg", 24,8 );
                StdDraw.picture(13.5, 13, "pacmanDemarrage.jpg", 17,7 );
                StdDraw.setPenColor(Color.RED);
                StdDraw.text(13.5, 0, "CONTROLS");
                StdDraw.setPenColor(Color.WHITE);
                StdDraw.text(13.5, 6, "PLAYER 1");
                StdDraw.text(13.5, 3, "PLAYER 2");
                StdDraw.show();
                StdDraw.pause(80);

                StdDraw.clear(StdDraw.BLACK);
                StdDraw.setFont(font);
                StdDraw.picture(13.5, 24, "PAC-MAN.jpg", 24,8 );
                StdDraw.picture(13.5, 13, "pacmanDemarrage.jpg", 17,7 );
                StdDraw.setPenColor(Color.RED);
                StdDraw.text(13.5, 0, "CONTROLS");
                StdDraw.text(13.5, 6, "PLAYER 1");
                StdDraw.text(13.5, 3, "PLAYER 2");
                StdDraw.show();
                StdDraw.pause(80);
            }

        }
    }

    public void toucheControleDesJoueur(){
        Font font = new Font("DialogInput", Font.CENTER_BASELINE , 20);
        Font font2 = new Font("DialogInput", Font.CENTER_BASELINE , 30);
        StdDraw.enableDoubleBuffering();
    while(true){
        if(StdDraw.mouseX()>=10&& StdDraw.mouseX()<=17&&StdDraw.mouseY()>-1&&StdDraw.mouseY()<=0.70){
            StdDraw.clear(StdDraw.BLACK);
            StdDraw.setPenColor(Color.RED);
            StdDraw.picture(13.5, 24, "PAC-MAN.jpg", 24,8 );
            StdDraw.picture(13.5, 13, "pacmanDemarrage.jpg", 17,7 );
            StdDraw.setFont(font);
            StdDraw.text(13.5, 6, "JOUEUR 2 : Z= HAUT , S= BAS , Q= GAUCHE , D= DROITE ");
            StdDraw.text(13.5, 3, "JOUEUR 1 : ▲ , ▼ , ► , ◄");
            StdDraw.setFont(font2);
            StdDraw.text(13.5,0,"EXIT");
            StdDraw.show();
            StdDraw.pause(80);
            if(StdDraw.mousePressed()){
                break;
            }

            StdDraw.clear(StdDraw.BLACK);
            StdDraw.setPenColor(Color.RED);
            StdDraw.picture(13.5, 24, "PAC-MAN.jpg", 24,8 );
            StdDraw.picture(13.5, 13, "pacmanDemarrage.jpg", 17,7 );
            StdDraw.setFont(font);
            StdDraw.text(13.5, 6, "JOUEUR 2 : Z= HAUT , S= BAS , Q= GAUCHE , D= DROITE ");
            StdDraw.text(13.5, 3, "JOUEUR 1 : ▲ , ▼ , ► , ◄");
            StdDraw.setFont(font2);
            StdDraw.setPenColor(Color.white);
            StdDraw.text(13.5,0,"EXIT");
            StdDraw.show();
            StdDraw.pause(80);
            if(StdDraw.mousePressed()){
                break;
            }
        }

        else{
            StdDraw.clear(StdDraw.BLACK);
            StdDraw.setPenColor(Color.RED);
            StdDraw.picture(13.5, 24, "PAC-MAN.jpg", 24,8 );
            StdDraw.picture(13.5, 13, "pacmanDemarrage.jpg", 17,7 );
            StdDraw.setFont(font);
            StdDraw.text(13.5, 6, "JOUEUR 2 : Z= HAUT , S= BAS , Q= GAUCHE , D= DROITE ");
            StdDraw.text(13.5, 3, "JOUEUR 1 : ▲ , ▼ , ► , ◄");
            StdDraw.text(13.5,0,"EXIT");
            StdDraw.show();
            StdDraw.pause(80);


            StdDraw.clear(StdDraw.BLACK);
            StdDraw.setPenColor(Color.RED);
            StdDraw.picture(13.5, 24, "PAC-MAN.jpg", 24,8 );
            StdDraw.picture(13.5, 13, "pacmanDemarrage.jpg", 17,7 );
            StdDraw.setFont(font);
            StdDraw.text(13.5, 6, "JOUEUR 2 : Z= HAUT , S= BAS , Q= GAUCHE , D= DROITE ");
            StdDraw.text(13.5, 3, "JOUEUR 1 : ▲ , ▼ , ► , ◄");
            StdDraw.setPenColor(Color.white);
            StdDraw.text(13.5,0,"EXIT");
            StdDraw.show();
            StdDraw.pause(80);


        }

        }
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

    public boolean ecranDeFin(Pacman joueur){
        Font font = new Font("DialogInput", Font.CENTER_BASELINE , 30);
        Font font2 = new Font("DialogInput", Font.CENTER_BASELINE , 40);
        StdDraw.enableDoubleBuffering();
        boolean again = false;
        while (true){
            if(StdDraw.mouseX()>10 && StdDraw.mouseX()<17&&StdDraw.mouseY()>=2&&StdDraw.mouseY()<=3.5){
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "ecran_loose.jpg", 20,20 );
                StdDraw.setPenColor(Color.RED);
                StdDraw.setFont(font);
                StdDraw.text(13.5, 6, "YOU LOOSE");
                StdDraw.setPenColor(Color.white);
                StdDraw.text(4,-5,"SCORE: "+joueur.getScore());
                StdDraw.setPenColor(Color.RED);
                StdDraw.setFont(font2);
                StdDraw.text(13.5, 3, "REPLAY ?");
                StdDraw.show();
                StdDraw.pause(80);
                if(StdDraw.mousePressed()){
                    again = true;
                }

                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "ecran_loose.jpg", 20,20 );
                StdDraw.setPenColor(Color.RED);
                StdDraw.setFont(font);
                StdDraw.text(13.5, 6, "YOU LOOSE");
                StdDraw.setPenColor(Color.white);
                StdDraw.text(4,-5,"SCORE: "+joueur.getScore());
                StdDraw.setFont(font2);
                StdDraw.text(13.5, 3, "REPLAY ?");
                StdDraw.show();
                StdDraw.pause(80);
                if(StdDraw.mousePressed()){
                    again= true;
                }
            }

            else{
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "ecran_loose.jpg", 20,20 );
                StdDraw.setFont(font);
                StdDraw.setPenColor(Color.white);
                StdDraw.text(4,-5,"SCORE: "+joueur.getScore());
                StdDraw.setPenColor(Color.RED);
                StdDraw.text(13.5, 6, "YOU LOOSE");
                StdDraw.text(13.5, 3, "REPLAY ?");
                StdDraw.show();
                StdDraw.pause(80);

                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "ecran_loose.jpg", 20,20 );
                StdDraw.setFont(font);
                StdDraw.text(13.5, 6, "YOU LOOSE");
                StdDraw.setPenColor(Color.white);
                StdDraw.text(13.5, 3, "REPLAY ?");
                StdDraw.text(4,-5,"SCORE: "+joueur.getScore());
                StdDraw.show();
                StdDraw.pause(80);
                StdDraw.clear(StdDraw.BLACK);
            }
            if(again) break;
        }
        System.out.println("coucou");
        return again;
    }

    public boolean ecranDeFin2Joueur(Pacman joueur1,Pacman joueur2 ){
        Font font = new Font("DialogInput", Font.CENTER_BASELINE , 30);
        Font font2 = new Font("DialogInput", Font.CENTER_BASELINE , 40);
        StdDraw.enableDoubleBuffering();
        boolean again = false;
        while (true){
            if(StdDraw.mouseX()>10 && StdDraw.mouseX()<17&&StdDraw.mouseY()>=2&&StdDraw.mouseY()<=3.5){
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "ecran_loose.jpg", 20,20 );

                StdDraw.setFont(font);
                StdDraw.setPenColor(Color.white);
                StdDraw.text(12,-3,"SCORE J1: "+joueur1.getScore() +"  "+ "SCORE J2: "+joueur2.getScore());
                StdDraw.setPenColor(Color.RED);
                StdDraw.text(13.5, 6, "YOU LOOSE");
                StdDraw.setFont(font2);
                StdDraw.text(13.5, 3, "REPLAY ?");
                StdDraw.show();
                StdDraw.pause(80);
                if(StdDraw.mousePressed()){
                    again = true;
                }
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "ecran_loose.jpg", 20,20 );
                StdDraw.setFont(font);
                StdDraw.setPenColor(Color.RED);
                StdDraw.text(13.5, 6, "YOU LOOSE");
                StdDraw.setPenColor(Color.white);
                StdDraw.text(12,-3,"SCORE J1: "+joueur1.getScore() + "  "+"SCORE J2: "+joueur2.getScore());
                StdDraw.setFont(font2);
                StdDraw.text(13.5, 3, "REPLAY ?");
                StdDraw.show();
                StdDraw.pause(80);
                if(StdDraw.mousePressed()){
                    again= true;
                }
            }

            else{
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "ecran_loose.jpg", 20,20 );
                StdDraw.setFont(font);
                StdDraw.setPenColor(Color.WHITE);
                StdDraw.text(12,-3,"SCORE J1: "+joueur1.getScore() + "  "+"SCORE J2: "+joueur2.getScore());
                StdDraw.setPenColor(Color.RED);
                StdDraw.text(13.5, 6, "YOU LOOSE");
                StdDraw.text(13.5, 3, "REPLAY ?");
                StdDraw.show();
                StdDraw.pause(80);

                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "ecran_loose.jpg", 20,20 );
                StdDraw.setFont(font);
                StdDraw.text(13.5, 6, "YOU LOOSE");
                StdDraw.setPenColor(Color.white);
                StdDraw.text(12,-3,"SCORE J1: "+joueur1.getScore() + "  "+"SCORE J2: "+joueur2.getScore());
                StdDraw.text(13.5, 3, "REPLAY ?");
                StdDraw.show();
                StdDraw.pause(80);
                StdDraw.clear(StdDraw.BLACK);
            }
            if(again) break;
        }
        System.out.println("coucou");
        return again;
    }

    public boolean ecranDeWin(Pacman joueur){
        Font font = new Font("DialogInput", Font.CENTER_BASELINE , 30);
        Font font2 = new Font("DialogInput", Font.CENTER_BASELINE , 40);
        boolean again = false;
        while(true){
            if(StdDraw.mouseX()>7 && StdDraw.mouseX()<17&&StdDraw.mouseY()>=2&&StdDraw.mouseY()<=3.5){
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "ecran_win.jpg", 20,20 );
                StdDraw.setFont(font);
                StdDraw.setPenColor(Color.white);
                StdDraw.text(4,-5,"SCORE: "+joueur.getScore());
                StdDraw.setPenColor(Color.RED);
                StdDraw.text(13.5, 6, "YOU WIN");
                StdDraw.setFont(font2);
                StdDraw.text(13.5, 3, "REPLAY ?");
                StdDraw.show();
                StdDraw.pause(80);
                if(StdDraw.mousePressed()){
                    again = true;

                }
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "ecran_win.jpg", 20,20 );
                StdDraw.setPenColor(Color.RED);
                StdDraw.setFont(font);
                StdDraw.text(13.5, 6, "YOU WIN");
                StdDraw.setPenColor(Color.white);
                StdDraw.text(4,-5,"SCORE: "+joueur.getScore());
                StdDraw.setFont(font2);
                StdDraw.text(13.5, 3, "REPLAY ?");
                StdDraw.show();
                StdDraw.pause(80);
                if(StdDraw.mousePressed()){
                    again = true;

                }
            }

            else{
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "ecran_win.jpg", 20,20 );
                StdDraw.setFont(font);
                StdDraw.setPenColor(Color.white);
                StdDraw.text(4,-5,"SCORE: "+joueur.getScore());
                StdDraw.setPenColor(Color.RED);
                StdDraw.text(13.5, 6, "YOU WIN");
                StdDraw.text(13.5, 3, "REPLAY ?");

                StdDraw.show();
                StdDraw.pause(80);

                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "ecran_win.jpg", 20,20 );
                StdDraw.setFont(font);
                StdDraw.text(13.5, 6, "YOU WIN");
                StdDraw.setPenColor(Color.white);
                StdDraw.text(13.5, 3, "REPLAY ?");
                StdDraw.text(4,-5,"SCORE: "+joueur.getScore());
                StdDraw.show();
                StdDraw.pause(80);
                StdDraw.clear(StdDraw.BLACK);

            }
            if(again) break;
        }
        System.out.println("coucou");
        return again;

    }

    public boolean ecranDeWin2Joueur(Pacman joueur1,Pacman joueur2){
        Font font = new Font("DialogInput", Font.CENTER_BASELINE , 30);
        Font font2 = new Font("DialogInput", Font.CENTER_BASELINE , 40);
        boolean again = false;
        while(true){
            if(StdDraw.mouseX()>7 && StdDraw.mouseX()<17&&StdDraw.mouseY()>=2&&StdDraw.mouseY()<=3.5){
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "ecran_win.jpg", 20,20 );
                StdDraw.setFont(font);
                StdDraw.setPenColor(Color.white);
                StdDraw.text(12,-3,"SCORE J1: "+joueur1.getScore() + "  "+"SCORE J2: "+joueur2.getScore());
                StdDraw.setPenColor(Color.RED);
                StdDraw.text(13.5, 6, "YOU WIN");
                StdDraw.setFont(font2);
                StdDraw.text(13.5, 3, "REPLAY ?");
                StdDraw.show();
                StdDraw.pause(80);
                if(StdDraw.mousePressed()){
                    again = true;

                }
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "ecran_win.jpg", 20,20 );
                StdDraw.setFont(font);
                StdDraw.setPenColor(Color.white);
                StdDraw.text(12,-3,"SCORE J1: "+joueur1.getScore() +"  "+ "SCORE J2: "+joueur2.getScore());
                StdDraw.setPenColor(Color.RED);
                StdDraw.text(13.5, 6, "YOU WIN");
                StdDraw.setFont(font2);
                StdDraw.setPenColor(Color.white);
                StdDraw.text(13.5, 3, "REPLAY ?");
                StdDraw.show();
                StdDraw.pause(80);
                if(StdDraw.mousePressed()){
                    again = true;

                }
            }

            else{
                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "ecran_win.jpg", 20,20 );
                StdDraw.setFont(font);
                StdDraw.setPenColor(Color.white);
                StdDraw.text(12,-3,"SCORE J1: "+joueur1.getScore() + "  "+"SCORE J2: "+joueur2.getScore());
                StdDraw.setPenColor(Color.RED);
                StdDraw.text(13.5, 6, "YOU WIN");
                StdDraw.text(13.5, 3, "REPLAY ?");
                StdDraw.show();
                StdDraw.pause(80);

                StdDraw.clear(StdDraw.BLACK);
                StdDraw.picture(13.5, 20, "ecran_win.jpg", 20,20 );
                StdDraw.setFont(font);
                StdDraw.text(13.5, 6, "YOU WIN");
                StdDraw.setPenColor(Color.white);
                StdDraw.text(12,-3,"SCORE J1: "+joueur1.getScore() +"  "+ "SCORE J2: "+joueur2.getScore());
                StdDraw.text(13.5, 3, "REPLAY ?");
                StdDraw.show();
                StdDraw.pause(80);
                StdDraw.clear(StdDraw.BLACK);

            }
            if(again) break;
        }
        System.out.println("coucou");
        return again;

    }

    public void afficheVie(Pacman pacman){
        int compteurPositionVie=2;
        for(int i = 0; i< pacman.getNbVie(); i++){
            System.out.print("i = "+i);
            StdDraw.picture( 22 + i*compteurPositionVie,-3.1,"pacman-lives.png",2,2);
        }
    }

    public void afficheScore(Pacman pacman){
        StdDraw.picture(3, -3.1, "Ender_SCORE.jpg", 5,5 );
        StdDraw.setPenColor(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 30);
        StdDraw.setFont(font);
        StdDraw.text(7,-3.5, " :\t" + pacman.getScore());
    }

    public void affiche2joueurs(Pacman[] tabljoueurs){
        int compteurPositionVie=2;
        for(int i=0;i<tabljoueurs[0].getNbVie();i++){
            StdDraw.picture( 22 + i*compteurPositionVie,-3.1,"pacman-lives.png",1,1);
        }
        for(int i=0;i<tabljoueurs[1].getNbVie();i++){
            StdDraw.picture( 22 + i*compteurPositionVie,-4.5,"pacman-lives.png",1,1);
        }
        StdDraw.setPenColor(Color.WHITE);
        Font font = new Font("DialogInput", Font.CENTER_BASELINE , 30);
        StdDraw.setFont(font);
        StdDraw.text(7,-3.5, "Score J1 :\t" +tabljoueurs[0].getScore());
        StdDraw.text(7,-5, "Score J2 :\t" +tabljoueurs[1].getScore());

    }
}