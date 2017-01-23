package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

public class Regles {

    public  boolean pacmanMort(Joueur joueur, Fantome [] tabFantomes) {
        // Methode retournant un bool si pacman rentre en contact avec les fantomes

        boolean mort = false;
        int px_joueur = joueur.getX(), py_joueur = joueur.getY();
        int px, py;
        for (Fantome f : tabFantomes) {
            px = f.getX();
            py = f.getY();
            if (px_joueur == px && py == py_joueur && joueur.isInvicible()) {
                mort = true;
            }
        }
        return mort;
    }

    public  void modifImageFantome(Joueur joueur,Fantome [] tabFantomes){
        if (joueur.isInvicible()){
            for (Fantome f : tabFantomes){
                f.setImage("fantome_PLS.jpg");
            }
        } else{
            for(Fantome f : tabFantomes){
                switch (f.getCouleur()){
                    case "RED":
                        f.setImage("ready.png");
                        break;
                    case "PINK":
                        f.setImage("pinkie.jpg");
                        break;
                    case "BLUE":
                        f.setImage("bleue.png");
                        break;
                    case "ORANGE":
                        f.setImage("yellowie.png");
                        break;

                }
            }
        }
    }

    public  void checkInvicibilite(Joueur joueur){
        //methode qui permet de remettre les pendules à zero
        //éwé les fantomes veulent leur vengeance
        long currentTime = System.currentTimeMillis();
        if (joueur.getInvincibleBegin()+10000<=currentTime ){
            joueur.setInvicible(false);
        }
    }

    public  void contact(Joueur joueur, Fantome [] tabFantomes){
        /* méthode qui constituera toute la partie collision fantome-pacman
           capable de TP le pacman ou les fantomes
           timer, invincibilité toussa toussa
        */
        boolean collision;

        int px_joueur = joueur.getX(), py_joueur = joueur.getY();
        int px,py;

        for (Fantome f : tabFantomes) {
            collision = false;
            //Prend la position d'un fantome du tableau tabFantomes
            px = f.getX();
            py = f.getY();
            if (px_joueur == px && py == py_joueur) {
                collision = true;
            }
            if (collision && joueur.isInvicible()){
                // là, le fantome est grillay
                joueur.addScore(200);
                f.tpDepart();
            } else if( collision && !joueur.isInvicible()){
                //là par contre c'est la merde pour toi
                joueur.subNbVie();
                joueur.tpDepart();
            }
        }
    }

    public  int endDuGame(Joueur joueur){
        /*
        0 si non
        1 si fin par mort du pacman, aka plus de vie
        9000 si fin par épuisement des ressources, aka win
        */
        int fin = 0;
        if(joueur.getNbVie()<=0)fin=1;
        if(joueur.getCompteur() == 234)fin=9000;
        return fin;
    }

}
