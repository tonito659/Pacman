package com.solarus;


public class Entity {

    protected int positionX, positionY, positionXOrigine, positionYOrigine;

    public Entity(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
        this.positionXOrigine = positionX;
        this.positionYOrigine = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int x) {
        this.positionX = x;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int y) {
        this.positionY = y;
    }

    public int getpositionXOrigine() {return positionXOrigine;}

    public int getpositionYOrigine() {return positionYOrigine;}

    public void transfertBord(){
        // DO YOU EVEN TP BRO ?
        // INSTANT TP OMGHAXX
        if(this.positionX == 0 && this.positionY == 16){
            positionX =26;
        } else if (this.positionX == 26 && this.positionY == 16){
            positionX =1;
        }
    }

    public boolean [] collisionsPossibles(){
        //indique les collisions, dans l'ordre : N, E, S, O
        Map pacmanMap = new Map();
        boolean [] tabCollision = new boolean[4];
        int [][] temp = pacmanMap.getLabyrinthe();
        if(temp[ (this.positionY +1)][ this.positionX]==0||temp[ (this.positionY +1)][ this.positionX]==4 ||temp[ (this.positionY +1)][ this.positionX]==5){ //nord
            tabCollision[0] = true;
        }
        if(temp[this.positionY][this.positionX +1]==0 || temp[this.positionY][this.positionX +1]==4 ||temp[this.positionY][this.positionX +1]==5 ){ //est
            tabCollision[1] = true;
        }
        if(temp[this.positionY -1][this.positionX]==0 ||temp[this.positionY -1][this.positionX]==4 || temp[this.positionY -1][this.positionX]==5){ //sud
            tabCollision[2] = true;
        }
        if(temp[this.positionY][this.positionX -1]==0 ||temp[this.positionY][this.positionX -1]==4 || temp[this.positionY][this.positionX -1]==5){ //ouest
            tabCollision[3] = true;
        }
        //System.out.println(collision[0]+"\t"+collision[1]+"\t"+collision[2]+"\t"+collision[3]);
        //System.out.println("X = "+ this.positionX+ "\t Y = "+ this.positionY);
        return tabCollision;
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
                    setPositionY(this.positionY +1);
                    hasMoved = true;
                }
                break;
            case 6:
                if (!collisions[1]){
                    setPositionX(this.positionX +1);
                    hasMoved = true;
                }

                break;

            case 2:
                if (!collisions[2]){
                    setPositionY(this.positionY -1);
                    hasMoved = true;
                }
                break;
            case 4:
                if (!collisions[3]){
                    setPositionX(this.positionX -1);
                    hasMoved = true;
                }
                break;
        }
        return hasMoved;
    }

    public void tpDepart(){
        this.setPositionY(this.getpositionYOrigine());
        this.setPositionX(this.getpositionXOrigine());
    }
}
