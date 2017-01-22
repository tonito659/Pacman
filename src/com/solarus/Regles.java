package com.solarus;

/**
 * Created by Antoine on 20/01/2017.
 */
public class Regles {

    //TODO : ajouter une methode pour remettre les fantomes en invicible au bout de 10 secondes

    public static boolean pacmanMort(Joueur joueur, Fantome fr, Fantome fb, Fantome fo, Fantome fro) {
        // Methode retournant un bool si pacman rentre en contact avec les fantomes

        boolean mort = false;
        int px_joueur = joueur.getX(), py_joueur = joueur.getY();
        int px, py;
        Fantome[] array = {fr, fb, fo, fro}; // Pour economiser des lignes de code
        for (Fantome f : array) {
            px = f.getX();
            py = f.getY();
            if (px_joueur == px && py == py_joueur && f.isInvicible()) {
                mort = true;
                joueur.setX(14);
                joueur.setY(7);
            }
        }
        return mort;
    }



}
