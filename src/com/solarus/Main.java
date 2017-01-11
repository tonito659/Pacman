package com.solarus;
import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

public class Main {


    public final static int X_MAX= 32;
    public final static int Y_MAX= 32;
    public final static float WIDTH= 1;


    public static void main(String[] args) {
	// write your code here
    //TODO : menu principal




        StdDraw.setCanvasSize(600,600);
        StdDraw.setXscale(-WIDTH, X_MAX + WIDTH);
        StdDraw.setYscale(-WIDTH, Y_MAX + WIDTH);
        //int [][] map = Map.getLabyrinthe();
        //int taillex_map = map.length;
        //int tailley_map = map[1].length;
        StdDraw.filledRectangle(14,14,15,17);//fond noir
        Map.generateurGraphique(Map.getLabyrinthe());

        //System.out.println("X = " + taillex_map);
        //System.out.println("Y = " + tailley_map);



        StdDraw.filledCircle(0,0,3);

    }
}
