package com.ocr.amal;


/**
 *  classe Joueur
 */
public abstract class Joueur {

    protected String nom, cri, type;
    protected int niveau, vie, force, agilite, intelligence;
    protected Joueur adversaire;

    /**
     * Constructeur de Joueur
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
    Joueur(int numJoueur, int force, int agilite, int intelligence) {
        nom = "Joueur " + numJoueur;
        niveau = force + agilite + intelligence;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        vie = niveau * 5;
    }

}



