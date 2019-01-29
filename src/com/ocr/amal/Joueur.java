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


    /**
     * dÃ©but du tour du joueur. VÃ©rifie qu'il a encore de la vie pour jouer sinon fin du jeu
     */
    public void activeJoueur() {
        int choix;
        if (vie > 0) {
            do {
                choix = Main.demande(nom + " (" + vie + " vitalitÃ©), veuillez choisir votre action (1 : attaque basique, 2 : attaque spÃ©ciale)", 1, 2);
                if (choix != 1 && choix != 2) System.out.println("Entrez une valeur correcte !");
            } while (choix != 1 && choix != 2);

            System.out.println(this.jouer(choix));
            if (vie <= 0) return;
            this.adversaire.activeJoueur();
        } else {
            System.out.println("Le " + nom + " Ã  perdu !");
        }
    }

    /**
     * pour enlever des points de vie Ã  l'adversaire
     * @param pointsAEnlever
     *          nombre de points de vie Ã  enlever Ã  l'adversaire
     */
    protected void enleverVie(int pointsAEnlever) {
        vie = vie - pointsAEnlever;
    }

    /**
     * En fonction du choix, effectue les actions propres à  la classe du joueur
     *
     * @param choix
     *      choix de l'action
     * @see Mage#jouer(int)
     * @see Guerrier#jouer(int)
     * @see Rodeur#jouer(int)
     * @return rÃ©sultat de l'attaque
     */
    protected abstract String jouer(int choix);

    /**
     * désigne l'adversaire du joueur
     * @param adversaire
     *      Joueur  désigner comme adversaire
     */
    public void setAdversaire(Joueur adversaire) {
        this.adversaire = adversaire;
    }

    /**
     * retourne la description du joueur
     * @return phrase de description
     */
    public String toString() {
        return cri + " ! Je suis le " + type + ", " + nom + ", niveau " + niveau + ", je possÃ¨de " + vie + " de vitalitÃ©, " + force + " de force, " + agilite + " d'agilitÃ© et " + intelligence + " d'intelligence.";
    }


}



