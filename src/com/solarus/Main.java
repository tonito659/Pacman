package com.solarus;
import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

public class Main {


    public final static int X_MAX= 30;
    public final static int Y_MAX= 30;
    public final static float WIDTH= 1;


    public static void main(String[] args) {
	// write your code here




        StdDraw.setCanvasSize(500,500);
        StdDraw.setXscale(-WIDTH, X_MAX + WIDTH);
        StdDraw.setYscale(-WIDTH, Y_MAX + WIDTH);
        int [][] map = Map.getLabyrinthe();
        int taillex_map = map.length;
        int tailley_map = map[1].length;

        System.out.println("X = " + taillex_map);
        System.out.println("Y = " + tailley_map);

        StdDraw.filledRectangle(15,15,16,16);
        for (int dang_y=tailley_map-1; dang_y>=0; --dang_y){
            for(int dang_x=taillex_map-1; dang_x>=0; --dang_x)  {
                if (map[dang_y][dang_x] == 0) {
                    StdDraw.setPenColor(Color.blue);
                    StdDraw.setPenRadius(0.002);
                    StdDraw.rectangle(dang_x, dang_y, 0.5, 0.5);
                }else if(map[dang_y][dang_x] == 2) {
                    StdDraw.setPenColor(Color.orange);
                    StdDraw.filledCircle(dang_x,dang_y,0.1);
                }else if(map[dang_y][dang_x] == 3) {
                    StdDraw.setPenColor(Color.yellow);
                    StdDraw.filledCircle(dang_x, dang_y, 0.3);
                }
                System.out.println("X = " + dang_x + " Y: " + dang_y);
            }
        }
        //StdDraw.filledCircle(0,0,3); // debug pour trouver origine axes

    }
}
