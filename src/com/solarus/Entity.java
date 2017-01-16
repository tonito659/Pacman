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
        Map pacmanMap = new Map();
        boolean [] collision = new boolean[4];
        int [][] temp = pacmanMap.getLabyrinthe();
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
    public boolean mouvement(int direction){
        // prend en paramètre 8,6,2,4 comme sur un pavé numérique,
        // 8 = Nord
        // 6 = Est
        // 2 = Sud
        // 4 = Ouest
        //indique avec true si un mouvement a été effectué, false sinon
        boolean hasMoved = false;
        boolean [] collisions = this.collisionsPossibles();
        switch (direction){
            case 8:
                if (!collisions[0]){
                    setY(this.py+1);
                    hasMoved = true;
                }
                break;
            case 6:
                if (!collisions[1]){
                    setX(this.px+1);
                    hasMoved = true;
                }
                break;

            case 2:
                if (!collisions[2]){
                    setY(this.py-1);
                    hasMoved = true;
                }
                break;
            case 4:
                if (!collisions[3]){
                    setX(this.px-1);
                    hasMoved = true;
                }
                break;

        }
        return hasMoved;
    }
}
