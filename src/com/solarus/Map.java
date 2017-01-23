package com.solarus;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.event.KeyEvent;
import java.awt.*;

public class Map {

    private int [][] labyrinthe =
            {
                    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                    {0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0},
                    {0,2,0,0,0,0,0,0,0,0,0,0,2,0,0,2,0,0,0,0,0,0,0,0,0,0,2,0},
                    {0,2,0,0,0,0,0,0,0,0,0,0,2,0,0,2,0,0,0,0,0,0,0,0,0,0,2,0},
                    {0,2,2,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,2,2,0},
                    {0,0,0,2,0,0,2,0,0,2,0,0,0,0,0,0,0,0,2,0,0,2,0,0,2,0,0,0},
                    {0,0,0,2,0,0,2,0,0,2,0,0,0,0,0,0,0,0,2,0,0,2,0,0,2,0,0,0},
                    {0,3,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,2,2,3,0},
                    {0,2,0,0,0,0,2,0,0,0,0,0,2,0,0,2,0,0,0,0,0,2,0,0,0,0,2,0},
                    {0,2,0,0,0,0,2,0,0,0,0,0,2,0,0,2,0,0,0,0,0,2,0,0,0,0,2,0},
                    {0,2,2,2,2,2,2,2,2,2,2,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,0},
                    {0,0,0,0,0,0,2,0,0,1,0,0,0,0,0,0,0,0,1,0,0,2,0,0,0,0,0,0},
                    {1,1,1,1,1,0,2,0,0,1,0,0,0,0,0,0,0,0,1,0,0,2,0,1,1,1,1,1},
                    {1,1,1,1,1,0,2,0,0,1,1,1,1,1,1,1,1,1,1,0,0,2,0,1,1,1,1,1},
                    {1,1,1,1,1,0,2,0,0,1,0,0,0,0,0,0,0,0,1,0,0,2,0,1,1,1,1,1},
                    {0,0,0,0,0,0,2,0,0,1,0,1,1,1,1,1,1,0,1,0,0,2,0,0,0,0,0,0},
                    {1,1,1,1,1,1,2,1,1,1,0,1,1,1,1,1,1,0,1,1,1,2,1,1,1,1,1,1},//millieu
                    {0,0,0,0,0,0,2,0,0,1,0,5,5,5,5,5,5,0,1,0,0,2,0,0,0,0,0,0},
                    {1,1,1,1,1,0,2,0,0,1,0,0,4,4,4,4,0,0,1,0,0,2,0,1,1,1,1,1},
                    {1,1,1,1,1,0,2,0,0,1,1,1,1,1,1,1,1,1,1,0,0,2,0,1,1,1,1,1},
                    {1,1,1,1,1,0,2,0,0,0,0,0,1,0,0,1,0,0,0,0,0,2,0,1,1,1,1,1},
                    {0,0,0,0,0,0,2,0,0,0,0,0,1,0,0,1,0,0,0,0,0,2,0,0,0,0,0,0},
                    {0,2,2,2,2,2,2,0,0,1,1,1,1,0,0,1,1,1,1,0,0,2,2,2,2,2,2,0},
                    {0,2,0,0,0,0,2,0,0,1,0,0,0,0,0,0,0,0,1,0,0,2,0,0,0,0,2,0},
                    {0,2,0,0,0,0,2,0,0,1,0,0,0,0,0,0,0,0,1,0,0,2,0,0,0,0,2,0},
                    {0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0},
                    {0,2,0,0,0,0,2,0,0,0,0,0,2,0,0,2,0,0,0,0,0,2,0,0,0,0,2,0},
                    {0,3,0,0,0,0,2,0,0,0,0,0,2,0,0,2,0,0,0,0,0,2,0,0,0,0,3,0},
                    {0,2,0,0,0,0,2,0,0,0,0,0,2,0,0,2,0,0,0,0,0,2,0,0,0,0,2,0},
                    {0,2,2,2,2,2,2,2,2,2,2,2,2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,0},
                    {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                    // 0= Mur , 1=case vide , 2=petites graines , 3=grosse graines, 4=mur fantome , 5 mur invisible fantome
            };

    public int[][] getLabyrinthe() {
        return labyrinthe;
    }

    public void setValeurLabyrintheYX(int Y, int X, int valeur) {
        this.labyrinthe[Y][X] = valeur;
    }

    public void initialisationEcran(){
        StdDraw.setCanvasSize(650,650);
        StdDraw.setXscale(-1, 28 );
        StdDraw.setYscale(-6, 31 );
        StdDraw.clear(StdDraw.BLACK);

    }

    public void ecranDeDemarrage(){
          //ajouter annimation presse start
        Font font = new Font("DialogInput", Font.CENTER_BASELINE , 30);


       while(true){
           StdDraw.picture(13.5, 24, "PAC-MAN.jpg", 24,8 );
           StdDraw.picture(13.5, 13, "pacmanDemarrage.jpg", 15,6 );
           StdDraw.setPenColor(Color.WHITE);
           StdDraw.setFont(font);
           StdDraw.text(13.5, 3, "Press START");
           StdDraw.pause(500);
           if(StdDraw.isKeyPressed(KeyEvent.VK_ENTER)){
                /*StdDraw.text(13.5, 3, "Press START");
                if(StdDraw.mousePressed()==true){
                    break;
                }*/
               break;
           }

           StdDraw.clear(StdDraw.BLACK);
           StdDraw.picture(13.5, 24, "PAC-MAN.jpg", 24,8 );
           StdDraw.picture(13.5, 13, "pacmanDemarrage.jpg", 15,6 );
           StdDraw.setPenColor(Color.RED);
           StdDraw.text(13.5, 3, "Press START");
           StdDraw.pause(500);
           if(StdDraw.isKeyPressed(KeyEvent.VK_ENTER)){
                /*StdDraw.text(13.5, 3, "Press START");
                if(StdDraw.mousePressed()==true){
                    break;
                }*/
               break;
           }
        }
    }

    public void ecranDeJeu(int[][] arrayMap){
        for (int ordonnee=30; ordonnee>=0; --ordonnee){
            for(int abcisse=27; abcisse>=0; --abcisse)  {
                if (arrayMap[ordonnee][abcisse] == 0) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledRectangle(abcisse, ordonnee, 0.51, 0.51);
                }
                else if(arrayMap[ordonnee][abcisse] == 2) {
                    StdDraw.setPenColor(StdDraw.ORANGE);
                    StdDraw.filledCircle(abcisse,ordonnee,0.1);
                }
                else if(arrayMap[ordonnee][abcisse] == 3) {
                    StdDraw.setPenColor(StdDraw.ORANGE);
                    StdDraw.filledCircle(abcisse, ordonnee, 0.3);
                }
                else if(arrayMap[ordonnee][abcisse]==4){
                    StdDraw.setPenColor(StdDraw.WHITE);
                    StdDraw.line(11,18,15.5,18);
                }

                //System.out.println("X = " + abcisse + " Y: " + ordonnee);

                //System.out.print(arrayMap[ordonnee][abcisse]);
            }
            //System.out.println("");

        }
        //System.out.println("Tableau généré");

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
}


