package com.ocr.amal;

public class Guerrier extends Joueur{


    /**
     * Constructeur du joueur Guerrier
     *
     * @param numJoueur
     *          numéro du joueur
     * @param force
     *          force du joueur
     * @param agilite
     *          agilité du joueur
     * @param intelligence
     *          intelligence du joueur
     */
    protected Guerrier(int numJoueur, int force, int agilite, int intelligence) {
        super(numJoueur, force, agilite, intelligence);
        type = "Guerrier";
        cri = "Wouarggg";
    }






}
