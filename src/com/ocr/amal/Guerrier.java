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


    /**
     * En fonction du choix, effectue les actions propres à  la classe du joueur Guerrier
     *  Coup d’Épée ou Coup de rage
     *
     * @param choix
     *      choix de l'action
     * @see Mage#jouer(int)
     * @see Joueur#jouer(int)
     * @see Rodeur#jouer(int)
     * @return phrase de l'action
     */
    @Override
    protected String jouer(int choix) {
        String phrase = "";
        switch (choix) {
            case 1:
                adversaire.enleverVie(force);
                phrase = phrase + nom + " utilise Coup d'Ã©pÃ©e et inflige " + force + " de dÃ©gÃ¢ts";
                break;
            case 2:
                adversaire.enleverVie((force * 2));
                vie = vie - force / 2;
                phrase = phrase + nom + " utilise Coup de rage, inflige " + (force * 2) + " de dÃ©gÃ¢ts et perd " + (force / 2) + " de vitalitÃ©";
                break;
            default:
                break;
        }
        if (vie > 0) {
            return phrase;
        } else {
            return "Le " + nom + " n'a plus de vie, il a perdu !";
        }

    }



}
