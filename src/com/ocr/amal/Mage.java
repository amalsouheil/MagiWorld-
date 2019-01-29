package com.ocr.amal;

public class Mage extends Joueur{


    /**
     * la Vie maximale du joueur mage, donnée lors de la création du joueur
     */
    private int vieMax;

    /**
     * Constructeur du joueur Mage
     *
     * @param numJoueur    numéro du joueur
     * @param force        force du joueur
     * @param agilite      agilité du joueur
     * @param intelligence intelligence du joueur
     */
    public Mage(int numJoueur, int force, int agilite, int intelligence) {
        super(numJoueur, force, agilite, intelligence);
        vieMax = vie;
        type = "Mage";
        cri = "Abracadabraaa";
    }

}
