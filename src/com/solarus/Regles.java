package com.solarus;

public class Regles {

    public  boolean pacmanMort(Pacman pacman, Fantome [] tabFantomes) {
        // Methode retournant un bool si pacman rentre en contact avec les fantomes

        boolean mort = false;
        int px_joueur = pacman.getX(), py_joueur = pacman.getY();
        int px, py;
        for (Fantome f : tabFantomes) {
            px = f.getX();
            py = f.getY();
            if (px_joueur == px && py == py_joueur && pacman.isInvicible()) {
                mort = true;
            }
        }
        return mort;
    }

    public  void modifImageFantome(Pacman pacman, Fantome [] tabFantomes){
        if (pacman.isInvicible()){
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

    public  void checkInvicibilite(Pacman pacman){
        //methode qui permet de remettre les pendules à zero
        //éwé les fantomes veulent leur vengeance
        long currentTime = System.currentTimeMillis();
        if (pacman.getInvincibleBegin()+10000<=currentTime ){ // Ici les 10000 indiquent le teps en invincibilité
            pacman.setInvicible(false);
        }
    }

    public  void contact(Pacman pacman, Fantome [] tabFantomes){
        /* méthode qui constituera toute la partie collision fantome-pacman
           capable de TP le pacman ou les fantomes
           timer, invincibilité toussa toussa
        */
        boolean collision;

        int px_joueur = pacman.getX(), py_joueur = pacman.getY();
        int px,py;

        for (Fantome f : tabFantomes) {
            collision = false;
            //Prend la position d'un fantome du tableau tabFantomes
            px = f.getX();
            py = f.getY();
            if (px_joueur == px && py == py_joueur) {
                collision = true;
            }
            if (collision && pacman.isInvicible()){
                // là, le fantome est grillay
                pacman.addScore(200);
                f.tpDepart();
            } else if( collision && !pacman.isInvicible()){
                //là par contre c'est la merde pour toi
                pacman.subNbVie();
                pacman.tpDepart();
            }
        }
    }

    public int endDuGame(Pacman pacman){
        /*
        0 si non
        1 si fin par mort du pacman, aka plus de vie
        9000 si fin par épuisement des ressources, aka win
        */
        int fin = 0;
        if(pacman.getNbVie()<=0)fin=1;
        if(pacman.getCompteur() == 233)fin=9000;
        return fin;
    }

}
