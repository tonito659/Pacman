package com.solarus;

/**
 * Created by Antoine on 20/01/2017.
 */
public class Regles {

    //TODO : ajouter une methode pour remettre les fantomes en invicible au bout de 10 secondes

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

    public static void modifImageFantome(Fantome [] f){

    }
}
