package com.solarus;


public class Entity {

    protected int px, py, px_orig, py_orig;

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

    public int getPx_orig() {return px_orig;}

    public int getPy_orig() {return py_orig;}

    //TODO : implementer les deplacements au niveau de la classe entité

    public Entity(int px, int py){
        this.px = px;
        this.py = py;
        this.px_orig = px;
        this.py_orig = py;
    }

    public void transfertBord(){
        // DO YOU EVEN TP BRO ?
        // INSTANT TP OMGHAXX
        if(this.px == 0 && this.py == 16){
            px=26;
        } else if (this.px == 26 && this.py == 16){
            px=1;
        }
    }

    public boolean [] collisionsPossibles(){
        //indique les collisions, dans l'ordre : N, E, S, O
        Map pacmanMap = new Map();
        boolean [] collision = new boolean[4];
        int [][] temp = pacmanMap.getLabyrinthe();
        if(temp[ (this.py+1)][ this.px]==0||temp[ (this.py+1)][ this.px]==4 ||temp[ (this.py+1)][ this.px]==5){ //nord
            collision[0] = true;
        }
        if(temp[this.py][this.px+1]==0 || temp[this.py][this.px+1]==4 ||temp[this.py][this.px+1]==5 ){ //est
            collision[1] = true;
        }
        if(temp[this.py-1][this.px]==0 ||temp[this.py-1][this.px]==4 || temp[this.py-1][this.px]==5){ //sud
            collision[2] = true;
        }
        if(temp[this.py][this.px-1]==0 ||temp[this.py][this.px-1]==4 || temp[this.py][this.px-1]==5){ //ouest
            collision[3] = true;
        }
        //System.out.println(collision[0]+"\t"+collision[1]+"\t"+collision[2]+"\t"+collision[3]);
        //System.out.println("X = "+ this.px+ "\t Y = "+ this.py);
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
        /*System.out.println("\t"+collisions[0]);
        System.out.println(collisions[3]+"\t"+collisions[1]);
        System.out.printf("\t"+collisions[2]);
        */
        return hasMoved;
    }

    public void tpDepart(){
        this.setY(this.getPy_orig());
        this.setX(this.getPx_orig());
    }
}
