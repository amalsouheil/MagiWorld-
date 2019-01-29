package com.ocr.amal;

public class Rodeur extends Joueur{



    /**
     * Constructeur du joueur Rodeur
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
    public Rodeur(int numJoueur, int force, int agilite, int intelligence) {
        super(numJoueur, force, agilite, intelligence);
        type = "Rodeur";
        cri = "Chuuut";

}


}
