package com.ocr.amal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int numJoueur = 1;
        Joueur joueur1 = creerJoueur(numJoueur);// crÃ©ation du premier joueur
        System.out.println(joueur1.toString());
        numJoueur++;
        Joueur joueur2 = creerJoueur(numJoueur);//crÃ©ation du second joueur
        System.out.println(joueur2.toString());
        joueur1.setAdversaire(joueur2);
        joueur2.setAdversaire(joueur1);
        joueur1.activeJoueur();//dÃ©but du jeu
    }


    /**
     * Retourne un joueur en le créant grace aux caractéristiques rentrés au clavier
     *
     * @param numJoueur
     *          numéro du joueur
     * @return Joueur crÃ©Ã© grace au caractéristiques données au clavier
     */
    private static Joueur creerJoueur(int numJoueur) {
        Joueur j;
        int type, niveau, force, agilite, intelligence;
        System.out.println("Création du personnage du Joueur " + numJoueur);
        type = demande("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rodeur, 3 : Mage)", 1, 3);
        do {
            niveau = demande("Niveau du personnage ?", 1);
            force = demande("Force du personnage ?", 0);
            agilite = demande("Agilité du personnage ?", 0);
            intelligence = demande("Intelligence du personnage ?", 0);
            if (force + agilite + intelligence != niveau) {
                System.out.println("Attention le total force + agilité + intelligence doit étre égal au niveau du joueur.");
            }
        } while (force + agilite + intelligence != niveau);
        switch (type) {
            case 1:
                j = new Guerrier(numJoueur, force, agilite, intelligence);
                break;
            case 2:
                j = new Rodeur(numJoueur, force, agilite, intelligence);
                break;
            case 3:
                j = new Mage(numJoueur, force, agilite, intelligence);
                break;
            default:
                j = new Mage(numJoueur, force, agilite, intelligence);
                break;
        }
        return j;
    }


    /**
     * Effectue une demande et retourne la réponse numérique
     *
     * @param str la demande Ã  faire
     * @param min valeur minimale du choix
     * @return le choix fait par l'utilisateur
     */
    public static int demande(String str, int min) {
        int choix;
        boolean choixCorrect;
        Scanner sc = new Scanner(System.in);
        do {
            choix = 0;
            System.out.println(str);
            try {
                choixCorrect = true;
                choix = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                choixCorrect = false;
            }
            if (choixCorrect) {
                if (!(choix >= min)) choixCorrect = false;
            }
        } while (!choixCorrect);
        return choix;
    }


    /**
     * Effectue une demande et retourne la réponse
     *
     * @param str la demande Ã  faire
     * @param min valeur minimale du choix
     * @param max valeur maximale du choix
     * @return le choix fait par l'utilisateur
     */
    public static int demande(String str, int min, int max) {
        int choix;
        do {
            choix = demande(str, min);
        } while (choix > max);
        return choix;
    }




    }

