package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

public class Map {
    public static final  int X_MAX= 32;
    public static final  int Y_MAX= 32;
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
                    {1,1,1,1,1,0,2,0,0,1,0,0,0,0,0,0,0,0,1,0,0,2,0,1,1,1,1,1},
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
                    // 0= Mur , 1=case vide , 2=petites graines , 3=grosse graines
            };


    public Map() {
        // constructeur de la classe map
        this.labyrinthe = getLabyrinthe();
    }

    public  int[][] getLabyrinthe() {
        return labyrinthe;
    }


    public static void generateurGraphique(int[][] arrayMap){
        for (int ordonnee=30; ordonnee>=0; --ordonnee){
            for(int abcisse=28; abcisse>=0; --abcisse)  {
                if (arrayMap[ordonnee][abcisse] == 0) {
                    StdDraw.setPenColor(Color.blue);
                    StdDraw.filledRectangle(abcisse, ordonnee, 0.51, 0.51);
                }

                else if(arrayMap[ordonnee][abcisse] == 2) {
                    StdDraw.setPenColor(Color.orange);

                    StdDraw.filledCircle(abcisse,ordonnee,0.1);
                }else if(arrayMap[ordonnee][abcisse] == 3) {
                    StdDraw.setPenColor(Color.orange);
                    StdDraw.filledCircle(abcisse, ordonnee, 0.3);

                    StdDraw.filledCircle(abcisse,ordonnee,0.1);
                }else if(arrayMap[ordonnee][abcisse] == 3) {
                    StdDraw.setPenColor(Color.yellow);
                    StdDraw.filledCircle(abcisse, ordonnee, 0.3);

                }
                System.out.println("X = " + abcisse + " Y: " + ordonnee);
            }
        }
    }

    public  void initalisationEcran(){
        StdDraw.setCanvasSize(600,600);
        StdDraw.setXscale(-WIDTH, X_MAX + WIDTH);
        StdDraw.setYscale(-WIDTH, Y_MAX + WIDTH);
        StdDraw.filledRectangle(14,14,15,17);//fond noir
    }

    public  boolean [] testMur(int [][] map,int ordonneeEntity  , int abcisseEntity){
        // mur= true, pas de mur=false
        //Dans le tableau de boolean position 0=haut 1=droite 2=bas 3=gauche par rapport a la position de l'Entity
        boolean [] tableau= new boolean[4];

        if(map[(ordonneeEntity+1)][abcisseEntity]==0){
            //test Haut
            tableau[0]=true;
        }
        if(map[ordonneeEntity][(abcisseEntity+1)]==0){
            //test Droite
            tableau[1]=true;
        }
        if(map[(ordonneeEntity-1)][abcisseEntity]==0){
            //test Bas
            tableau[2]=true;
        }
        if(map[ordonneeEntity][(abcisseEntity-1)]==0){
            //test Gauche
            tableau[3]=true;
        }

        for(int i =0 ;i<4;i++){
            System.out.println(tableau[i]) ;
        }

        return tableau;
    }
}


