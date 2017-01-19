package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

public class Map {
    public static final  int X_MAX= 28;
    public static final  int Y_MAX= 29;
    public static final  float WIDTH= 1;

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
                    {0,0,0,0,0,0,2,0,0,1,0,1,1,1,1,1,1,0,1,0,0,2,0,0,0,0,0,0},
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
                    // 0= Mur , 1=case vide , 2=petites graines , 3=grosse graines, 4=mur fantome
            };




    public int[][] getLabyrinthe() {
        return labyrinthe;
    }

    public void setLabyrinthe(int[][] labyrinthe) {
        this.labyrinthe = labyrinthe;
    }

    public int[][] getLabyrintheReverse(){
        int [][] reverseMap = this.getLabyrinthe();
        for(int i = 0; i < reverseMap.length / 2; i++)
        {
            int [] temp = reverseMap[i];
            reverseMap[i] = reverseMap[reverseMap.length - i - 1];
            reverseMap[reverseMap.length - i - 1] = temp;
        }

        return reverseMap;
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

    public void initialisationEcran(){
        StdDraw.setCanvasSize(650,650);
        StdDraw.setXscale(-1, 28 );
        StdDraw.setYscale(-6, 31 );
        StdDraw.clear(StdDraw.BLACK);
    }

    public void ecranDeDemarrage(){
        //ajouter image
    }
}


