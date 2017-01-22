package com.solarus;

import edu.princeton.cs.introcs.StdDraw;

/**
 * Created by Antoine on 20/01/2017.
 * CLasse qui comporte les caractéristiques du jeu
 * ie, tout le
 *
 */
public class Regles {


    public static boolean pacmanMort(Joueur joueur, Fantome [] tabl) {
        // Methode retournant un bool si pacman rentre en contact avec les fantomes

        boolean mort = false;
        int px_joueur = joueur.getX(), py_joueur = joueur.getY();
        int px, py;
        for (Fantome f : tabl) {
            px = f.getX();
            py = f.getY();
            if (px_joueur == px && py == py_joueur && joueur.isInvicible()) {
                mort = true;
            }
        }
        return mort;
    }

    public static void modifImageFantome(Joueur j,Fantome [] tablef){
        if (j.isInvicible()){
            for (Fantome f : tablef){
                f.setImage("fantome_PLS.jpg");
            }
        } else{
            for(Fantome f : tablef){
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

    public static void checkInvicibilite(Joueur j){
        //methode qui permet de remettre les pendules à zero
        //éwé les fantomes veulent leur vengeance

        long currentTime = System.currentTimeMillis();
        if (j.getInvincibleBegin()+10000<=currentTime ){
            j.setInvicible(false);
        }
    }

    public static void contact(Joueur j, Fantome [] tablef){
        /* méthode qui constituera toute la partie collision fantome-pacman
           capable de TP le pacman ou les fantomes
           timer, invincibilité toussa toussa
        */
        boolean mort = pacmanMort(j, tablef);
        boolean collision;

        int px_joueur = j.getX(), py_joueur = j.getY();
        int px,py;

        for (Fantome f : tablef) {
            collision = false;
            px = f.getX();
            py = f.getY();
            if (px_joueur == px && py == py_joueur) {
                collision = true;
            }
            if (collision && j.isInvicible()){
                // là, le fantome est grillay
                j.addScore(200);
                f.tpDepart();
            } else if( collision && !j.isInvicible()){
                //là par contre c'est la mayrde pour toi
                j.subNbVie();
                j.tpDepart();
            }
        }
    }
    public static int endDuGame(Joueur j, Fantome [] f){
        /*
        0 si non
        1 si fin par mort du pacman, aka plus de vie
        9000 si fin par épuisement des ressources, aka win
        */
        int fin = 0;
        if(j.getNbVie()<=0)fin=1;
        if(j.getCompteur() == 234)fin=9000;

        return fin;
    }

}
