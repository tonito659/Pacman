package com.solarus;


public class Entity {

    private int px, py;

    public int getX() {
        return px;
    }

    public void setX(int x) {
        this.px = x;
    }

    public int getY() {
        return py;
    }

    public void setY(int y) {
        this.py = y;
    }


    //public void deplacement(){}
    public void transfertBord(){
        // DO YOU EVEN TP BRO ?
        // INSTANT TP OMGHAXX
        if(this.px == 0 && this.py == 16){
            px=26;
        } else if (this.px == 26 && this.py == 16){
            px=0;
        }
    }

    public boolean [] collisionsPossibles(){
        //indique les collisions, dans l'ordre : N, E, S, O
        boolean [] collision = new boolean[4];
        int [][] temp = Map.getLabyrinthe();
        if(temp[this.py-1][this.px]==0){ //nord
            collision[0] = true;
        } else if(temp[this.py][this.px+1]==0){ //est
            collision[1] = true;
        } else if(temp[this.py+1][this.px]==0){ //sud
            collision[2] = true;
        } else if(temp[this.py][this.px+1]==0){ //ouest
            collision[3] = true;
        }

        return collision;
    }

}
