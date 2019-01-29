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
    /**
     * En fonction du choix, effectue les actions propres Ã  la classe du joueur Rodeur
     * Tir à  l'Arc ou Concentration
     *
     * @param choix
     *      choix de l'action
     * @see Mage#jouer(int)
     * @see Joueur#jouer(int)
     * @see Guerrier#jouer(int)
     * @return phrase de l'action
     */
    @Override
    protected String jouer(int choix) {
        String phrase = "";
        switch (choix) {
            case 1:
                adversaire.enleverVie(agilite);
                phrase = phrase + nom + " utilise Tir à l'Arc et inflige " + agilite + " de dÃ©gÃ¢ts";
                break;
            case 2:
                agilite = agilite + (niveau / 2);
                phrase = phrase + nom + " utilise Concentration et gagne " + (niveau / 2) + " d'agilité";

                break;
            default:
                break;
        }
        return phrase;
    }

}
